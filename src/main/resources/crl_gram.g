grammar crl_gram;

options {

	language=Java;
	TokenLabelType=CommonToken;
	output=AST;
	ASTLabelType=CommonTree;
	//backtrack=true;
}


tokens
{	
	RULES;
	Constraint;
	Condition;
	No_condition;
	Conditions;
	Action;
	Actions;
	J_expr;
	Package;
	Imports;
	Import_item;
	Assignment;
	SetMarkAction;
	SetTextAction;
	SetIndentAction;
	SetValueAction;
	SetCategoryAction;
	SetParentAction;
	SplitAction;
	MergeAction;
	GroupAction;
	NewEntryAction;
	NewLabelAction;
	AddLabelAction;
	UpdateAction;
	PrintAction;
	IDENT;
	IDENT1;
	IDENT2;
	ADV_IDENT;
	ADV_IDENT1;
	ADV_IDENT2;
	STRING;
	INT;
	CATEGORY;
	LABEL;
}

/*@headers
{	
	package ru.icc.td.tabbyxl.crl2j.parsing;
}*/


//parser


crl
	:	package_stmt? import_stmt* crl_rule+ -> ^(Imports import_stmt*) ^(RULES crl_rule+)
	;
	
package_stmt
	:	'package' import_item
	;
	
	
import_stmt
	:	i=import_unit -> Import_item [$i.value]
	;
	
import_unit returns [String value]
@init{ $value=""; }
@after{ $value+=";"; }
	:	t=('import'|'package') { $value+=$t.text+" "; } t1=import_item { $value+=$t1.value; } ';'? EOL
	;
	
import_item returns [String value]
@init { $value=""; }
	: 	i1=Identifier { $value+=$i1.text; } ('.' i2=Identifier { $value+="."+$i2.text; })* ('.' '*' { $value+=".*"; })? //-> ^(IDENT Identifier1 Identifier2)
	;
	
crl_rule
	:	'rule #' J_int_literal useless? EOL
		'when' EOL 
		condition_unit+
		'then' EOL
		action+
		'end' EOL? -> ^(J_int_literal ^(Conditions condition_unit+) ^(Actions action+))
	;

condition_unit
	:	condition|no_condition
	;

condition
	:	query Identifier (':' constraint (',' constraint)* (',' assignment)* )? EOL 
		-> ^(Condition query Identifier constraint* assignment*)
	;
	
query
	:	'cell'|'entry'|'label'|'category'
	;
	
no_condition
	:	no_query (':' constraint (',' constraint)* )? EOL -> ^(No_condition no_query constraint*)
	;
	
no_query
	:	'no cells'|'no labels'|'no entries'|'no categories'
	;
	
constraint
	:	j_expr -> ^(Constraint j_expr)
	;
	
assignment
	:	Identifier ':' j_expr -> ^(Assignment ^(IDENT Identifier) ^(STRING j_expr))
	;
	
j_expr returns [String value]
@init{ $value=""; }
	:	 ( i= ~(','|'"'|':'|'to'|'of'|EOL) { $value+=$i.text; } )+
	;

action
	:	action_ EOL -> action_
	;
	
action_
	:	set_mark
		|set_text
		|set_indent
		|set_value
		|split
		|merge
		|new_label
		|add_label
		|set_category
		|set_parent
		|new_entry
		|group
		|c_print
		|update
	;
	
set_mark
	:	'set mark' j_expr 'to' Identifier -> ^('set mark' ^(IDENT Identifier) ^(STRING j_expr))
	;
	
set_text
	:	'set text' j_expr 'to' Identifier -> ^('set text' ^(IDENT Identifier) ^(STRING j_expr))
	;
	
set_indent
	:	'set indent' J_int_literal 'to' Identifier -> ^('set indent' ^(IDENT Identifier) ^(INT J_int_literal))
	;
	
split
	:	'split' Identifier -> ^('split' ^(IDENT Identifier))
	;
	
merge
	:	'merge' Identifier 'with' Identifier -> ^('merge' ^(IDENT1 Identifier) ^(IDENT2 Identifier))
	;
	
new_entry
	:	'new entry' Identifier ('as' j_expr)? -> ^('new entry' ^(IDENT Identifier) ^(STRING j_expr)? )
	;
	
set_value
	:	'set value' j_expr 'to' advanced_identifier -> ^('set value' ^(ADV_IDENT advanced_identifier) ^(STRING j_expr))
	;
	
set_category
	:	'set category' j_expr 'to' advanced_identifier -> ^('set category' ^(ADV_IDENT advanced_identifier) ^(CATEGORY j_expr))
	;
	
set_parent
	:	'set parent' advanced_identifier 'to' advanced_identifier -> ^('set parent' ^(ADV_IDENT1 advanced_identifier) ^(ADV_IDENT2 advanced_identifier))
	;
	
group
	:	'group' advanced_identifier 'with' advanced_identifier -> ^('group' ^(ADV_IDENT1 advanced_identifier) ^(ADV_IDENT2 advanced_identifier))
	;
	
add_label
	:	'add label' j_expr ('of' j_expr)? 'to' advanced_identifier -> ^('add label' ^(LABEL j_expr) ^(CATEGORY j_expr)? ^(ADV_IDENT advanced_identifier))
	;
	
new_label
	:	'new label' Identifier ('as' j_expr)? -> ^('new label' ^(IDENT Identifier) ^(STRING j_expr)?)
	;
	
update
	:	'update' advanced_identifier -> ^('update' ^(ADV_IDENT advanced_identifier))
	;
	
c_print
	:	('print'|'printf') j_expr -> ^(PrintAction j_expr)
	;

advanced_identifier	
	:	Identifier ('.' query id?)?
	;
//lexer
WS
	:	 (' '|'\t')+ { $channel=HIDDEN; } 
	;
//S	:	' '	;
EOL
	:	('\n'|'\r')+
	;
J_int_literal
	:	DIGIT+
	;
Other_literals
	:	'='|'!'|'?'|'|'|'>'|'<'|'=='|'>='|'<='|'!='|'+'|'-'|'*'|'/'|'%'|'^'|'&'
	;
Identifier
	:	('$'|'_'|LETTER|DIGIT)('$'|'_'|LETTER|DIGIT)*

	;
id
	:	'[' J_int_literal ']' -> J_int_literal
	;
String_lit
	:	'"' (.)* '"'
	;

Char_lit
	:	'\'' (.) '\''
	;
Breackits
	:	'('|')'
	;
/*lockonactive
	:	'lockonactive'
	
	;*/
	
useless
	:	'lock-on-active'|'no-loop true'|'no-loop false'
	;

fragment DIGIT
	:	'0'..'9'
	;
fragment LETTER
	:	'A'..'Z'|'a'..'z'
	;