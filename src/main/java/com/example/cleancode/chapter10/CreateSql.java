package com.example.cleancode.chapter10;

public class CreateSql extends RefactorSql{
    public CreateSql(String table, String column) {
        super(table, column);
    }

    @Override
    public String generate() {
        return "create";
    }
}
