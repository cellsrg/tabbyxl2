// $ANTLR null D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g 2019-12-15 11:53:22

package ru.icc.td.tabbyxl.crl2j.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class CRLParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACTION", "ACTIONS", "ASSIGNMENT", 
		"BRACKET", "CHAR", "COMMENT", "CONDITION", "CONDITIONS", "CONSTRAINT", 
		"CONSTRAINTS", "EOL", "ESC_SEQ", "EXPONENT", "EXPRESSION", "FLOAT", "HEX_DIGIT", 
		"ID", "IDENTIFIER", "IMPORT", "IMPORTS", "INT", "OCTAL_ESC", "OPERAND", 
		"OPERATOR", "QUERY", "RULE", "RULES", "STRING", "TYPE", "UNICODE_ESC", 
		"WS", "','", "'.'", "'.*'", "':'", "';'", "'add label'", "'as'", "'categories'", 
		"'category'", "'cell'", "'cells'", "'end'", "'entries'", "'entry'", "'group'", 
		"'import static'", "'label'", "'labels'", "'merge'", "'new entry'", "'new label'", 
		"'no'", "'of'", "'print'", "'printf'", "'rule #'", "'set category'", "'set indent'", 
		"'set parent'", "'set tag'", "'set text'", "'set value'", "'split'", "'then'", 
		"'to'", "'update'", "'when'", "'with'"
	};
	public static final int EOF=-1;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int T__52=52;
	public static final int T__53=53;
	public static final int T__54=54;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int T__57=57;
	public static final int T__58=58;
	public static final int T__59=59;
	public static final int T__60=60;
	public static final int T__61=61;
	public static final int T__62=62;
	public static final int T__63=63;
	public static final int T__64=64;
	public static final int T__65=65;
	public static final int T__66=66;
	public static final int T__67=67;
	public static final int T__68=68;
	public static final int T__69=69;
	public static final int T__70=70;
	public static final int T__71=71;
	public static final int T__72=72;
	public static final int ACTION=4;
	public static final int ACTIONS=5;
	public static final int ASSIGNMENT=6;
	public static final int BRACKET=7;
	public static final int CHAR=8;
	public static final int COMMENT=9;
	public static final int CONDITION=10;
	public static final int CONDITIONS=11;
	public static final int CONSTRAINT=12;
	public static final int CONSTRAINTS=13;
	public static final int EOL=14;
	public static final int ESC_SEQ=15;
	public static final int EXPONENT=16;
	public static final int EXPRESSION=17;
	public static final int FLOAT=18;
	public static final int HEX_DIGIT=19;
	public static final int ID=20;
	public static final int IDENTIFIER=21;
	public static final int IMPORT=22;
	public static final int IMPORTS=23;
	public static final int INT=24;
	public static final int OCTAL_ESC=25;
	public static final int OPERAND=26;
	public static final int OPERATOR=27;
	public static final int QUERY=28;
	public static final int RULE=29;
	public static final int RULES=30;
	public static final int STRING=31;
	public static final int TYPE=32;
	public static final int UNICODE_ESC=33;
	public static final int WS=34;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public CRLParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public CRLParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return CRLParser.tokenNames; }
	@Override public String getGrammarFileName() { return "D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g"; }


	public static class crl_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "crl"
	// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:41:1: crl : ( importing )* ( rule )* -> ^( IMPORTS ( importing )* ) ^( RULES ( rule )* ) ;
	public final CRLParser.crl_return crl() throws RecognitionException {
		CRLParser.crl_return retval = new CRLParser.crl_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope importing1 =null;
		ParserRuleReturnScope rule2 =null;

		RewriteRuleSubtreeStream stream_rule=new RewriteRuleSubtreeStream(adaptor,"rule rule");
		RewriteRuleSubtreeStream stream_importing=new RewriteRuleSubtreeStream(adaptor,"rule importing");

		try {
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:42:2: ( ( importing )* ( rule )* -> ^( IMPORTS ( importing )* ) ^( RULES ( rule )* ) )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:42:4: ( importing )* ( rule )*
			{
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:42:4: ( importing )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==50) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:42:4: importing
					{
					pushFollow(FOLLOW_importing_in_crl135);
					importing1=importing();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_importing.add(importing1.getTree());
					}
					break;

				default :
					break loop1;
				}
			}

			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:43:3: ( rule )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==60) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:43:3: rule
					{
					pushFollow(FOLLOW_rule_in_crl140);
					rule2=rule();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_rule.add(rule2.getTree());
					}
					break;

				default :
					break loop2;
				}
			}

			// AST REWRITE
			// elements: importing, rule
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 44:3: -> ^( IMPORTS ( importing )* ) ^( RULES ( rule )* )
			{
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:44:6: ^( IMPORTS ( importing )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IMPORTS, "IMPORTS"), root_1);
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:44:16: ( importing )*
				while ( stream_importing.hasNext() ) {
					adaptor.addChild(root_1, stream_importing.nextTree());
				}
				stream_importing.reset();

				adaptor.addChild(root_0, root_1);
				}

				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:44:28: ^( RULES ( rule )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RULES, "RULES"), root_1);
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:44:36: ( rule )*
				while ( stream_rule.hasNext() ) {
					adaptor.addChild(root_1, stream_rule.nextTree());
				}
				stream_rule.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "crl"


	protected static class importing_scope {
		String value;
	}
	protected Stack<importing_scope> importing_stack = new Stack<importing_scope>();

	public static class importing_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "importing"
	// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:47:1: importing : 'import static' id= ID ( '.' id= ID )* ( '.*' )? ( ';' )? EOL -> IMPORT[$importing::value] ;
	public final CRLParser.importing_return importing() throws RecognitionException {
		importing_stack.push(new importing_scope());
		CRLParser.importing_return retval = new CRLParser.importing_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonToken id=null;
		CommonToken string_literal3=null;
		CommonToken char_literal4=null;
		CommonToken string_literal5=null;
		CommonToken char_literal6=null;
		CommonToken EOL7=null;

		CommonTree id_tree=null;
		CommonTree string_literal3_tree=null;
		CommonTree char_literal4_tree=null;
		CommonTree string_literal5_tree=null;
		CommonTree char_literal6_tree=null;
		CommonTree EOL7_tree=null;
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_EOL=new RewriteRuleTokenStream(adaptor,"token EOL");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");

		 importing_stack.peek().value = "import static "; 
		try {
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:52:2: ( 'import static' id= ID ( '.' id= ID )* ( '.*' )? ( ';' )? EOL -> IMPORT[$importing::value] )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:52:4: 'import static' id= ID ( '.' id= ID )* ( '.*' )? ( ';' )? EOL
			{
			string_literal3=(CommonToken)match(input,50,FOLLOW_50_in_importing179); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_50.add(string_literal3);

			id=(CommonToken)match(input,ID,FOLLOW_ID_in_importing185); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(id);

			if ( state.backtracking==0 ) { importing_stack.peek().value+=(id!=null?id.getText():null); }
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:52:61: ( '.' id= ID )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==36) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:52:62: '.' id= ID
					{
					char_literal4=(CommonToken)match(input,36,FOLLOW_36_in_importing190); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_36.add(char_literal4);

					id=(CommonToken)match(input,ID,FOLLOW_ID_in_importing196); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ID.add(id);

					if ( state.backtracking==0 ) { importing_stack.peek().value+="."+(id!=null?id.getText():null); }
					}
					break;

				default :
					break loop3;
				}
			}

			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:52:114: ( '.*' )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==37) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:52:115: '.*'
					{
					string_literal5=(CommonToken)match(input,37,FOLLOW_37_in_importing204); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_37.add(string_literal5);

					if ( state.backtracking==0 ) { importing_stack.peek().value+=".*"; }
					}
					break;

			}

			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:52:151: ( ';' )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==39) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:52:151: ';'
					{
					char_literal6=(CommonToken)match(input,39,FOLLOW_39_in_importing210); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_39.add(char_literal6);

					}
					break;

			}

			EOL7=(CommonToken)match(input,EOL,FOLLOW_EOL_in_importing213); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EOL.add(EOL7);

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 53:3: -> IMPORT[$importing::value]
			{
				adaptor.addChild(root_0, (CommonTree)adaptor.create(IMPORT, importing_stack.peek().value));
			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			importing_stack.pop();
		}
		return retval;
	}
	// $ANTLR end "importing"


	public static class rule_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "rule"
	// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:56:1: rule : 'rule #' num= INT EOL 'when' EOL ( condition )* 'then' EOL ( action )* 'end' ( EOL )? -> ^( RULE[$num] ^( CONDITIONS ( condition )* ) ^( ACTIONS ( action )* ) ) ;
	public final CRLParser.rule_return rule() throws RecognitionException {
		CRLParser.rule_return retval = new CRLParser.rule_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonToken num=null;
		CommonToken string_literal8=null;
		CommonToken EOL9=null;
		CommonToken string_literal10=null;
		CommonToken EOL11=null;
		CommonToken string_literal13=null;
		CommonToken EOL14=null;
		CommonToken string_literal16=null;
		CommonToken EOL17=null;
		ParserRuleReturnScope condition12 =null;
		ParserRuleReturnScope action15 =null;

		CommonTree num_tree=null;
		CommonTree string_literal8_tree=null;
		CommonTree EOL9_tree=null;
		CommonTree string_literal10_tree=null;
		CommonTree EOL11_tree=null;
		CommonTree string_literal13_tree=null;
		CommonTree EOL14_tree=null;
		CommonTree string_literal16_tree=null;
		CommonTree EOL17_tree=null;
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleTokenStream stream_EOL=new RewriteRuleTokenStream(adaptor,"token EOL");
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
		RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
		RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
		RewriteRuleSubtreeStream stream_action=new RewriteRuleSubtreeStream(adaptor,"rule action");

		try {
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:57:2: ( 'rule #' num= INT EOL 'when' EOL ( condition )* 'then' EOL ( action )* 'end' ( EOL )? -> ^( RULE[$num] ^( CONDITIONS ( condition )* ) ^( ACTIONS ( action )* ) ) )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:57:4: 'rule #' num= INT EOL 'when' EOL ( condition )* 'then' EOL ( action )* 'end' ( EOL )?
			{
			string_literal8=(CommonToken)match(input,60,FOLLOW_60_in_rule235); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_60.add(string_literal8);

			num=(CommonToken)match(input,INT,FOLLOW_INT_in_rule239); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_INT.add(num);

			EOL9=(CommonToken)match(input,EOL,FOLLOW_EOL_in_rule241); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EOL.add(EOL9);

			string_literal10=(CommonToken)match(input,71,FOLLOW_71_in_rule245); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_71.add(string_literal10);

			EOL11=(CommonToken)match(input,EOL,FOLLOW_EOL_in_rule247); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EOL.add(EOL11);

			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:59:4: ( condition )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= 42 && LA6_0 <= 45)||(LA6_0 >= 47 && LA6_0 <= 48)||(LA6_0 >= 51 && LA6_0 <= 52)||LA6_0==56) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:59:4: condition
					{
					pushFollow(FOLLOW_condition_in_rule252);
					condition12=condition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_condition.add(condition12.getTree());
					}
					break;

				default :
					break loop6;
				}
			}

			string_literal13=(CommonToken)match(input,68,FOLLOW_68_in_rule257); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_68.add(string_literal13);

			EOL14=(CommonToken)match(input,EOL,FOLLOW_EOL_in_rule259); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EOL.add(EOL14);

			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:61:4: ( action )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==40||LA7_0==49||(LA7_0 >= 53 && LA7_0 <= 55)||(LA7_0 >= 58 && LA7_0 <= 59)||(LA7_0 >= 61 && LA7_0 <= 67)||LA7_0==70) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:61:4: action
					{
					pushFollow(FOLLOW_action_in_rule264);
					action15=action();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_action.add(action15.getTree());
					}
					break;

				default :
					break loop7;
				}
			}

			string_literal16=(CommonToken)match(input,46,FOLLOW_46_in_rule269); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_46.add(string_literal16);

			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:62:9: ( EOL )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==EOL) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:62:9: EOL
					{
					EOL17=(CommonToken)match(input,EOL,FOLLOW_EOL_in_rule271); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_EOL.add(EOL17);

					}
					break;

			}

			// AST REWRITE
			// elements: condition, action
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 63:3: -> ^( RULE[$num] ^( CONDITIONS ( condition )* ) ^( ACTIONS ( action )* ) )
			{
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:63:6: ^( RULE[$num] ^( CONDITIONS ( condition )* ) ^( ACTIONS ( action )* ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RULE, num), root_1);
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:63:19: ^( CONDITIONS ( condition )* )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONDITIONS, "CONDITIONS"), root_2);
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:63:32: ( condition )*
				while ( stream_condition.hasNext() ) {
					adaptor.addChild(root_2, stream_condition.nextTree());
				}
				stream_condition.reset();

				adaptor.addChild(root_1, root_2);
				}

				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:63:44: ^( ACTIONS ( action )* )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ACTIONS, "ACTIONS"), root_2);
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:63:54: ( action )*
				while ( stream_action.hasNext() ) {
					adaptor.addChild(root_2, stream_action.nextTree());
				}
				stream_action.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "rule"


	protected static class condition_scope {
		String quantifier;
		String id;
	}
	protected Stack<condition_scope> condition_stack = new Stack<condition_scope>();

	public static class condition_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "condition"
	// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:66:1: condition : ( 'no' )? query (idntfr= ID )? ( ':' ( ( constraint ( ',' constraint )* ( ',' assignment )? ) | assignment ) )? EOL -> ^( CONDITION TYPE[$condition::quantifier] query IDENTIFIER[$condition::id] ^( CONSTRAINTS ( ^( CONSTRAINT constraint ) )* ) ^( ASSIGNMENT ( assignment )? ) ) ;
	public final CRLParser.condition_return condition() throws RecognitionException {
		condition_stack.push(new condition_scope());
		CRLParser.condition_return retval = new CRLParser.condition_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonToken idntfr=null;
		CommonToken string_literal18=null;
		CommonToken char_literal20=null;
		CommonToken char_literal22=null;
		CommonToken char_literal24=null;
		CommonToken EOL27=null;
		ParserRuleReturnScope query19 =null;
		ParserRuleReturnScope constraint21 =null;
		ParserRuleReturnScope constraint23 =null;
		ParserRuleReturnScope assignment25 =null;
		ParserRuleReturnScope assignment26 =null;

		CommonTree idntfr_tree=null;
		CommonTree string_literal18_tree=null;
		CommonTree char_literal20_tree=null;
		CommonTree char_literal22_tree=null;
		CommonTree char_literal24_tree=null;
		CommonTree EOL27_tree=null;
		RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_EOL=new RewriteRuleTokenStream(adaptor,"token EOL");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_assignment=new RewriteRuleSubtreeStream(adaptor,"rule assignment");
		RewriteRuleSubtreeStream stream_query=new RewriteRuleSubtreeStream(adaptor,"rule query");
		RewriteRuleSubtreeStream stream_constraint=new RewriteRuleSubtreeStream(adaptor,"rule constraint");

		 
			condition_stack.peek().quantifier = "FOR_ALL";
			condition_stack.peek().id = null;

		try {
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:75:2: ( ( 'no' )? query (idntfr= ID )? ( ':' ( ( constraint ( ',' constraint )* ( ',' assignment )? ) | assignment ) )? EOL -> ^( CONDITION TYPE[$condition::quantifier] query IDENTIFIER[$condition::id] ^( CONSTRAINTS ( ^( CONSTRAINT constraint ) )* ) ^( ASSIGNMENT ( assignment )? ) ) )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:75:4: ( 'no' )? query (idntfr= ID )? ( ':' ( ( constraint ( ',' constraint )* ( ',' assignment )? ) | assignment ) )? EOL
			{
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:75:4: ( 'no' )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==56) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:75:5: 'no'
					{
					string_literal18=(CommonToken)match(input,56,FOLLOW_56_in_condition318); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_56.add(string_literal18);

					if ( state.backtracking==0 ) { condition_stack.peek().quantifier = "NOT_EXIST"; }
					}
					break;

			}

			pushFollow(FOLLOW_query_in_condition326);
			query19=query();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_query.add(query19.getTree());
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:77:3: (idntfr= ID )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==ID) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:77:5: idntfr= ID
					{
					idntfr=(CommonToken)match(input,ID,FOLLOW_ID_in_condition337); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ID.add(idntfr);

					if ( state.backtracking==0 ) { condition_stack.peek().id = (idntfr!=null?idntfr.getText():null); }
					}
					break;

			}

			if ( state.backtracking==0 ) { condition_stack.peek().id = ( (condition_stack.peek().id == null)? "null":condition_stack.peek().id ); }
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:78:3: ( ':' ( ( constraint ( ',' constraint )* ( ',' assignment )? ) | assignment ) )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==38) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:79:3: ':' ( ( constraint ( ',' constraint )* ( ',' assignment )? ) | assignment )
					{
					char_literal20=(CommonToken)match(input,38,FOLLOW_38_in_condition353); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_38.add(char_literal20);

					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:80:3: ( ( constraint ( ',' constraint )* ( ',' assignment )? ) | assignment )
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==ID) ) {
						int LA13_1 = input.LA(2);
						if ( (LA13_1==38) ) {
							alt13=2;
						}
						else if ( ((LA13_1 >= ACTION && LA13_1 <= 37)||(LA13_1 >= 39 && LA13_1 <= 72)) ) {
							alt13=1;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 13, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( ((LA13_0 >= ACTION && LA13_0 <= CONSTRAINTS)||(LA13_0 >= ESC_SEQ && LA13_0 <= HEX_DIGIT)||(LA13_0 >= IDENTIFIER && LA13_0 <= WS)||(LA13_0 >= 36 && LA13_0 <= 37)||(LA13_0 >= 39 && LA13_0 <= 72)) ) {
						alt13=1;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 13, 0, input);
						throw nvae;
					}

					switch (alt13) {
						case 1 :
							// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:80:5: ( constraint ( ',' constraint )* ( ',' assignment )? )
							{
							// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:80:5: ( constraint ( ',' constraint )* ( ',' assignment )? )
							// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:80:6: constraint ( ',' constraint )* ( ',' assignment )?
							{
							pushFollow(FOLLOW_constraint_in_condition361);
							constraint21=constraint();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_constraint.add(constraint21.getTree());
							// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:80:17: ( ',' constraint )*
							loop11:
							while (true) {
								int alt11=2;
								int LA11_0 = input.LA(1);
								if ( (LA11_0==35) ) {
									int LA11_1 = input.LA(2);
									if ( (LA11_1==ID) ) {
										int LA11_3 = input.LA(3);
										if ( ((LA11_3 >= ACTION && LA11_3 <= 37)||(LA11_3 >= 39 && LA11_3 <= 72)) ) {
											alt11=1;
										}

									}
									else if ( ((LA11_1 >= ACTION && LA11_1 <= CONSTRAINTS)||(LA11_1 >= ESC_SEQ && LA11_1 <= HEX_DIGIT)||(LA11_1 >= IDENTIFIER && LA11_1 <= WS)||(LA11_1 >= 36 && LA11_1 <= 37)||(LA11_1 >= 39 && LA11_1 <= 72)) ) {
										alt11=1;
									}

								}

								switch (alt11) {
								case 1 :
									// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:80:18: ',' constraint
									{
									char_literal22=(CommonToken)match(input,35,FOLLOW_35_in_condition364); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_35.add(char_literal22);

									pushFollow(FOLLOW_constraint_in_condition366);
									constraint23=constraint();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_constraint.add(constraint23.getTree());
									}
									break;

								default :
									break loop11;
								}
							}

							// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:80:35: ( ',' assignment )?
							int alt12=2;
							int LA12_0 = input.LA(1);
							if ( (LA12_0==35) ) {
								alt12=1;
							}
							switch (alt12) {
								case 1 :
									// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:80:36: ',' assignment
									{
									char_literal24=(CommonToken)match(input,35,FOLLOW_35_in_condition371); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_35.add(char_literal24);

									pushFollow(FOLLOW_assignment_in_condition373);
									assignment25=assignment();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_assignment.add(assignment25.getTree());
									}
									break;

							}

							}

							}
							break;
						case 2 :
							// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:80:57: assignment
							{
							pushFollow(FOLLOW_assignment_in_condition381);
							assignment26=assignment();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_assignment.add(assignment26.getTree());
							}
							break;

					}

					}
					break;

			}

			EOL27=(CommonToken)match(input,EOL,FOLLOW_EOL_in_condition390); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EOL.add(EOL27);

			// AST REWRITE
			// elements: query, assignment, constraint
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 82:3: -> ^( CONDITION TYPE[$condition::quantifier] query IDENTIFIER[$condition::id] ^( CONSTRAINTS ( ^( CONSTRAINT constraint ) )* ) ^( ASSIGNMENT ( assignment )? ) )
			{
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:82:6: ^( CONDITION TYPE[$condition::quantifier] query IDENTIFIER[$condition::id] ^( CONSTRAINTS ( ^( CONSTRAINT constraint ) )* ) ^( ASSIGNMENT ( assignment )? ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONDITION, "CONDITION"), root_1);
				adaptor.addChild(root_1, (CommonTree)adaptor.create(TYPE, condition_stack.peek().quantifier));
				adaptor.addChild(root_1, stream_query.nextTree());
				adaptor.addChild(root_1, (CommonTree)adaptor.create(IDENTIFIER, condition_stack.peek().id));
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:82:81: ^( CONSTRAINTS ( ^( CONSTRAINT constraint ) )* )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONSTRAINTS, "CONSTRAINTS"), root_2);
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:82:95: ( ^( CONSTRAINT constraint ) )*
				while ( stream_constraint.hasNext() ) {
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:82:95: ^( CONSTRAINT constraint )
					{
					CommonTree root_3 = (CommonTree)adaptor.nil();
					root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONSTRAINT, "CONSTRAINT"), root_3);
					adaptor.addChild(root_3, stream_constraint.nextTree());
					adaptor.addChild(root_2, root_3);
					}

				}
				stream_constraint.reset();

				adaptor.addChild(root_1, root_2);
				}

				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:82:122: ^( ASSIGNMENT ( assignment )? )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGNMENT, "ASSIGNMENT"), root_2);
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:82:135: ( assignment )?
				if ( stream_assignment.hasNext() ) {
					adaptor.addChild(root_2, stream_assignment.nextTree());
				}
				stream_assignment.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			condition_stack.pop();
		}
		return retval;
	}
	// $ANTLR end "condition"


	public static class query_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "query"
	// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:85:1: query : ( ( 'cell' | 'cells' ) -> QUERY[\"CCell\"] | ( 'label' | 'labels' ) -> QUERY[\"CLabel\"] | ( 'entry' | 'entries' ) -> QUERY[\"CEntry\"] | ( 'category' | 'categories' ) -> QUERY[\"CCategory\"] );
	public final CRLParser.query_return query() throws RecognitionException {
		CRLParser.query_return retval = new CRLParser.query_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonToken string_literal28=null;
		CommonToken string_literal29=null;
		CommonToken string_literal30=null;
		CommonToken string_literal31=null;
		CommonToken string_literal32=null;
		CommonToken string_literal33=null;
		CommonToken string_literal34=null;
		CommonToken string_literal35=null;

		CommonTree string_literal28_tree=null;
		CommonTree string_literal29_tree=null;
		CommonTree string_literal30_tree=null;
		CommonTree string_literal31_tree=null;
		CommonTree string_literal32_tree=null;
		CommonTree string_literal33_tree=null;
		CommonTree string_literal34_tree=null;
		CommonTree string_literal35_tree=null;
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");

		try {
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:86:2: ( ( 'cell' | 'cells' ) -> QUERY[\"CCell\"] | ( 'label' | 'labels' ) -> QUERY[\"CLabel\"] | ( 'entry' | 'entries' ) -> QUERY[\"CEntry\"] | ( 'category' | 'categories' ) -> QUERY[\"CCategory\"] )
			int alt19=4;
			switch ( input.LA(1) ) {
			case 44:
			case 45:
				{
				alt19=1;
				}
				break;
			case 51:
			case 52:
				{
				alt19=2;
				}
				break;
			case 47:
			case 48:
				{
				alt19=3;
				}
				break;
			case 42:
			case 43:
				{
				alt19=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}
			switch (alt19) {
				case 1 :
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:86:4: ( 'cell' | 'cells' )
					{
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:86:4: ( 'cell' | 'cells' )
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==44) ) {
						alt15=1;
					}
					else if ( (LA15_0==45) ) {
						alt15=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 15, 0, input);
						throw nvae;
					}

					switch (alt15) {
						case 1 :
							// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:86:5: 'cell'
							{
							string_literal28=(CommonToken)match(input,44,FOLLOW_44_in_query439); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_44.add(string_literal28);

							}
							break;
						case 2 :
							// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:86:12: 'cells'
							{
							string_literal29=(CommonToken)match(input,45,FOLLOW_45_in_query441); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_45.add(string_literal29);

							}
							break;

					}

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 86:21: -> QUERY[\"CCell\"]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(QUERY, "CCell"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:87:4: ( 'label' | 'labels' )
					{
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:87:4: ( 'label' | 'labels' )
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==51) ) {
						alt16=1;
					}
					else if ( (LA16_0==52) ) {
						alt16=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 16, 0, input);
						throw nvae;
					}

					switch (alt16) {
						case 1 :
							// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:87:5: 'label'
							{
							string_literal30=(CommonToken)match(input,51,FOLLOW_51_in_query453); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_51.add(string_literal30);

							}
							break;
						case 2 :
							// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:87:13: 'labels'
							{
							string_literal31=(CommonToken)match(input,52,FOLLOW_52_in_query455); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_52.add(string_literal31);

							}
							break;

					}

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 87:23: -> QUERY[\"CLabel\"]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(QUERY, "CLabel"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:88:4: ( 'entry' | 'entries' )
					{
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:88:4: ( 'entry' | 'entries' )
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==48) ) {
						alt17=1;
					}
					else if ( (LA17_0==47) ) {
						alt17=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 17, 0, input);
						throw nvae;
					}

					switch (alt17) {
						case 1 :
							// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:88:5: 'entry'
							{
							string_literal32=(CommonToken)match(input,48,FOLLOW_48_in_query467); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_48.add(string_literal32);

							}
							break;
						case 2 :
							// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:88:13: 'entries'
							{
							string_literal33=(CommonToken)match(input,47,FOLLOW_47_in_query469); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_47.add(string_literal33);

							}
							break;

					}

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 88:24: -> QUERY[\"CEntry\"]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(QUERY, "CEntry"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:89:4: ( 'category' | 'categories' )
					{
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:89:4: ( 'category' | 'categories' )
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==43) ) {
						alt18=1;
					}
					else if ( (LA18_0==42) ) {
						alt18=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 18, 0, input);
						throw nvae;
					}

					switch (alt18) {
						case 1 :
							// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:89:5: 'category'
							{
							string_literal34=(CommonToken)match(input,43,FOLLOW_43_in_query481); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_43.add(string_literal34);

							}
							break;
						case 2 :
							// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:89:16: 'categories'
							{
							string_literal35=(CommonToken)match(input,42,FOLLOW_42_in_query483); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_42.add(string_literal35);

							}
							break;

					}

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 89:30: -> QUERY[\"CCategory\"]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(QUERY, "CCategory"));
					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "query"


	public static class constraint_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "constraint"
	// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:92:1: constraint : (~ ( ',' | EOL | ':' ) )+ ;
	public final CRLParser.constraint_return constraint() throws RecognitionException {
		CRLParser.constraint_return retval = new CRLParser.constraint_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonToken set36=null;

		CommonTree set36_tree=null;

		try {
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:93:2: ( (~ ( ',' | EOL | ':' ) )+ )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:93:4: (~ ( ',' | EOL | ':' ) )+
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:93:4: (~ ( ',' | EOL | ':' ) )+
			int cnt20=0;
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( ((LA20_0 >= ACTION && LA20_0 <= CONSTRAINTS)||(LA20_0 >= ESC_SEQ && LA20_0 <= WS)||(LA20_0 >= 36 && LA20_0 <= 37)||(LA20_0 >= 39 && LA20_0 <= 72)) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:
					{
					set36=(CommonToken)input.LT(1);
					if ( (input.LA(1) >= ACTION && input.LA(1) <= CONSTRAINTS)||(input.LA(1) >= ESC_SEQ && input.LA(1) <= WS)||(input.LA(1) >= 36 && input.LA(1) <= 37)||(input.LA(1) >= 39 && input.LA(1) <= 72) ) {
						input.consume();
						if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set36));
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt20 >= 1 ) break loop20;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(20, input);
					throw eee;
				}
				cnt20++;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constraint"


	public static class assignment_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "assignment"
	// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:96:1: assignment : id= ID ':' expression -> IDENTIFIER[$id] ^( EXPRESSION expression ) ;
	public final CRLParser.assignment_return assignment() throws RecognitionException {
		CRLParser.assignment_return retval = new CRLParser.assignment_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonToken id=null;
		CommonToken char_literal37=null;
		ParserRuleReturnScope expression38 =null;

		CommonTree id_tree=null;
		CommonTree char_literal37_tree=null;
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:97:2: (id= ID ':' expression -> IDENTIFIER[$id] ^( EXPRESSION expression ) )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:97:4: id= ID ':' expression
			{
			id=(CommonToken)match(input,ID,FOLLOW_ID_in_assignment527); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(id);

			char_literal37=(CommonToken)match(input,38,FOLLOW_38_in_assignment529); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_38.add(char_literal37);

			pushFollow(FOLLOW_expression_in_assignment531);
			expression38=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression38.getTree());
			// AST REWRITE
			// elements: expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 98:3: -> IDENTIFIER[$id] ^( EXPRESSION expression )
			{
				adaptor.addChild(root_0, (CommonTree)adaptor.create(IDENTIFIER, id));
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:98:22: ^( EXPRESSION expression )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPRESSION, "EXPRESSION"), root_1);
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignment"


	public static class expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:101:1: expression : ( ESC_SEQ |~ ( EOL ) )+ ;
	public final CRLParser.expression_return expression() throws RecognitionException {
		CRLParser.expression_return retval = new CRLParser.expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonToken set39=null;

		CommonTree set39_tree=null;

		try {
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:102:2: ( ( ESC_SEQ |~ ( EOL ) )+ )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:102:4: ( ESC_SEQ |~ ( EOL ) )+
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:102:4: ( ESC_SEQ |~ ( EOL ) )+
			int cnt21=0;
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( ((LA21_0 >= ACTION && LA21_0 <= CONSTRAINTS)||(LA21_0 >= ESC_SEQ && LA21_0 <= 72)) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:
					{
					set39=(CommonToken)input.LT(1);
					if ( (input.LA(1) >= ACTION && input.LA(1) <= CONSTRAINTS)||(input.LA(1) >= ESC_SEQ && input.LA(1) <= 72) ) {
						input.consume();
						if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set39));
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt21 >= 1 ) break loop21;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(21, input);
					throw eee;
				}
				cnt21++;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class action_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "action"
	// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:105:1: action : ( set_tag | set_text | set_indent | split | merge | new_entry | set_value | set_category | set_parent | group | add_label | new_label | update | print );
	public final CRLParser.action_return action() throws RecognitionException {
		CRLParser.action_return retval = new CRLParser.action_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope set_tag40 =null;
		ParserRuleReturnScope set_text41 =null;
		ParserRuleReturnScope set_indent42 =null;
		ParserRuleReturnScope split43 =null;
		ParserRuleReturnScope merge44 =null;
		ParserRuleReturnScope new_entry45 =null;
		ParserRuleReturnScope set_value46 =null;
		ParserRuleReturnScope set_category47 =null;
		ParserRuleReturnScope set_parent48 =null;
		ParserRuleReturnScope group49 =null;
		ParserRuleReturnScope add_label50 =null;
		ParserRuleReturnScope new_label51 =null;
		ParserRuleReturnScope update52 =null;
		ParserRuleReturnScope print53 =null;


		try {
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:106:2: ( set_tag | set_text | set_indent | split | merge | new_entry | set_value | set_category | set_parent | group | add_label | new_label | update | print )
			int alt22=14;
			switch ( input.LA(1) ) {
			case 64:
				{
				alt22=1;
				}
				break;
			case 65:
				{
				alt22=2;
				}
				break;
			case 62:
				{
				alt22=3;
				}
				break;
			case 67:
				{
				alt22=4;
				}
				break;
			case 53:
				{
				alt22=5;
				}
				break;
			case 54:
				{
				alt22=6;
				}
				break;
			case 66:
				{
				alt22=7;
				}
				break;
			case 61:
				{
				alt22=8;
				}
				break;
			case 63:
				{
				alt22=9;
				}
				break;
			case 49:
				{
				alt22=10;
				}
				break;
			case 40:
				{
				alt22=11;
				}
				break;
			case 55:
				{
				alt22=12;
				}
				break;
			case 70:
				{
				alt22=13;
				}
				break;
			case 58:
			case 59:
				{
				alt22=14;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}
			switch (alt22) {
				case 1 :
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:106:4: set_tag
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_set_tag_in_action579);
					set_tag40=set_tag();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, set_tag40.getTree());

					}
					break;
				case 2 :
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:107:4: set_text
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_set_text_in_action584);
					set_text41=set_text();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, set_text41.getTree());

					}
					break;
				case 3 :
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:108:4: set_indent
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_set_indent_in_action589);
					set_indent42=set_indent();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, set_indent42.getTree());

					}
					break;
				case 4 :
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:109:4: split
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_split_in_action594);
					split43=split();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, split43.getTree());

					}
					break;
				case 5 :
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:110:4: merge
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_merge_in_action599);
					merge44=merge();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, merge44.getTree());

					}
					break;
				case 6 :
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:111:4: new_entry
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_new_entry_in_action604);
					new_entry45=new_entry();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, new_entry45.getTree());

					}
					break;
				case 7 :
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:112:4: set_value
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_set_value_in_action609);
					set_value46=set_value();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, set_value46.getTree());

					}
					break;
				case 8 :
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:113:4: set_category
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_set_category_in_action614);
					set_category47=set_category();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, set_category47.getTree());

					}
					break;
				case 9 :
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:114:4: set_parent
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_set_parent_in_action619);
					set_parent48=set_parent();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, set_parent48.getTree());

					}
					break;
				case 10 :
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:115:4: group
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_group_in_action624);
					group49=group();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, group49.getTree());

					}
					break;
				case 11 :
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:116:4: add_label
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_add_label_in_action629);
					add_label50=add_label();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, add_label50.getTree());

					}
					break;
				case 12 :
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:117:4: new_label
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_new_label_in_action634);
					new_label51=new_label();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, new_label51.getTree());

					}
					break;
				case 13 :
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:118:4: update
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_update_in_action639);
					update52=update();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, update52.getTree());

					}
					break;
				case 14 :
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:119:4: print
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_print_in_action644);
					print53=print();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, print53.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "action"


	public static class operand_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "operand"
	// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:122:1: operand : ( STRING | ESC_SEQ |~ ( 'to' | 'with' | 'as' | 'of' | EOL ) )+ ;
	public final CRLParser.operand_return operand() throws RecognitionException {
		CRLParser.operand_return retval = new CRLParser.operand_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonToken set54=null;

		CommonTree set54_tree=null;

		try {
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:123:2: ( ( STRING | ESC_SEQ |~ ( 'to' | 'with' | 'as' | 'of' | EOL ) )+ )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:123:4: ( STRING | ESC_SEQ |~ ( 'to' | 'with' | 'as' | 'of' | EOL ) )+
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:123:4: ( STRING | ESC_SEQ |~ ( 'to' | 'with' | 'as' | 'of' | EOL ) )+
			int cnt23=0;
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( ((LA23_0 >= ACTION && LA23_0 <= CONSTRAINTS)||(LA23_0 >= ESC_SEQ && LA23_0 <= 40)||(LA23_0 >= 42 && LA23_0 <= 56)||(LA23_0 >= 58 && LA23_0 <= 68)||(LA23_0 >= 70 && LA23_0 <= 71)) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:
					{
					set54=(CommonToken)input.LT(1);
					if ( (input.LA(1) >= ACTION && input.LA(1) <= CONSTRAINTS)||(input.LA(1) >= ESC_SEQ && input.LA(1) <= 40)||(input.LA(1) >= 42 && input.LA(1) <= 56)||(input.LA(1) >= 58 && input.LA(1) <= 68)||(input.LA(1) >= 70 && input.LA(1) <= 71) ) {
						input.consume();
						if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set54));
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt23 >= 1 ) break loop23;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(23, input);
					throw eee;
				}
				cnt23++;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "operand"


	public static class set_tag_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "set_tag"
	// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:126:1: set_tag : 'set tag' op1= operand 'to' op2= operand EOL -> ^( ACTION[\"setTag\"] ^( OPERAND $op2) ^( OPERAND $op1) ) ;
	public final CRLParser.set_tag_return set_tag() throws RecognitionException {
		CRLParser.set_tag_return retval = new CRLParser.set_tag_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonToken string_literal55=null;
		CommonToken string_literal56=null;
		CommonToken EOL57=null;
		ParserRuleReturnScope op1 =null;
		ParserRuleReturnScope op2 =null;

		CommonTree string_literal55_tree=null;
		CommonTree string_literal56_tree=null;
		CommonTree EOL57_tree=null;
		RewriteRuleTokenStream stream_EOL=new RewriteRuleTokenStream(adaptor,"token EOL");
		RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
		RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
		RewriteRuleSubtreeStream stream_operand=new RewriteRuleSubtreeStream(adaptor,"rule operand");

		try {
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:127:2: ( 'set tag' op1= operand 'to' op2= operand EOL -> ^( ACTION[\"setTag\"] ^( OPERAND $op2) ^( OPERAND $op1) ) )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:127:4: 'set tag' op1= operand 'to' op2= operand EOL
			{
			string_literal55=(CommonToken)match(input,64,FOLLOW_64_in_set_tag690); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_64.add(string_literal55);

			pushFollow(FOLLOW_operand_in_set_tag696);
			op1=operand();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_operand.add(op1.getTree());
			string_literal56=(CommonToken)match(input,69,FOLLOW_69_in_set_tag698); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_69.add(string_literal56);

			pushFollow(FOLLOW_operand_in_set_tag704);
			op2=operand();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_operand.add(op2.getTree());
			EOL57=(CommonToken)match(input,EOL,FOLLOW_EOL_in_set_tag706); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EOL.add(EOL57);

			// AST REWRITE
			// elements: op1, op2
			// token labels: 
			// rule labels: op2, op1, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_op2=new RewriteRuleSubtreeStream(adaptor,"rule op2",op2!=null?op2.getTree():null);
			RewriteRuleSubtreeStream stream_op1=new RewriteRuleSubtreeStream(adaptor,"rule op1",op1!=null?op1.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 128:3: -> ^( ACTION[\"setTag\"] ^( OPERAND $op2) ^( OPERAND $op1) )
			{
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:128:6: ^( ACTION[\"setTag\"] ^( OPERAND $op2) ^( OPERAND $op1) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ACTION, "setTag"), root_1);
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:128:25: ^( OPERAND $op2)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERAND, "OPERAND"), root_2);
				adaptor.addChild(root_2, stream_op2.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:128:41: ^( OPERAND $op1)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERAND, "OPERAND"), root_2);
				adaptor.addChild(root_2, stream_op1.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "set_tag"


	public static class set_text_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "set_text"
	// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:131:1: set_text : 'set text' op1= operand 'to' op2= operand EOL -> ^( ACTION[\"setText\"] ^( OPERAND $op2) ^( OPERAND $op1) ) ;
	public final CRLParser.set_text_return set_text() throws RecognitionException {
		CRLParser.set_text_return retval = new CRLParser.set_text_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonToken string_literal58=null;
		CommonToken string_literal59=null;
		CommonToken EOL60=null;
		ParserRuleReturnScope op1 =null;
		ParserRuleReturnScope op2 =null;

		CommonTree string_literal58_tree=null;
		CommonTree string_literal59_tree=null;
		CommonTree EOL60_tree=null;
		RewriteRuleTokenStream stream_EOL=new RewriteRuleTokenStream(adaptor,"token EOL");
		RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
		RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
		RewriteRuleSubtreeStream stream_operand=new RewriteRuleSubtreeStream(adaptor,"rule operand");

		try {
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:132:2: ( 'set text' op1= operand 'to' op2= operand EOL -> ^( ACTION[\"setText\"] ^( OPERAND $op2) ^( OPERAND $op1) ) )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:132:4: 'set text' op1= operand 'to' op2= operand EOL
			{
			string_literal58=(CommonToken)match(input,65,FOLLOW_65_in_set_text741); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_65.add(string_literal58);

			pushFollow(FOLLOW_operand_in_set_text747);
			op1=operand();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_operand.add(op1.getTree());
			string_literal59=(CommonToken)match(input,69,FOLLOW_69_in_set_text749); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_69.add(string_literal59);

			pushFollow(FOLLOW_operand_in_set_text755);
			op2=operand();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_operand.add(op2.getTree());
			EOL60=(CommonToken)match(input,EOL,FOLLOW_EOL_in_set_text757); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EOL.add(EOL60);

			// AST REWRITE
			// elements: op2, op1
			// token labels: 
			// rule labels: op2, op1, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_op2=new RewriteRuleSubtreeStream(adaptor,"rule op2",op2!=null?op2.getTree():null);
			RewriteRuleSubtreeStream stream_op1=new RewriteRuleSubtreeStream(adaptor,"rule op1",op1!=null?op1.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 133:3: -> ^( ACTION[\"setText\"] ^( OPERAND $op2) ^( OPERAND $op1) )
			{
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:133:6: ^( ACTION[\"setText\"] ^( OPERAND $op2) ^( OPERAND $op1) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ACTION, "setText"), root_1);
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:133:26: ^( OPERAND $op2)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERAND, "OPERAND"), root_2);
				adaptor.addChild(root_2, stream_op2.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:133:42: ^( OPERAND $op1)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERAND, "OPERAND"), root_2);
				adaptor.addChild(root_2, stream_op1.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "set_text"


	public static class set_indent_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "set_indent"
	// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:136:1: set_indent : 'set indent' op1= operand 'to' op2= operand EOL -> ^( ACTION[\"setIndent\"] ^( OPERAND $op2) ^( OPERAND $op1) ) ;
	public final CRLParser.set_indent_return set_indent() throws RecognitionException {
		CRLParser.set_indent_return retval = new CRLParser.set_indent_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonToken string_literal61=null;
		CommonToken string_literal62=null;
		CommonToken EOL63=null;
		ParserRuleReturnScope op1 =null;
		ParserRuleReturnScope op2 =null;

		CommonTree string_literal61_tree=null;
		CommonTree string_literal62_tree=null;
		CommonTree EOL63_tree=null;
		RewriteRuleTokenStream stream_EOL=new RewriteRuleTokenStream(adaptor,"token EOL");
		RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
		RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
		RewriteRuleSubtreeStream stream_operand=new RewriteRuleSubtreeStream(adaptor,"rule operand");

		try {
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:137:2: ( 'set indent' op1= operand 'to' op2= operand EOL -> ^( ACTION[\"setIndent\"] ^( OPERAND $op2) ^( OPERAND $op1) ) )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:137:4: 'set indent' op1= operand 'to' op2= operand EOL
			{
			string_literal61=(CommonToken)match(input,62,FOLLOW_62_in_set_indent792); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_62.add(string_literal61);

			pushFollow(FOLLOW_operand_in_set_indent798);
			op1=operand();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_operand.add(op1.getTree());
			string_literal62=(CommonToken)match(input,69,FOLLOW_69_in_set_indent800); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_69.add(string_literal62);

			pushFollow(FOLLOW_operand_in_set_indent806);
			op2=operand();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_operand.add(op2.getTree());
			EOL63=(CommonToken)match(input,EOL,FOLLOW_EOL_in_set_indent808); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EOL.add(EOL63);

			// AST REWRITE
			// elements: op2, op1
			// token labels: 
			// rule labels: op2, op1, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_op2=new RewriteRuleSubtreeStream(adaptor,"rule op2",op2!=null?op2.getTree():null);
			RewriteRuleSubtreeStream stream_op1=new RewriteRuleSubtreeStream(adaptor,"rule op1",op1!=null?op1.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 138:3: -> ^( ACTION[\"setIndent\"] ^( OPERAND $op2) ^( OPERAND $op1) )
			{
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:138:6: ^( ACTION[\"setIndent\"] ^( OPERAND $op2) ^( OPERAND $op1) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ACTION, "setIndent"), root_1);
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:138:28: ^( OPERAND $op2)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERAND, "OPERAND"), root_2);
				adaptor.addChild(root_2, stream_op2.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:138:44: ^( OPERAND $op1)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERAND, "OPERAND"), root_2);
				adaptor.addChild(root_2, stream_op1.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "set_indent"


	public static class split_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "split"
	// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:141:1: split : 'split' operand EOL -> ^( ACTION[\"split\"] ^( OPERAND operand ) ) ;
	public final CRLParser.split_return split() throws RecognitionException {
		CRLParser.split_return retval = new CRLParser.split_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonToken string_literal64=null;
		CommonToken EOL66=null;
		ParserRuleReturnScope operand65 =null;

		CommonTree string_literal64_tree=null;
		CommonTree EOL66_tree=null;
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_EOL=new RewriteRuleTokenStream(adaptor,"token EOL");
		RewriteRuleSubtreeStream stream_operand=new RewriteRuleSubtreeStream(adaptor,"rule operand");

		try {
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:142:2: ( 'split' operand EOL -> ^( ACTION[\"split\"] ^( OPERAND operand ) ) )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:142:4: 'split' operand EOL
			{
			string_literal64=(CommonToken)match(input,67,FOLLOW_67_in_split843); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_67.add(string_literal64);

			pushFollow(FOLLOW_operand_in_split845);
			operand65=operand();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_operand.add(operand65.getTree());
			EOL66=(CommonToken)match(input,EOL,FOLLOW_EOL_in_split847); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EOL.add(EOL66);

			// AST REWRITE
			// elements: operand
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 143:3: -> ^( ACTION[\"split\"] ^( OPERAND operand ) )
			{
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:143:6: ^( ACTION[\"split\"] ^( OPERAND operand ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ACTION, "split"), root_1);
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:143:25: ^( OPERAND operand )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERAND, "OPERAND"), root_2);
				adaptor.addChild(root_2, stream_operand.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "split"


	public static class merge_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "merge"
	// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:146:1: merge : 'merge' op1= operand 'with' op2= operand EOL -> ^( ACTION[\"merge\"] ^( OPERAND $op2) ^( OPERAND $op1) ) ;
	public final CRLParser.merge_return merge() throws RecognitionException {
		CRLParser.merge_return retval = new CRLParser.merge_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonToken string_literal67=null;
		CommonToken string_literal68=null;
		CommonToken EOL69=null;
		ParserRuleReturnScope op1 =null;
		ParserRuleReturnScope op2 =null;

		CommonTree string_literal67_tree=null;
		CommonTree string_literal68_tree=null;
		CommonTree EOL69_tree=null;
		RewriteRuleTokenStream stream_EOL=new RewriteRuleTokenStream(adaptor,"token EOL");
		RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleSubtreeStream stream_operand=new RewriteRuleSubtreeStream(adaptor,"rule operand");

		try {
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:147:2: ( 'merge' op1= operand 'with' op2= operand EOL -> ^( ACTION[\"merge\"] ^( OPERAND $op2) ^( OPERAND $op1) ) )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:147:4: 'merge' op1= operand 'with' op2= operand EOL
			{
			string_literal67=(CommonToken)match(input,53,FOLLOW_53_in_merge875); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_53.add(string_literal67);

			pushFollow(FOLLOW_operand_in_merge881);
			op1=operand();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_operand.add(op1.getTree());
			string_literal68=(CommonToken)match(input,72,FOLLOW_72_in_merge883); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_72.add(string_literal68);

			pushFollow(FOLLOW_operand_in_merge889);
			op2=operand();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_operand.add(op2.getTree());
			EOL69=(CommonToken)match(input,EOL,FOLLOW_EOL_in_merge891); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EOL.add(EOL69);

			// AST REWRITE
			// elements: op2, op1
			// token labels: 
			// rule labels: op2, op1, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_op2=new RewriteRuleSubtreeStream(adaptor,"rule op2",op2!=null?op2.getTree():null);
			RewriteRuleSubtreeStream stream_op1=new RewriteRuleSubtreeStream(adaptor,"rule op1",op1!=null?op1.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 148:3: -> ^( ACTION[\"merge\"] ^( OPERAND $op2) ^( OPERAND $op1) )
			{
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:148:6: ^( ACTION[\"merge\"] ^( OPERAND $op2) ^( OPERAND $op1) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ACTION, "merge"), root_1);
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:148:24: ^( OPERAND $op2)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERAND, "OPERAND"), root_2);
				adaptor.addChild(root_2, stream_op2.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:148:40: ^( OPERAND $op1)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERAND, "OPERAND"), root_2);
				adaptor.addChild(root_2, stream_op1.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "merge"


	public static class new_entry_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "new_entry"
	// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:151:1: new_entry : 'new entry' op1= operand ( 'as' op2= operand )? EOL -> ^( ACTION[\"newEntry\"] ^( OPERAND $op1) ( ^( OPERAND $op2) )? ) ;
	public final CRLParser.new_entry_return new_entry() throws RecognitionException {
		CRLParser.new_entry_return retval = new CRLParser.new_entry_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonToken string_literal70=null;
		CommonToken string_literal71=null;
		CommonToken EOL72=null;
		ParserRuleReturnScope op1 =null;
		ParserRuleReturnScope op2 =null;

		CommonTree string_literal70_tree=null;
		CommonTree string_literal71_tree=null;
		CommonTree EOL72_tree=null;
		RewriteRuleTokenStream stream_EOL=new RewriteRuleTokenStream(adaptor,"token EOL");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleSubtreeStream stream_operand=new RewriteRuleSubtreeStream(adaptor,"rule operand");

		try {
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:152:2: ( 'new entry' op1= operand ( 'as' op2= operand )? EOL -> ^( ACTION[\"newEntry\"] ^( OPERAND $op1) ( ^( OPERAND $op2) )? ) )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:152:4: 'new entry' op1= operand ( 'as' op2= operand )? EOL
			{
			string_literal70=(CommonToken)match(input,54,FOLLOW_54_in_new_entry926); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_54.add(string_literal70);

			pushFollow(FOLLOW_operand_in_new_entry932);
			op1=operand();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_operand.add(op1.getTree());
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:152:30: ( 'as' op2= operand )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==41) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:152:31: 'as' op2= operand
					{
					string_literal71=(CommonToken)match(input,41,FOLLOW_41_in_new_entry935); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_41.add(string_literal71);

					pushFollow(FOLLOW_operand_in_new_entry941);
					op2=operand();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_operand.add(op2.getTree());
					}
					break;

			}

			EOL72=(CommonToken)match(input,EOL,FOLLOW_EOL_in_new_entry945); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EOL.add(EOL72);

			// AST REWRITE
			// elements: op1, op2
			// token labels: 
			// rule labels: op2, op1, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_op2=new RewriteRuleSubtreeStream(adaptor,"rule op2",op2!=null?op2.getTree():null);
			RewriteRuleSubtreeStream stream_op1=new RewriteRuleSubtreeStream(adaptor,"rule op1",op1!=null?op1.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 153:3: -> ^( ACTION[\"newEntry\"] ^( OPERAND $op1) ( ^( OPERAND $op2) )? )
			{
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:153:6: ^( ACTION[\"newEntry\"] ^( OPERAND $op1) ( ^( OPERAND $op2) )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ACTION, "newEntry"), root_1);
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:153:27: ^( OPERAND $op1)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERAND, "OPERAND"), root_2);
				adaptor.addChild(root_2, stream_op1.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:153:43: ( ^( OPERAND $op2) )?
				if ( stream_op2.hasNext() ) {
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:153:43: ^( OPERAND $op2)
					{
					CommonTree root_2 = (CommonTree)adaptor.nil();
					root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERAND, "OPERAND"), root_2);
					adaptor.addChild(root_2, stream_op2.nextTree());
					adaptor.addChild(root_1, root_2);
					}

				}
				stream_op2.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "new_entry"


	public static class set_value_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "set_value"
	// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:156:1: set_value : 'set value' op1= operand 'to' op2= operand EOL -> ^( ACTION[\"setValue\"] ^( OPERAND $op2) ^( OPERAND $op1) ) ;
	public final CRLParser.set_value_return set_value() throws RecognitionException {
		CRLParser.set_value_return retval = new CRLParser.set_value_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonToken string_literal73=null;
		CommonToken string_literal74=null;
		CommonToken EOL75=null;
		ParserRuleReturnScope op1 =null;
		ParserRuleReturnScope op2 =null;

		CommonTree string_literal73_tree=null;
		CommonTree string_literal74_tree=null;
		CommonTree EOL75_tree=null;
		RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
		RewriteRuleTokenStream stream_EOL=new RewriteRuleTokenStream(adaptor,"token EOL");
		RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
		RewriteRuleSubtreeStream stream_operand=new RewriteRuleSubtreeStream(adaptor,"rule operand");

		try {
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:157:2: ( 'set value' op1= operand 'to' op2= operand EOL -> ^( ACTION[\"setValue\"] ^( OPERAND $op2) ^( OPERAND $op1) ) )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:157:4: 'set value' op1= operand 'to' op2= operand EOL
			{
			string_literal73=(CommonToken)match(input,66,FOLLOW_66_in_set_value981); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_66.add(string_literal73);

			pushFollow(FOLLOW_operand_in_set_value987);
			op1=operand();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_operand.add(op1.getTree());
			string_literal74=(CommonToken)match(input,69,FOLLOW_69_in_set_value989); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_69.add(string_literal74);

			pushFollow(FOLLOW_operand_in_set_value995);
			op2=operand();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_operand.add(op2.getTree());
			EOL75=(CommonToken)match(input,EOL,FOLLOW_EOL_in_set_value997); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EOL.add(EOL75);

			// AST REWRITE
			// elements: op2, op1
			// token labels: 
			// rule labels: op2, op1, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_op2=new RewriteRuleSubtreeStream(adaptor,"rule op2",op2!=null?op2.getTree():null);
			RewriteRuleSubtreeStream stream_op1=new RewriteRuleSubtreeStream(adaptor,"rule op1",op1!=null?op1.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 158:3: -> ^( ACTION[\"setValue\"] ^( OPERAND $op2) ^( OPERAND $op1) )
			{
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:158:6: ^( ACTION[\"setValue\"] ^( OPERAND $op2) ^( OPERAND $op1) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ACTION, "setValue"), root_1);
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:158:27: ^( OPERAND $op2)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERAND, "OPERAND"), root_2);
				adaptor.addChild(root_2, stream_op2.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:158:43: ^( OPERAND $op1)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERAND, "OPERAND"), root_2);
				adaptor.addChild(root_2, stream_op1.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "set_value"


	public static class set_category_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "set_category"
	// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:161:1: set_category : 'set category' op1= operand 'to' op2= operand EOL -> ^( ACTION[\"setCategory\"] ^( OPERAND $op2) ^( OPERAND $op1) ) ;
	public final CRLParser.set_category_return set_category() throws RecognitionException {
		CRLParser.set_category_return retval = new CRLParser.set_category_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonToken string_literal76=null;
		CommonToken string_literal77=null;
		CommonToken EOL78=null;
		ParserRuleReturnScope op1 =null;
		ParserRuleReturnScope op2 =null;

		CommonTree string_literal76_tree=null;
		CommonTree string_literal77_tree=null;
		CommonTree EOL78_tree=null;
		RewriteRuleTokenStream stream_EOL=new RewriteRuleTokenStream(adaptor,"token EOL");
		RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
		RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
		RewriteRuleSubtreeStream stream_operand=new RewriteRuleSubtreeStream(adaptor,"rule operand");

		try {
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:162:2: ( 'set category' op1= operand 'to' op2= operand EOL -> ^( ACTION[\"setCategory\"] ^( OPERAND $op2) ^( OPERAND $op1) ) )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:162:4: 'set category' op1= operand 'to' op2= operand EOL
			{
			string_literal76=(CommonToken)match(input,61,FOLLOW_61_in_set_category1032); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_61.add(string_literal76);

			pushFollow(FOLLOW_operand_in_set_category1038);
			op1=operand();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_operand.add(op1.getTree());
			string_literal77=(CommonToken)match(input,69,FOLLOW_69_in_set_category1040); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_69.add(string_literal77);

			pushFollow(FOLLOW_operand_in_set_category1046);
			op2=operand();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_operand.add(op2.getTree());
			EOL78=(CommonToken)match(input,EOL,FOLLOW_EOL_in_set_category1048); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EOL.add(EOL78);

			// AST REWRITE
			// elements: op2, op1
			// token labels: 
			// rule labels: op2, op1, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_op2=new RewriteRuleSubtreeStream(adaptor,"rule op2",op2!=null?op2.getTree():null);
			RewriteRuleSubtreeStream stream_op1=new RewriteRuleSubtreeStream(adaptor,"rule op1",op1!=null?op1.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 163:3: -> ^( ACTION[\"setCategory\"] ^( OPERAND $op2) ^( OPERAND $op1) )
			{
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:163:6: ^( ACTION[\"setCategory\"] ^( OPERAND $op2) ^( OPERAND $op1) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ACTION, "setCategory"), root_1);
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:163:30: ^( OPERAND $op2)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERAND, "OPERAND"), root_2);
				adaptor.addChild(root_2, stream_op2.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:163:46: ^( OPERAND $op1)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERAND, "OPERAND"), root_2);
				adaptor.addChild(root_2, stream_op1.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "set_category"


	public static class set_parent_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "set_parent"
	// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:166:1: set_parent : 'set parent' op1= operand 'to' op2= operand EOL -> ^( ACTION[\"setParent\"] ^( OPERAND $op2) ^( OPERAND $op1) ) ;
	public final CRLParser.set_parent_return set_parent() throws RecognitionException {
		CRLParser.set_parent_return retval = new CRLParser.set_parent_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonToken string_literal79=null;
		CommonToken string_literal80=null;
		CommonToken EOL81=null;
		ParserRuleReturnScope op1 =null;
		ParserRuleReturnScope op2 =null;

		CommonTree string_literal79_tree=null;
		CommonTree string_literal80_tree=null;
		CommonTree EOL81_tree=null;
		RewriteRuleTokenStream stream_EOL=new RewriteRuleTokenStream(adaptor,"token EOL");
		RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
		RewriteRuleSubtreeStream stream_operand=new RewriteRuleSubtreeStream(adaptor,"rule operand");

		try {
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:167:2: ( 'set parent' op1= operand 'to' op2= operand EOL -> ^( ACTION[\"setParent\"] ^( OPERAND $op2) ^( OPERAND $op1) ) )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:167:4: 'set parent' op1= operand 'to' op2= operand EOL
			{
			string_literal79=(CommonToken)match(input,63,FOLLOW_63_in_set_parent1083); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_63.add(string_literal79);

			pushFollow(FOLLOW_operand_in_set_parent1089);
			op1=operand();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_operand.add(op1.getTree());
			string_literal80=(CommonToken)match(input,69,FOLLOW_69_in_set_parent1091); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_69.add(string_literal80);

			pushFollow(FOLLOW_operand_in_set_parent1097);
			op2=operand();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_operand.add(op2.getTree());
			EOL81=(CommonToken)match(input,EOL,FOLLOW_EOL_in_set_parent1099); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EOL.add(EOL81);

			// AST REWRITE
			// elements: op2, op1
			// token labels: 
			// rule labels: op2, op1, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_op2=new RewriteRuleSubtreeStream(adaptor,"rule op2",op2!=null?op2.getTree():null);
			RewriteRuleSubtreeStream stream_op1=new RewriteRuleSubtreeStream(adaptor,"rule op1",op1!=null?op1.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 168:3: -> ^( ACTION[\"setParent\"] ^( OPERAND $op2) ^( OPERAND $op1) )
			{
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:168:6: ^( ACTION[\"setParent\"] ^( OPERAND $op2) ^( OPERAND $op1) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ACTION, "setParent"), root_1);
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:168:28: ^( OPERAND $op2)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERAND, "OPERAND"), root_2);
				adaptor.addChild(root_2, stream_op2.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:168:44: ^( OPERAND $op1)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERAND, "OPERAND"), root_2);
				adaptor.addChild(root_2, stream_op1.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "set_parent"


	public static class group_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "group"
	// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:171:1: group : 'group' op1= operand 'with' op2= operand EOL -> ^( ACTION[\"group\"] ^( OPERAND $op1) ^( OPERAND $op2) ) ;
	public final CRLParser.group_return group() throws RecognitionException {
		CRLParser.group_return retval = new CRLParser.group_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonToken string_literal82=null;
		CommonToken string_literal83=null;
		CommonToken EOL84=null;
		ParserRuleReturnScope op1 =null;
		ParserRuleReturnScope op2 =null;

		CommonTree string_literal82_tree=null;
		CommonTree string_literal83_tree=null;
		CommonTree EOL84_tree=null;
		RewriteRuleTokenStream stream_EOL=new RewriteRuleTokenStream(adaptor,"token EOL");
		RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
		RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
		RewriteRuleSubtreeStream stream_operand=new RewriteRuleSubtreeStream(adaptor,"rule operand");

		try {
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:172:2: ( 'group' op1= operand 'with' op2= operand EOL -> ^( ACTION[\"group\"] ^( OPERAND $op1) ^( OPERAND $op2) ) )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:172:4: 'group' op1= operand 'with' op2= operand EOL
			{
			string_literal82=(CommonToken)match(input,49,FOLLOW_49_in_group1134); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_49.add(string_literal82);

			pushFollow(FOLLOW_operand_in_group1140);
			op1=operand();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_operand.add(op1.getTree());
			string_literal83=(CommonToken)match(input,72,FOLLOW_72_in_group1142); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_72.add(string_literal83);

			pushFollow(FOLLOW_operand_in_group1148);
			op2=operand();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_operand.add(op2.getTree());
			EOL84=(CommonToken)match(input,EOL,FOLLOW_EOL_in_group1150); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EOL.add(EOL84);

			// AST REWRITE
			// elements: op1, op2
			// token labels: 
			// rule labels: op2, op1, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_op2=new RewriteRuleSubtreeStream(adaptor,"rule op2",op2!=null?op2.getTree():null);
			RewriteRuleSubtreeStream stream_op1=new RewriteRuleSubtreeStream(adaptor,"rule op1",op1!=null?op1.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 173:3: -> ^( ACTION[\"group\"] ^( OPERAND $op1) ^( OPERAND $op2) )
			{
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:173:6: ^( ACTION[\"group\"] ^( OPERAND $op1) ^( OPERAND $op2) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ACTION, "group"), root_1);
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:173:24: ^( OPERAND $op1)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERAND, "OPERAND"), root_2);
				adaptor.addChild(root_2, stream_op1.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:173:40: ^( OPERAND $op2)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERAND, "OPERAND"), root_2);
				adaptor.addChild(root_2, stream_op2.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "group"


	public static class add_label_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "add_label"
	// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:176:1: add_label : 'add label' op1= operand ( 'of' op2= operand )? 'to' op3= operand EOL -> ^( ACTION[\"addLabel\"] ^( OPERAND $op3) ^( OPERAND $op1) ( ^( OPERAND $op2) )? ) ;
	public final CRLParser.add_label_return add_label() throws RecognitionException {
		CRLParser.add_label_return retval = new CRLParser.add_label_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonToken string_literal85=null;
		CommonToken string_literal86=null;
		CommonToken string_literal87=null;
		CommonToken EOL88=null;
		ParserRuleReturnScope op1 =null;
		ParserRuleReturnScope op2 =null;
		ParserRuleReturnScope op3 =null;

		CommonTree string_literal85_tree=null;
		CommonTree string_literal86_tree=null;
		CommonTree string_literal87_tree=null;
		CommonTree EOL88_tree=null;
		RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
		RewriteRuleTokenStream stream_EOL=new RewriteRuleTokenStream(adaptor,"token EOL");
		RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleSubtreeStream stream_operand=new RewriteRuleSubtreeStream(adaptor,"rule operand");

		try {
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:177:2: ( 'add label' op1= operand ( 'of' op2= operand )? 'to' op3= operand EOL -> ^( ACTION[\"addLabel\"] ^( OPERAND $op3) ^( OPERAND $op1) ( ^( OPERAND $op2) )? ) )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:177:4: 'add label' op1= operand ( 'of' op2= operand )? 'to' op3= operand EOL
			{
			string_literal85=(CommonToken)match(input,40,FOLLOW_40_in_add_label1185); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_40.add(string_literal85);

			pushFollow(FOLLOW_operand_in_add_label1191);
			op1=operand();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_operand.add(op1.getTree());
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:177:30: ( 'of' op2= operand )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==57) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:177:31: 'of' op2= operand
					{
					string_literal86=(CommonToken)match(input,57,FOLLOW_57_in_add_label1194); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_57.add(string_literal86);

					pushFollow(FOLLOW_operand_in_add_label1200);
					op2=operand();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_operand.add(op2.getTree());
					}
					break;

			}

			string_literal87=(CommonToken)match(input,69,FOLLOW_69_in_add_label1204); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_69.add(string_literal87);

			pushFollow(FOLLOW_operand_in_add_label1210);
			op3=operand();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_operand.add(op3.getTree());
			EOL88=(CommonToken)match(input,EOL,FOLLOW_EOL_in_add_label1212); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EOL.add(EOL88);

			// AST REWRITE
			// elements: op3, op1, op2
			// token labels: 
			// rule labels: op2, op1, op3, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_op2=new RewriteRuleSubtreeStream(adaptor,"rule op2",op2!=null?op2.getTree():null);
			RewriteRuleSubtreeStream stream_op1=new RewriteRuleSubtreeStream(adaptor,"rule op1",op1!=null?op1.getTree():null);
			RewriteRuleSubtreeStream stream_op3=new RewriteRuleSubtreeStream(adaptor,"rule op3",op3!=null?op3.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 178:3: -> ^( ACTION[\"addLabel\"] ^( OPERAND $op3) ^( OPERAND $op1) ( ^( OPERAND $op2) )? )
			{
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:178:6: ^( ACTION[\"addLabel\"] ^( OPERAND $op3) ^( OPERAND $op1) ( ^( OPERAND $op2) )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ACTION, "addLabel"), root_1);
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:178:27: ^( OPERAND $op3)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERAND, "OPERAND"), root_2);
				adaptor.addChild(root_2, stream_op3.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:178:43: ^( OPERAND $op1)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERAND, "OPERAND"), root_2);
				adaptor.addChild(root_2, stream_op1.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:178:59: ( ^( OPERAND $op2) )?
				if ( stream_op2.hasNext() ) {
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:178:59: ^( OPERAND $op2)
					{
					CommonTree root_2 = (CommonTree)adaptor.nil();
					root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERAND, "OPERAND"), root_2);
					adaptor.addChild(root_2, stream_op2.nextTree());
					adaptor.addChild(root_1, root_2);
					}

				}
				stream_op2.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "add_label"


	public static class new_label_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "new_label"
	// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:181:1: new_label : 'new label' op1= operand ( 'as' op2= operand )? EOL -> ^( ACTION[\"newLabel\"] ^( OPERAND $op1) ( ^( OPERAND $op2) )? ) ;
	public final CRLParser.new_label_return new_label() throws RecognitionException {
		CRLParser.new_label_return retval = new CRLParser.new_label_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonToken string_literal89=null;
		CommonToken string_literal90=null;
		CommonToken EOL91=null;
		ParserRuleReturnScope op1 =null;
		ParserRuleReturnScope op2 =null;

		CommonTree string_literal89_tree=null;
		CommonTree string_literal90_tree=null;
		CommonTree EOL91_tree=null;
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_EOL=new RewriteRuleTokenStream(adaptor,"token EOL");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleSubtreeStream stream_operand=new RewriteRuleSubtreeStream(adaptor,"rule operand");

		try {
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:182:2: ( 'new label' op1= operand ( 'as' op2= operand )? EOL -> ^( ACTION[\"newLabel\"] ^( OPERAND $op1) ( ^( OPERAND $op2) )? ) )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:182:4: 'new label' op1= operand ( 'as' op2= operand )? EOL
			{
			string_literal89=(CommonToken)match(input,55,FOLLOW_55_in_new_label1255); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_55.add(string_literal89);

			pushFollow(FOLLOW_operand_in_new_label1261);
			op1=operand();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_operand.add(op1.getTree());
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:182:30: ( 'as' op2= operand )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==41) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:182:31: 'as' op2= operand
					{
					string_literal90=(CommonToken)match(input,41,FOLLOW_41_in_new_label1264); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_41.add(string_literal90);

					pushFollow(FOLLOW_operand_in_new_label1270);
					op2=operand();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_operand.add(op2.getTree());
					}
					break;

			}

			EOL91=(CommonToken)match(input,EOL,FOLLOW_EOL_in_new_label1274); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EOL.add(EOL91);

			// AST REWRITE
			// elements: op1, op2
			// token labels: 
			// rule labels: op2, op1, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_op2=new RewriteRuleSubtreeStream(adaptor,"rule op2",op2!=null?op2.getTree():null);
			RewriteRuleSubtreeStream stream_op1=new RewriteRuleSubtreeStream(adaptor,"rule op1",op1!=null?op1.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 183:3: -> ^( ACTION[\"newLabel\"] ^( OPERAND $op1) ( ^( OPERAND $op2) )? )
			{
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:183:6: ^( ACTION[\"newLabel\"] ^( OPERAND $op1) ( ^( OPERAND $op2) )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ACTION, "newLabel"), root_1);
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:183:27: ^( OPERAND $op1)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERAND, "OPERAND"), root_2);
				adaptor.addChild(root_2, stream_op1.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:183:43: ( ^( OPERAND $op2) )?
				if ( stream_op2.hasNext() ) {
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:183:43: ^( OPERAND $op2)
					{
					CommonTree root_2 = (CommonTree)adaptor.nil();
					root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERAND, "OPERAND"), root_2);
					adaptor.addChild(root_2, stream_op2.nextTree());
					adaptor.addChild(root_1, root_2);
					}

				}
				stream_op2.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "new_label"


	public static class update_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "update"
	// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:186:1: update : 'update' operand EOL ->;
	public final CRLParser.update_return update() throws RecognitionException {
		CRLParser.update_return retval = new CRLParser.update_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonToken string_literal92=null;
		CommonToken EOL94=null;
		ParserRuleReturnScope operand93 =null;

		CommonTree string_literal92_tree=null;
		CommonTree EOL94_tree=null;
		RewriteRuleTokenStream stream_EOL=new RewriteRuleTokenStream(adaptor,"token EOL");
		RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
		RewriteRuleSubtreeStream stream_operand=new RewriteRuleSubtreeStream(adaptor,"rule operand");

		try {
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:187:2: ( 'update' operand EOL ->)
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:187:4: 'update' operand EOL
			{
			string_literal92=(CommonToken)match(input,70,FOLLOW_70_in_update1310); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_70.add(string_literal92);

			pushFollow(FOLLOW_operand_in_update1312);
			operand93=operand();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_operand.add(operand93.getTree());
			EOL94=(CommonToken)match(input,EOL,FOLLOW_EOL_in_update1314); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EOL.add(EOL94);

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 188:3: ->
			{
				root_0 = null;
			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "update"


	public static class print_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "print"
	// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:191:1: print : name= ( 'print' | 'printf' ) operand EOL -> ^( ACTION[$name] ^( OPERAND operand ) ) ;
	public final CRLParser.print_return print() throws RecognitionException {
		CRLParser.print_return retval = new CRLParser.print_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonToken name=null;
		CommonToken EOL96=null;
		ParserRuleReturnScope operand95 =null;

		CommonTree name_tree=null;
		CommonTree EOL96_tree=null;
		RewriteRuleTokenStream stream_EOL=new RewriteRuleTokenStream(adaptor,"token EOL");
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
		RewriteRuleSubtreeStream stream_operand=new RewriteRuleSubtreeStream(adaptor,"rule operand");

		try {
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:192:2: (name= ( 'print' | 'printf' ) operand EOL -> ^( ACTION[$name] ^( OPERAND operand ) ) )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:192:4: name= ( 'print' | 'printf' ) operand EOL
			{
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:192:11: ( 'print' | 'printf' )
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==58) ) {
				alt27=1;
			}
			else if ( (LA27_0==59) ) {
				alt27=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}

			switch (alt27) {
				case 1 :
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:192:12: 'print'
					{
					name=(CommonToken)match(input,58,FOLLOW_58_in_print1335); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_58.add(name);

					}
					break;
				case 2 :
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:192:20: 'printf'
					{
					name=(CommonToken)match(input,59,FOLLOW_59_in_print1337); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_59.add(name);

					}
					break;

			}

			pushFollow(FOLLOW_operand_in_print1340);
			operand95=operand();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_operand.add(operand95.getTree());
			EOL96=(CommonToken)match(input,EOL,FOLLOW_EOL_in_print1342); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EOL.add(EOL96);

			// AST REWRITE
			// elements: operand
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 193:3: -> ^( ACTION[$name] ^( OPERAND operand ) )
			{
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:193:6: ^( ACTION[$name] ^( OPERAND operand ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ACTION, name), root_1);
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:193:22: ^( OPERAND operand )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERAND, "OPERAND"), root_2);
				adaptor.addChild(root_2, stream_operand.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "print"

	// Delegated rules



	public static final BitSet FOLLOW_importing_in_crl135 = new BitSet(new long[]{0x1004000000000002L});
	public static final BitSet FOLLOW_rule_in_crl140 = new BitSet(new long[]{0x1000000000000002L});
	public static final BitSet FOLLOW_50_in_importing179 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_importing185 = new BitSet(new long[]{0x000000B000004000L});
	public static final BitSet FOLLOW_36_in_importing190 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_importing196 = new BitSet(new long[]{0x000000B000004000L});
	public static final BitSet FOLLOW_37_in_importing204 = new BitSet(new long[]{0x0000008000004000L});
	public static final BitSet FOLLOW_39_in_importing210 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_EOL_in_importing213 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_60_in_rule235 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_INT_in_rule239 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_EOL_in_rule241 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_71_in_rule245 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_EOL_in_rule247 = new BitSet(new long[]{0x0119BC0000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_condition_in_rule252 = new BitSet(new long[]{0x0119BC0000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_rule257 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_EOL_in_rule259 = new BitSet(new long[]{0xECE2410000000000L,0x000000000000004FL});
	public static final BitSet FOLLOW_action_in_rule264 = new BitSet(new long[]{0xECE2410000000000L,0x000000000000004FL});
	public static final BitSet FOLLOW_46_in_rule269 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_EOL_in_rule271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_condition318 = new BitSet(new long[]{0x0019BC0000000000L});
	public static final BitSet FOLLOW_query_in_condition326 = new BitSet(new long[]{0x0000004000104000L});
	public static final BitSet FOLLOW_ID_in_condition337 = new BitSet(new long[]{0x0000004000004000L});
	public static final BitSet FOLLOW_38_in_condition353 = new BitSet(new long[]{0xFFFFFFB7FFFFBFF0L,0x00000000000001FFL});
	public static final BitSet FOLLOW_constraint_in_condition361 = new BitSet(new long[]{0x0000000800004000L});
	public static final BitSet FOLLOW_35_in_condition364 = new BitSet(new long[]{0xFFFFFFB7FFFFBFF0L,0x00000000000001FFL});
	public static final BitSet FOLLOW_constraint_in_condition366 = new BitSet(new long[]{0x0000000800004000L});
	public static final BitSet FOLLOW_35_in_condition371 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_assignment_in_condition373 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_assignment_in_condition381 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_EOL_in_condition390 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_query439 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_query441 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_query453 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_query455 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_query467 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_query469 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_query481 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_query483 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assignment527 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_assignment529 = new BitSet(new long[]{0xFFFFFFFFFFFFBFF0L,0x00000000000001FFL});
	public static final BitSet FOLLOW_expression_in_assignment531 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_tag_in_action579 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_text_in_action584 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_indent_in_action589 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_split_in_action594 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_merge_in_action599 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_new_entry_in_action604 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_value_in_action609 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_category_in_action614 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_parent_in_action619 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_group_in_action624 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_add_label_in_action629 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_new_label_in_action634 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_update_in_action639 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_in_action644 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_64_in_set_tag690 = new BitSet(new long[]{0xFDFFFDFFFFFFBFF0L,0x00000000000000DFL});
	public static final BitSet FOLLOW_operand_in_set_tag696 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_69_in_set_tag698 = new BitSet(new long[]{0xFDFFFDFFFFFFBFF0L,0x00000000000000DFL});
	public static final BitSet FOLLOW_operand_in_set_tag704 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_EOL_in_set_tag706 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_set_text741 = new BitSet(new long[]{0xFDFFFDFFFFFFBFF0L,0x00000000000000DFL});
	public static final BitSet FOLLOW_operand_in_set_text747 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_69_in_set_text749 = new BitSet(new long[]{0xFDFFFDFFFFFFBFF0L,0x00000000000000DFL});
	public static final BitSet FOLLOW_operand_in_set_text755 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_EOL_in_set_text757 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_62_in_set_indent792 = new BitSet(new long[]{0xFDFFFDFFFFFFBFF0L,0x00000000000000DFL});
	public static final BitSet FOLLOW_operand_in_set_indent798 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_69_in_set_indent800 = new BitSet(new long[]{0xFDFFFDFFFFFFBFF0L,0x00000000000000DFL});
	public static final BitSet FOLLOW_operand_in_set_indent806 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_EOL_in_set_indent808 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_split843 = new BitSet(new long[]{0xFDFFFDFFFFFFBFF0L,0x00000000000000DFL});
	public static final BitSet FOLLOW_operand_in_split845 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_EOL_in_split847 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_merge875 = new BitSet(new long[]{0xFDFFFDFFFFFFBFF0L,0x00000000000000DFL});
	public static final BitSet FOLLOW_operand_in_merge881 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_merge883 = new BitSet(new long[]{0xFDFFFDFFFFFFBFF0L,0x00000000000000DFL});
	public static final BitSet FOLLOW_operand_in_merge889 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_EOL_in_merge891 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_new_entry926 = new BitSet(new long[]{0xFDFFFDFFFFFFBFF0L,0x00000000000000DFL});
	public static final BitSet FOLLOW_operand_in_new_entry932 = new BitSet(new long[]{0x0000020000004000L});
	public static final BitSet FOLLOW_41_in_new_entry935 = new BitSet(new long[]{0xFDFFFDFFFFFFBFF0L,0x00000000000000DFL});
	public static final BitSet FOLLOW_operand_in_new_entry941 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_EOL_in_new_entry945 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_66_in_set_value981 = new BitSet(new long[]{0xFDFFFDFFFFFFBFF0L,0x00000000000000DFL});
	public static final BitSet FOLLOW_operand_in_set_value987 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_69_in_set_value989 = new BitSet(new long[]{0xFDFFFDFFFFFFBFF0L,0x00000000000000DFL});
	public static final BitSet FOLLOW_operand_in_set_value995 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_EOL_in_set_value997 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_61_in_set_category1032 = new BitSet(new long[]{0xFDFFFDFFFFFFBFF0L,0x00000000000000DFL});
	public static final BitSet FOLLOW_operand_in_set_category1038 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_69_in_set_category1040 = new BitSet(new long[]{0xFDFFFDFFFFFFBFF0L,0x00000000000000DFL});
	public static final BitSet FOLLOW_operand_in_set_category1046 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_EOL_in_set_category1048 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_set_parent1083 = new BitSet(new long[]{0xFDFFFDFFFFFFBFF0L,0x00000000000000DFL});
	public static final BitSet FOLLOW_operand_in_set_parent1089 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_69_in_set_parent1091 = new BitSet(new long[]{0xFDFFFDFFFFFFBFF0L,0x00000000000000DFL});
	public static final BitSet FOLLOW_operand_in_set_parent1097 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_EOL_in_set_parent1099 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_group1134 = new BitSet(new long[]{0xFDFFFDFFFFFFBFF0L,0x00000000000000DFL});
	public static final BitSet FOLLOW_operand_in_group1140 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_group1142 = new BitSet(new long[]{0xFDFFFDFFFFFFBFF0L,0x00000000000000DFL});
	public static final BitSet FOLLOW_operand_in_group1148 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_EOL_in_group1150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_add_label1185 = new BitSet(new long[]{0xFDFFFDFFFFFFBFF0L,0x00000000000000DFL});
	public static final BitSet FOLLOW_operand_in_add_label1191 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_57_in_add_label1194 = new BitSet(new long[]{0xFDFFFDFFFFFFBFF0L,0x00000000000000DFL});
	public static final BitSet FOLLOW_operand_in_add_label1200 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_69_in_add_label1204 = new BitSet(new long[]{0xFDFFFDFFFFFFBFF0L,0x00000000000000DFL});
	public static final BitSet FOLLOW_operand_in_add_label1210 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_EOL_in_add_label1212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_new_label1255 = new BitSet(new long[]{0xFDFFFDFFFFFFBFF0L,0x00000000000000DFL});
	public static final BitSet FOLLOW_operand_in_new_label1261 = new BitSet(new long[]{0x0000020000004000L});
	public static final BitSet FOLLOW_41_in_new_label1264 = new BitSet(new long[]{0xFDFFFDFFFFFFBFF0L,0x00000000000000DFL});
	public static final BitSet FOLLOW_operand_in_new_label1270 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_EOL_in_new_label1274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_70_in_update1310 = new BitSet(new long[]{0xFDFFFDFFFFFFBFF0L,0x00000000000000DFL});
	public static final BitSet FOLLOW_operand_in_update1312 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_EOL_in_update1314 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_print1335 = new BitSet(new long[]{0xFDFFFDFFFFFFBFF0L,0x00000000000000DFL});
	public static final BitSet FOLLOW_59_in_print1337 = new BitSet(new long[]{0xFDFFFDFFFFFFBFF0L,0x00000000000000DFL});
	public static final BitSet FOLLOW_operand_in_print1340 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_EOL_in_print1342 = new BitSet(new long[]{0x0000000000000002L});
}
