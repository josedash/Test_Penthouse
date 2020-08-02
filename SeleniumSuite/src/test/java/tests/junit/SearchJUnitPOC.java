package tests.junit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.SearchPO;
import utils.test.selenium.BrowserCapabilities;
import utils.test.selenium.DriverFactory;
import utils.test.selenium.Selenium;
import java.io.IOException;
import java.time.Duration;

public class SearchJUnitPOC {

    @Test
    public void StraightTest() throws InterruptedException {
        System.out.println("####Sanity ONE");
        WebDriver driver = DriverFactory.getChromeDriver();
        driver.navigate().to("https://www.google.com");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void FrameworkTest() throws InterruptedException, IOException {
        System.out.println("####Sanity TWO");
        Selenium.initializeSelenium("chrome"); // must be set in properties file.
        Selenium.WEB_DRIVER.get("https://www.google.com"); // must be set in properties file.
        SearchPO searchPO = SearchPO.initSearchPO();
        BrowserCapabilities.printBrowserProperties(Selenium.WEB_DRIVER);
        searchPO.getSearchInputBox().sendKeys("Jose Martinez");
        Thread.sleep(3000);
        Selenium.WEB_DRIVER.close();
        Selenium.WEB_DRIVER.quit();
    }

       @Test
    public void FireFoxTest() throws InterruptedException {
        System.out.println("####Sanity FOUR");
        WebDriver driver = DriverFactory.getFireFox();
        driver.navigate().to("https://www.google.com");
        BrowserCapabilities.printBrowserProperties(driver);
        Thread.sleep(3000);
        driver.quit();

    }

}
