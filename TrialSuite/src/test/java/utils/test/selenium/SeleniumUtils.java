package utils.test.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.test.cucumberReport.CucumberUtils;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class SeleniumUtils {

    public static WebDriver WEB_DRIVER;
    public static WebDriverWait WEB_DRIVER_WAIT;
    public static EventFiringWebDriver EVNT_WEB_DRIVER;

    public static void initializeDrivers(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            SeleniumUtils.WEB_DRIVER = DriverFactory.getChromeDriver();
            CucumberUtils.writeMsg("Launch Chrome Browser");
        }
        if (browser.equalsIgnoreCase("firefox")) {
            SeleniumUtils.WEB_DRIVER = DriverFactory.getFireFox();
            CucumberUtils.writeMsg("Launch firefox Browser");
        }
    }

    public static void setWaits() {
        WEB_DRIVER_WAIT = new WebDriverWait(WEB_DRIVER, Duration.ofSeconds(15));
        WEB_DRIVER.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    public static void setWebDriverListener(){
        EVNT_WEB_DRIVER = new EventFiringWebDriver(WEB_DRIVER);
        SeListeners seListeners = new SeListeners();
        EVNT_WEB_DRIVER.register(seListeners);
    }

    public static void click(WebElement webElement) {
        WEB_DRIVER_WAIT.until(ExpectedConditions.visibilityOf(webElement)).click();
    }

    public static void sendKeys(WebElement webElement) {

    }



}
