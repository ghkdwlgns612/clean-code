package com.example.cleancode.chapter10;

public class SelectSql extends RefactorSql{
    public SelectSql(String table, String column) {
        super(table, column);
    }

    @Override
    public String generate() {
        return "select";
    }
}
