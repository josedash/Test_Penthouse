package stepdefs.components.google;

import cucumber.api.java.en.And;
import pageobjects.SearchPO;
import utils.test.cucumberReport.CucumberReport;
import utils.test.selenium.SeValidations;

public class Search {

    SearchPO searchPO;

    public void getPagesObjectsInitialize() {
        searchPO = SearchPO.initSearchPO();
    };

    @And("^Search for \"([^\"]*)\"$")
    public void searchFor(String searchFor) throws InterruptedException {
        getPagesObjectsInitialize();
        SeValidations.isVisible(searchPO.getSearchInputBox());
        searchPO.getSearchInputBox().sendKeys(searchFor);
        Thread.sleep(3000);
        CucumberReport.addScreenshot();
    }





}
