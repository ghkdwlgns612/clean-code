package com.example.cleancode.chapter3.perfect;

public class PageData {

    private WikiPage wikiPage;
    private String content;

    public WikiPage getWikiPage() {
        return this.wikiPage;
    }

    public boolean hasAttribute(String test) {
        return false;
    }

    public String getHtml() {
        return null;
    }

    public char[] getContent() {
        return content.toCharArray();
    }

    public void setContent(String con) {
        this.content = con;
    }
}
