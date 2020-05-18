package stepdefs.generic;

import cucumber.api.java.en.Given;
import utils.test.selenium.SeUtils;
import utils.test.selenium.Selenium;

/**
 * Step definitions for core selenium tasks.
 */
public class SeleniumStepDef {

    @Given("^I navigate to \"([^\"]*)\"$")
    public void iNavigateTo(String url) throws InterruptedException {
        Selenium.initializeSelenium();
        SeUtils.navigateTo(url);
        Thread.sleep(3000);
    }

    @Given("I navigate to \"([^\"]*)\" with \"([^\"]*)\"$")
    public void iNavigateToWith(String url, String browser) {
        Selenium.initializeSelenium(browser);
        Selenium.EVENT_WEB_DRIVER.navigate().to(url);
    }

}
