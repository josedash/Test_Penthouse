package stepdefs.generic;

import cucumber.api.java.en.Given;
import utils.test.selenium.SeleniumUtils;
import utils.test.selenium.Selenium;

/**
 * Step definitions for core selenium tasks.
 */
public class SeleniumSD {

    @Given("^Sel. I navigate to \"([^\"]*)\"$")
    public void iNavigateTo(String url) throws InterruptedException {
        SeleniumUtils.navigateTo(url);
        Thread.sleep(3000);
    }

    @Given("Sel. I navigate to \"([^\"]*)\" with \"([^\"]*)\"$")
    public void iNavigateToWith(String url, String browser) {
        Selenium.initializeSelenium(browser);
        Selenium.EVENT_WEB_DRIVER.navigate().to(url);
    }



}
