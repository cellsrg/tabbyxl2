package ru.icc.cells.ssdc.interpreeter.AstModel.actions;

import ru.icc.cells.ssdc.model.CCell;
import ru.icc.cells.ssdc.model.CTable;

import java.util.ArrayList;
import java.util.List;

public class Action implements ActionInterface {

    private int id;

    public int getId() {
        return id;
    }

    private String name;

    public Action(int id, String name) {

        this.id = id;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String fetchCode() {
        return "";
    }

    @Override
    public String toString() {
        return String.format("[ %d %s ]", id, name);
    }

    @Override
    public String generateCallingAction() {
        return "";
    }
}