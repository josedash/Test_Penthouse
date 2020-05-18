package quicktests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.test.selenium.BrowserCapabilities;
import utils.test.selenium.DriverFactory;
import utils.test.selenium.Selenium;

import java.io.IOException;

public class SeleniumPOC {

    @Test
    public void GoogleBrowser() throws InterruptedException {
        System.out.println("####Sanity ONE");
        WebDriver driver = DriverFactory.getChromeDriver();
        driver.navigate().to("https://www.google.com");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void GoogleBrowser2() throws InterruptedException, IOException {
        System.out.println("####Sanity Three");
        WebDriver driver = DriverFactory.getChromeDriver();
        driver.navigate().to("https://www.google.com");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void FirefoxBrowser() throws InterruptedException {
        System.out.println("####Sanity Three");
        WebDriver driver = DriverFactory.getFireFox();
        driver.navigate().to("https://www.google.com");
        BrowserCapabilities.printBrowserProperties(driver);
        Thread.sleep(3000);
        driver.quit();

    }

}
