package ru.icc.cells.ssdc.interpreeter.AstModel.actions;

import ru.icc.cells.ssdc.interpreeter.AstModelInterpreeter;

import java.util.ArrayList;
import java.util.List;

public class SetIndent extends Action {

    public SetIndent(int id, String name) {
        super(id, name);
    }

    private String identifier;

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return identifier;
    }

    private List<String> indent = new ArrayList<>();

    public void addIndentPart(String indent) {
        this.indent.add(indent);
    }

    public List<String> getIndent() {
        return indent;
    }

    @Override
    public String toString() {
        StringBuilder indetnBuilder = new StringBuilder();

        for(String part:indent) {
            indetnBuilder.append(part);
        }
        return String.format("[ %d %s ( %s, %s ) ]", getId(), getName(), identifier, indetnBuilder.toString());
    }

    @Override
    public String generateCallingAction() {

        StringBuilder code = new StringBuilder();

        code.append(getName()).append(getId()).append(".eval(").append(identifier).append(", ").append(AstModelInterpreeter.buildExpression(indent, "")).append(")");

        return code.toString();
    }
}
