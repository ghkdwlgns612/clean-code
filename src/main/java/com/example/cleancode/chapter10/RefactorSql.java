package com.example.cleancode.chapter10;

abstract public class RefactorSql {
    private String table;
    private String column;

    public RefactorSql(String table, String column) {
        this.table = table;
        this.column = column;
    }

    abstract public String generate();
}

