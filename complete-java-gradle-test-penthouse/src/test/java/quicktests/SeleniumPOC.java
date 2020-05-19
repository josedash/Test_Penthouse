package quicktests;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.google.SearchPO;
import selenium.BrowserCapabilities;
import selenium.DriverFactory;
import selenium.Selenium;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import java.io.IOException;

public class SeleniumPOC {

    private static Logger logger = LogManager.getLogger(SeleniumPOC.class);

    @Test
    public void GoogleBrowserTest() throws InterruptedException, IOException {
        WebDriver driver = DriverFactory.getChromeDriver();
        driver.navigate().to("https://www.google.com");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.close();
        driver.quit();
    }

    @Test
    public void GoogleBrowserTestHeadless() throws InterruptedException, IOException {
        WebDriver driver = DriverFactory.getChromeDriver();
        driver.navigate().to("https://www.google.com");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.close();
        driver.quit();
    }

    @Test
    public void MobileGoogleBrowser() throws InterruptedException, IOException {
        Selenium.initializeSeleniumComponents("mobilechrome");
        Selenium.getWebDriver().navigate().to("https://www.google.com");
        BrowserCapabilities.printBrowserProperties();
        Thread.sleep(3000);
        Selenium.closeSelenium();
    }


    @Test
    public void FirefoxBrowserTest() throws InterruptedException {
        Selenium.initializeSeleniumComponents("firefox");
        Selenium.getWebDriver().navigate().to("https://www.google.com");
        BrowserCapabilities.printBrowserProperties();
        Thread.sleep(3000);
        Selenium.closeSelenium();
    }

    @Test
    public void GooglePageObjectTest() throws InterruptedException, IOException {
        Selenium.initializeSeleniumComponents();
        Selenium.getWebDriver().get("https://www.google.com");
        SearchPO searchPO = SearchPO.initSearchPO();
        BrowserCapabilities.printBrowserProperties();
        Selenium.getWait().until(ExpectedConditions.visibilityOf(searchPO.getSearchInputBox()));
        Selenium.getWait().until(ExpectedConditions.elementToBeClickable(searchPO.getSearchInputBox()));
        searchPO.getSearchInputBox().sendKeys("Jose Martinez");
        Thread.sleep(3000);
    }

    @After
    public void finalizeSelenium(){
        Selenium.closeSelenium();
    }

}
