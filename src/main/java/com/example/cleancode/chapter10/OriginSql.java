package com.example.cleancode.chapter10;

public class OriginSql {
    private String table;
    private String column;

    public OriginSql(String table, String column) {
        this.table = table;
        this.column = column;
    }

    public String create() {
        return "create";
    }

    public String insert() {
        return "insert";
    }

    public String selectAll() {
        return "selectAll";
    }

    private String columnList(String column) {
        return column;
    }

    private String valueList() {
        return "valueList";
    }
}
