package utils.test.selenium;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Selenium {

    private static Logger logger = LogManager.getLogger(Selenium.class);

    public static WebDriver WEB_DRIVER = null;
    public static WebDriverWait WAIT = null;
    public static EventFiringWebDriver EVENT_WEB_DRIVER = null;


    /**
     * Default value for Selenium
     */
    public static void initializeSeleniumComponents() {
        initializeSeleniumComponents("chrome");
    }

    /**
     * <h3>Initialize core component for selenium.</h3>
     * <p>webdriver,implicit and explicit wait, webdriver listener.</p>
     *
     * @param browser - firefox, chrome.
     */
    public static void initializeSeleniumComponents(String browser) {
        if (WEB_DRIVER == null) {
            getWebDriverFromFromDriverFactory(browser);
            setWaits();
            setWebDriverListener();
        }
    }


    private static void getWebDriverFromFromDriverFactory(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            Selenium.WEB_DRIVER = DriverFactory.getChromeDriver();
            logger.info("Chrome browser has been fetched.");
        }

        if (browser.equalsIgnoreCase("firefox")) {
            Selenium.WEB_DRIVER = DriverFactory.getFireFox();
            logger.info("Firefox browser has been fetched.");
        }
    }

    private static void setWaits() {
        WAIT = new WebDriverWait(WEB_DRIVER, 15);
        WEB_DRIVER.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        logger.info("Explicit and Implicit wait have been started.");
    }

    private static void setWebDriverListener() {
        EVENT_WEB_DRIVER = new EventFiringWebDriver(WEB_DRIVER);
        SeListeners seListeners = new SeListeners();
        EVENT_WEB_DRIVER.register(seListeners);
        logger.info("Event web listener has been initialized.");
    }

    public static void closeSelenium() {
        if (WEB_DRIVER != null) {
            Selenium.WEB_DRIVER.close();
            Selenium.WEB_DRIVER.quit();
            Selenium.WEB_DRIVER = null;
            logger.info("Selenium has been closed and quit.");
        }
    }

}
