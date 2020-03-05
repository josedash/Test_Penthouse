package utils.test.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class SeleniumUtils {

    public static final WebDriver WEB_DRIVER = DriverFactory.getChromeDriver();
    public static final WebDriverWait WEB_DRIVER_WAIT = new WebDriverWait(WEB_DRIVER, Duration.ofSeconds(15));

    public static void click(WebElement webElement){
        WEB_DRIVER_WAIT.until(ExpectedConditions.visibilityOf(webElement)).click();
    }

    public static void sendKeys(WebElement webElement){

    }




}
