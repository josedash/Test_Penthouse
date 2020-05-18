package quicktests;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.google.SearchPO;
import utils.test.selenium.BrowserCapabilities;
import utils.test.selenium.DriverFactory;
import utils.test.selenium.Selenium;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import java.io.IOException;
import java.time.Duration;

public class SeleniumPOC {

    private static Logger logger = LogManager.getLogger(SeleniumPOC.class);

    @Test
    public void GoogleBrowserTest() throws InterruptedException, IOException {
        WebDriver driver = DriverFactory.getChromeDriver();
        driver.navigate().to("https://www.google.com");
        WebDriverWait wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void FirefoxBrowserTest() throws InterruptedException {
        Selenium.initializeSeleniumComponents("firefox");
        Selenium.WEB_DRIVER.navigate().to("https://www.google.com");
        BrowserCapabilities.printBrowserProperties();
        Thread.sleep(3000);
        Selenium.closeSelenium();
    }

    @Test
    public void GooglePageObjectTest() throws InterruptedException, IOException {
        Selenium.initializeSeleniumComponents();
        Selenium.WEB_DRIVER.get("https://www.google.com");
        SearchPO searchPO = SearchPO.initSearchPO();
        BrowserCapabilities.printBrowserProperties();
        Selenium.WAIT.until(ExpectedConditions.visibilityOf(searchPO.getSearchInputBox()));
        Selenium.WAIT.until(ExpectedConditions.elementToBeClickable(searchPO.getSearchInputBox()));
        searchPO.getSearchInputBox().sendKeys("Jose Martinez");
        Thread.sleep(3000);
    }

    @After
    public void finalizeSelenium(){
        Selenium.closeSelenium();
    }

}
