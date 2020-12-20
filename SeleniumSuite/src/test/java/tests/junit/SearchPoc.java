package tests.junit;

import app.google.search.pageobjects.SearchPO;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.test.selenium.BrowserCapabilities;
import utils.test.selenium.DriverFactory;
import utils.test.selenium.Selenium;

import java.io.IOException;
import java.time.Duration;

/**
 * My actual test are Design and execute via cucumber, but I like to use them to verify something is working as expected.
 * You might say a proof of concept.
 * A debate no one talks about, should the test suite framework needs unit test coverage?
 */
public class SearchPoc {

    @Test
    public void straightSelenium() throws InterruptedException {
        System.out.println("####Sanity ONE");
        WebDriver driver = DriverFactory.getChromeDriver();
        driver.navigate().to("https://www.google.com");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void testSuiteTest() throws InterruptedException, IOException {
        System.out.println("####Sanity TWO");
        Selenium.initializeSelenium("chrome");
        Selenium.WEB_DRIVER.get("https://www.google.com");
        SearchPO searchPO = SearchPO.initSearchPO();
        BrowserCapabilities.printBrowserProperties(Selenium.WEB_DRIVER);
        searchPO.getSearchInputBox().sendKeys("Jose Martinez");
        Thread.sleep(3000);
        Selenium.WEB_DRIVER.close();
        Selenium.WEB_DRIVER.quit();
    }

//    @Test
//    public void GridLocalNode() throws InterruptedException, IOException {
//        System.setProperty("webdriver.chrome.driver", "src\\\\test\\\\resources\\\\webdrivers\\\\chromedriver.exe");
//        System.out.println("####Sanity TWO");
//        ChromeOptions caps = new ChromeOptions();
//        caps.setCapability("platform", Platform.WINDOWS);
//        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), caps);
//        driver.get("https://www.google.com");
//        driver.quit();
//    }


//    @Test
//    public void GridVMLinuxNode() throws InterruptedException, IOException {
//        System.out.println("####Sanity TWO");
//        FirefoxOptions caps = BrowserCapabilities.getFireFoxCapabilities();
//        caps.setCapability("platform", Platform.LINUX);
//        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), caps);
//        driver.get("https://www.google.com");
//        Thread.sleep(3000);
//        driver.quit();
//    }

//    @Test
//    public void GridFrameworkTest() throws InterruptedException, IOException {
//        Selenium.initializeSelenium("grid");
//        Selenium.WEB_DRIVER.get("https://www.google.com");
//        Thread.sleep(3000);
//        Thread.sleep(3000);
//        Selenium.closeSelenium();
//    }
}
