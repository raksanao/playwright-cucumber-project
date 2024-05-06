package com.bunch.pages;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;

public class HomePage {

    private final Page page;

    public HomePage(Page page) {
        this.page = page;
    }

    public void navigateTo(String url) {
        page.navigate(url);
    }

    public void search(String word) {
        page.fill("input[name='q']", word);

    }


    public static HomePage openLoginPage(Browser browser, String url) {
        BrowserContext context = browser.newContext();
        Page page = context.newPage();
        page.navigate(url);
        return new HomePage(page);
    }

    public void close() {
        page.close();
    }
    public  Page getPage(){

        return page;
    }

}
