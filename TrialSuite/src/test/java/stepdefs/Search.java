package stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageobjects.SearchPO;
import utils.test.cucumberReport.CucumberUtils;
import utils.test.selenium.SeleniumUtils;



/**
 * created by Jose J Martinez
 */
public class Search {

    SearchPO searchPO;

    public void getPagesObjectsInitialize() {
        searchPO = SearchPO.initSearchPO();
    }

    @And("^Search for \"([^\"]*)\"$")
    public void searchFor(String searchFor) throws InterruptedException {
        getPagesObjectsInitialize();
        SeleniumUtils.WEB_DRIVER_WAIT.until(ExpectedConditions.visibilityOf(searchPO.getSearchInputBox()));
        searchPO.getSearchInputBox().sendKeys(searchFor);
        CucumberUtils.addScreenshot();
        SeleniumUtils.WEB_DRIVER.close();
        SeleniumUtils.WEB_DRIVER.quit();
    }

    @Given("I navigate to \"([^\"]*)\" with \"([^\"]*)\"")
    public void iNavigateToWith(String url, String browser) {
        SeleniumUtils.initializeWebDriver(browser);
        SeleniumUtils.setWaits();
        SeleniumUtils.WEB_DRIVER.get(url);
    }


}
