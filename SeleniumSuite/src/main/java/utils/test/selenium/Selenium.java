package utils.test.selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

/**
 * Class to initialize Selenium Components.
 */
public class Selenium {

    public static WebDriver WEB_DRIVER = null;
    public static WebDriverWait WEB_DRIVER_WAIT = null;
    public static EventFiringWebDriver EVENT_WEB_DRIVER = null;
    public static JavascriptExecutor JS_EXECUTOR = null;
    public static final String DEFAULT_BROWSER = "chrome";

    /**
     * Default value for Selenium
     */
    public static void initializeSelenium() {
        initializeSelenium(DEFAULT_BROWSER);
    }

    /**
     * <h3>Initialize core component for selenium.</h3>
     * <p>webdriver,implicit and explicit wait, webdriver listener.</p>
     *
     * @param browser - firefox, chrome.
     */
    public static void initializeSelenium(String browser) {
        if (!"".equalsIgnoreCase(browser.trim()) && browser != null) {
            getWebDriverFromFromDriverFactory(browser);
            setWaits();
            setWebDriverListener();
            setJavascriptExecutor();
        } else {
            initializeSelenium();
        }
    }

    private static void setJavascriptExecutor() {
        JS_EXECUTOR = (JavascriptExecutor) WEB_DRIVER;
    }


    private static void getWebDriverFromFromDriverFactory(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            Selenium.WEB_DRIVER = DriverFactory.getChromeDriver();
        }

        if (browser.equalsIgnoreCase("firefox")) {
            Selenium.WEB_DRIVER = DriverFactory.getFireFox();
        }
        if (browser.equalsIgnoreCase("grid")) {
            Selenium.WEB_DRIVER = DriverFactory.getAvailableGridDriver();
        }
    }

    private static void setWaits() {
        WEB_DRIVER_WAIT = new WebDriverWait(WEB_DRIVER, Duration.ofSeconds(15));
        WEB_DRIVER.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    private static void setWebDriverListener() {
        EVENT_WEB_DRIVER = new EventFiringWebDriver(WEB_DRIVER);
        SeleniumListener seListeners = new SeleniumListener();
        EVENT_WEB_DRIVER.register(seListeners);
    }

    public static void closeSelenium() {
        if (WEB_DRIVER != null) {
            Selenium.WEB_DRIVER.close();
            Selenium.WEB_DRIVER.quit();
            Selenium.WEB_DRIVER = null;
        }

    }

}
