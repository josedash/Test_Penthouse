package test.service.Google;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.SearchPO;
import utils.test.selenium.DriverFactory;
import utils.test.selenium.SeleniumUtils;

import java.io.IOException;
import java.time.Duration;

public class Search {



    @Test
    public void GoogleSanityTest(){
        DriverFactory driverFactory = new DriverFactory();
        WebDriver driver = driverFactory.getChromeDriver();
        driver.navigate().to("https://www.google.com");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.quit();
    }

    @Test
    public void GoogleSanityTest2() throws InterruptedException, IOException {
        SearchPO searchPO = SearchPO.initSearchPO();
        WebDriver driver = SeleniumUtils.webDriver;
        driver.get("https://www.google.com");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(searchPO.getSearchInputBox()));
        searchPO.getSearchInputBox().sendKeys("Jose Martinez");

        Thread.sleep(4000);
        driver.close();
    }

}
