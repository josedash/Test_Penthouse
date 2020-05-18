package quicktests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.google.SearchPO;
import utils.test.selenium.BrowserCapabilities;
import utils.test.selenium.DriverFactory;
import utils.test.selenium.Selenium;

import java.io.IOException;

public class SeleniumPOC {

    @Test
    public void GoogleBrowserTest() throws InterruptedException, IOException {
        WebDriver driver = DriverFactory.getChromeDriver();
        driver.navigate().to("https://www.google.com");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        Thread.sleep(3000);
        Selenium.closeSelenium();
    }

    @Test
    public void FirefoxBrowserTest() throws InterruptedException {
        WebDriver driver = DriverFactory.getFireFox();
        driver.navigate().to("https://www.google.com");
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
        searchPO.getSearchInputBox().sendKeys("Jose Martinez");
        Thread.sleep(3000);
        Selenium.closeSelenium();
    }

}
