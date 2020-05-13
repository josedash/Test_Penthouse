package utils.test.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.test.cucumberReport.CucumberReport;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

/**
 * Class to initialize Selenium Components.
 */
public class Selenium {

    public static WebDriver WEB_DRIVER = null;
    public static WebDriverWait WEB_DRIVER_WAIT = null;
    public static EventFiringWebDriver EVENT_WEB_DRIVER = null;

    /**
     * Default value for Selenium
     */
    public static void initializeSelenium() {
        initializeSelenium("chrome");
    }

    /**
     * Specify Browser
     * @param browser
     */
    public static void initializeSelenium(String browser) {
        if(WEB_DRIVER == null){
            getWebDriverFromFromDriverFactory(browser);
            setWaits();
            setWebDriverListener();
            CucumberReport.writeMsg("Driver already started.");
        }
    }


    private static void getWebDriverFromFromDriverFactory(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            Selenium.WEB_DRIVER = DriverFactory.getChromeDriver();
            CucumberReport.writeMsg("Launch Chrome Browser");
        }

        if (browser.equalsIgnoreCase("firefox")) {
            Selenium.WEB_DRIVER = DriverFactory.getFireFox();
            CucumberReport.writeMsg("Launch Firefox Browser");
        }
    }

    private static void setWaits() {
        WEB_DRIVER_WAIT = new WebDriverWait(WEB_DRIVER, Duration.ofSeconds(15));
        WEB_DRIVER.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //TODO POOL Wait
    }

    private static void setWebDriverListener() {
        EVENT_WEB_DRIVER = new EventFiringWebDriver(WEB_DRIVER);
        SeListeners seListeners = new SeListeners();
        EVENT_WEB_DRIVER.register(seListeners);
    }

    public static void closeSeleniumIfOpen() {
        if(WEB_DRIVER != null){
            Selenium.WEB_DRIVER.close();
            Selenium.WEB_DRIVER.quit();
            Selenium.WEB_DRIVER = null;
        }

    }

}
