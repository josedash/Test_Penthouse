package tests.components;

import pageobjects.SearchPO;
import utils.test.cucumberReport.CucumberReport;
import utils.test.selenium.SeValidations;

public class SearchForTest {

    private static SearchPO searchPO;

    public static void getPagesObjectsInitialize() {
        searchPO = SearchPO.initSearchPO();
    };

    public static void searchFor(String searchFor) throws InterruptedException {
        getPagesObjectsInitialize();
        SeValidations.isVisible(searchPO.getSearchInputBox());
        searchPO.getSearchInputBox().sendKeys(searchFor);
        Thread.sleep(3000);
        CucumberReport.addScreenshot();
    }

}
