package utils.test.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class SeleniumUtils {

    public static WebDriver WEB_DRIVER;
    public static WebDriverWait WEB_DRIVER_WAIT;

    public static void initializeWebDriver(String browser) {
        if("firefox".equalsIgnoreCase(browser)){
            SeleniumUtils.WEB_DRIVER = DriverFactory.getFireFox();
        }
        if("chrome".equalsIgnoreCase(browser)){
            SeleniumUtils.WEB_DRIVER = DriverFactory.getChromeDriver();
        }
    }

    public static void setWaits() {
        WEB_DRIVER_WAIT = new WebDriverWait(WEB_DRIVER, Duration.ofSeconds(15));
        WEB_DRIVER.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    public static void click(WebElement webElement) {
        WEB_DRIVER_WAIT.until(ExpectedConditions.visibilityOf(webElement)).click();
    }

    public static void sendKeys(WebElement webElement) {

    }



}
