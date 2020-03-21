package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageobjects.SearchPO;
import utils.test.cucumberReport.CucumberUtils;
import utils.test.selenium.DriverFactory;
import utils.test.selenium.SeleniumUtils;

public class Search {

    SearchPO searchPO;

    public void getPagesObjectsInitialize() {
        searchPO = SearchPO.initSearchPO();
    }  ;

    @Given("^I navigate to \"([^\"]*)\"$")
    public void iNavigateTo(String url) {
        SeleniumUtils.WEB_DRIVER = DriverFactory.getChromeDriver();
        SeleniumUtils.setWaits();
        getPagesObjectsInitialize();
        SeleniumUtils.WEB_DRIVER.get(url);
    }

    @And("^Search for \"([^\"]*)\"$")
    public void searchFor(String searchFor) throws InterruptedException {
        getPagesObjectsInitialize();
        SeleniumUtils.WEB_DRIVER_WAIT.until(ExpectedConditions.visibilityOf(searchPO.getSearchInputBox()));
        searchPO.getSearchInputBox().sendKeys(searchFor);
        Thread.sleep(3000);
        CucumberUtils.addScreenshot();
        SeleniumUtils.WEB_DRIVER.close();
        SeleniumUtils.WEB_DRIVER.quit();
    }

    @Given("I navigate to \"([^\"]*)\" with \"([^\"]*)\"$")
    public void iNavigateToWith(String url, String browser) {
        SeleniumUtils.initializeDrivers(browser);
        SeleniumUtils.setWaits();
        SeleniumUtils.setWebDriverListener();
        getPagesObjectsInitialize();
        SeleniumUtils.EVNT_WEB_DRIVER.navigate().to(url);
    }




}
