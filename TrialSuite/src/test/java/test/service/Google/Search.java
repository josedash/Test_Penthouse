package test.service.Google;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.SearchPO;
import utils.test.selenium.DriverFactory;
import utils.test.selenium.SeleniumUtils;

import java.io.IOException;
import java.time.Duration;

public class Search {

    void getPageObjectInitialized(){
        DriverFactory driverFactory = new DriverFactory();
        SearchPO searchPO = PageFactory.initElements(driverFactory.getChromeDriver(), SearchPO.class);
    }

    @Test
    public void GoogleSanityTest(){
        DriverFactory driverFactory = new DriverFactory();
        WebDriver driver = driverFactory.getChromeDriver();
        driver.navigate().to("https://www.google.com");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.close();
    }

    @Test
    public void GoogleSanityTest2() throws InterruptedException, IOException {
        DriverFactory driverFactory = new DriverFactory();
        WebDriver driver = driverFactory.getChromeDriver();
        driver.get("https://www.google.com");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        SearchPO searchPO = PageFactory.initElements(driver, SearchPO.class);
        wait.until(ExpectedConditions.visibilityOf(searchPO.getSearchInputBox()));
        searchPO.getSearchInputBox().sendKeys("Jose Martinez");
        SeleniumUtils.takeScreenshot();
        Thread.sleep(4000);
        driver.close();
    }

}
