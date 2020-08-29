package app.google.implementation;

import app.google.pageobjects.SearchPO;
import utils.test.cucumberReport.CucumberReport;
import utils.test.selenium.SeleniumValidations;

public class GoogleSearch {

    private static SearchPO searchPO;

    public static void getPagesObjectsInitialize() {
        searchPO = SearchPO.initSearchPO();
    };

    public static void searchFor(String searchFor) throws InterruptedException {
        getPagesObjectsInitialize();
        SeleniumValidations.isVisible(searchPO.getSearchInputBox());
        searchPO.getSearchInputBox().sendKeys(searchFor);
        Thread.sleep(3000);
        CucumberReport.addScreenshot();
    }

}
