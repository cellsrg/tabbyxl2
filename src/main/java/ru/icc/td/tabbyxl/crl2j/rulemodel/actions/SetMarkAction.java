/*
 * Copyright 2018 Alexey O. Shigarov (shigarov@icc.ru) and Vasiliy V. Khristyuk
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ru.icc.td.tabbyxl.crl2j.rulemodel.actions;

import ru.icc.td.tabbyxl.crl2j.RuleCodeGen;

import java.util.ArrayList;
import java.util.List;

public class SetMarkAction extends Action {

    public SetMarkAction(int id, String name) {
        super(id, name);
    }

    private String identifier;

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return identifier;
    }

    private List<String> stringExpression = new ArrayList<>();

    public void addStringToExpression(String stringExpression) {
        this.stringExpression.add(stringExpression);
    }

    public List<String> getStringExpression() {
        return stringExpression;
    }

    @Override
    public String toString() {

        StringBuilder exprBuilder = new StringBuilder();

        for(String part: stringExpression) {
            exprBuilder.append(part);
        }

        return String.format("[ %d %s ( %s, %s ) ]", getId(), getName(), identifier.toString(), exprBuilder.toString());
    }

    @Override
    public String generateAddSet() {

        StringBuilder code = new StringBuilder();

        code.append(getName()).append(getId()).append(".add( ").append(identifier).append(", ").append(RuleCodeGen.buildExpression(stringExpression, "")).append(" )");

        return code.toString();
    }

    /*@Override
    public String fetchCode() {

        StringBuilder code = new StringBuilder();

        code.append("for ( CCell cell:").append(identifier.toString()).append(" ) {").append(System.lineSeparator());
        code.append("cell.setMark( ").append(stringExpression).append(" );").append(System.lineSeparator());
        code.append("}").append(System.lineSeparator());

        return code.toString();
    }*/
}
