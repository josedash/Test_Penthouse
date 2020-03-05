package test.service.Google;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.SearchPO;
import utils.test.selenium.BrowserCapabilities;
import utils.test.selenium.DriverFactory;
import utils.test.selenium.SeleniumUtils;

import java.io.IOException;
import java.time.Duration;


public class Search {



    @Test
    public void GoogleSanityTest() throws InterruptedException {
        System.out.println("####Sanity ONE");
        WebDriver driver = DriverFactory.getChromeDriver();
        driver.navigate().to("https://www.google.com");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Thread.sleep(3000);
        driver.quit();

    }

    @Test
    public void GoogleSanityTest2() throws InterruptedException, IOException {
        System.out.println("####Sanity TWO");
        SeleniumUtils.WEB_DRIVER.get("https://www.google.com");
        SearchPO searchPO = SearchPO.initSearchPO();
        BrowserCapabilities.printCurrentCapabilities(SeleniumUtils.WEB_DRIVER);
        searchPO.getSearchInputBox().sendKeys("Jose Martinez");
        Thread.sleep(3000);
        SeleniumUtils.WEB_DRIVER.close();
        SeleniumUtils.WEB_DRIVER.quit();
    }

    @Test
    public void GoogleSanityTest3() throws InterruptedException, IOException {
        System.out.println("####Sanity Three");
        DriverFactory driverFactory = new DriverFactory();
        WebDriver driver = DriverFactory.getChromeDriver();
        driver.navigate().to("https://www.google.com");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Thread.sleep(3000);
        driver.quit();
    }
}
