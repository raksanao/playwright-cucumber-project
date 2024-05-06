package com.bunch.step_defs;

import com.bunch.pages.HomePage;
import com.bunch.utilities.ConfigurationReader;
import com.bunch.utilities.Driver;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class HomePageStepDefs {

    HomePage homePage;

    @Given("user is on the home page")
    public void user_is_on_the_home_page() {
        Page page = Driver.getInstance().getBrowser().newPage();
        homePage=new HomePage(page);
        homePage.navigateTo(ConfigurationReader.getProperty("url"));

    }
    @Then("user should be able to see title {string}")
    public void user_should_be_able_to_see_title(String expectedTitle) {
        Assert.assertEquals(expectedTitle,homePage.getPage().title());

    }


}
