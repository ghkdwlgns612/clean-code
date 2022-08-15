package com.example.cleancode.chapter3.perfect;

public class SetupTeardownInclude {
    private PageData pageData;
    private boolean isSuite;
    private WikiPage testPage;
    private StringBuffer newPageContent;
    private PageCrawler pageCrawler;

    private SetupTeardownInclude(PageData pageData) {
        this.pageData = pageData;
        testPage = pageData.getWikiPage();
        pageCrawler = testPage.getPageCrawler();
        newPageContent = new StringBuffer();
    }

    public static String render(PageData pageData) {
        return render(pageData, false);
    }

    public static String render(PageData pageData, boolean isSuite) {
        return new SetupTeardownInclude(pageData).render(isSuite);
    }

    private String render(boolean isSuite) {
        this.isSuite = isSuite;
        if (isTestPage())
            includeSetupAndTeardownPages();
        return pageData.getHtml();
    }

    private boolean isTestPage() {
        return pageData.hasAttribute("Test");
    }

    private void includeSetupAndTeardownPages() {
        includeSetupPages();
        includePageContent();
        includeTeardownPages();
        updatePageContent();
    }

    private void updatePageContent() {
        pageData.setContent(newPageContent.toString());
    }

    private void includeTeardownPages() {
        includeTeardownPage();
        if (isSuite)
            includeSuiteTeardownPage();
    }

    private void includeSuiteTeardownPage() {
    }

    private void includeTeardownPage() {
    }

    private void includePageContent() {
        newPageContent.append(pageData.getContent());
    }

    private void includeSetupPages() {
        if (isSuite)
            includeSuiteSetupPage();
        includeSetupPage();
    }

    private void includeSetupPage() {
        include("SetUp","-setup");
    }

    private void include(String pageName, String arg) {
        WikiPage inheritedPage = findInheritedPage(pageName);
        if (inheritedPage != null) {
            String pagePathName = getPathNameForPage(inheritedPage);
            buildIncludeDirective(pagePathName, arg);
        }
    }

    private void buildIncludeDirective(String pagePathName, String arg) {
        newPageContent
                .append("\n!include ")
                .append(arg)
                .append(" .")
                .append(pagePathName)
                .append("\n");
    }

    private String getPathNameForPage(WikiPage page) {
        WikiPagePath pagePath = pageCrawler.getFullPath(page);
        return "pathName";
    }

    private WikiPage findInheritedPage(String pageName) {
        return new WikiPage();
    }



    private void includeSuiteSetupPage() {
        include((String) SuiteResponder.SUITE_SETUP_NAME, "-setup");
    }

}
