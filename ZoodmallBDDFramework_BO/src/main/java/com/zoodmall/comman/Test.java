package com.zoodmall.comman;

class BasePage {
    public String pageUrl = "http://BasePage.com";
    public String getPageUrl() {
        return this.pageUrl;
    }
}

class HomePage extends BasePage {
    public String getPageUrl() {
        this.pageUrl = "http://HomePage.com";
        return this.pageUrl;
    }
}

public class Test {
    public static void main(String[] args) {
        BasePage basePage = new HomePage();
        String pageurl = basePage.getPageUrl();
        System.out.println(pageurl);
    }
}