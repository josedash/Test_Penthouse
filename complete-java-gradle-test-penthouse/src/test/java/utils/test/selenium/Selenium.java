package utils.test.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Selenium {

    public static WebDriver WEB_DRIVER = null;
    public static WebDriverWait WEB_DRIVER_WAIT = null;
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
     * @param browser - firefox, chrome.
     */
    public static void initializeSeleniumComponents(String browser) {
        if(WEB_DRIVER == null){
            getWebDriverFromFromDriverFactory(browser);
            setWaits();
            setWebDriverListener();
        }
    }


    private static void getWebDriverFromFromDriverFactory(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            Selenium.WEB_DRIVER = DriverFactory.getChromeDriver();
        }

        if (browser.equalsIgnoreCase("firefox")) {
            Selenium.WEB_DRIVER = DriverFactory.getFireFox();
        }
    }

    private static void setWaits() {
        WEB_DRIVER_WAIT = new WebDriverWait(WEB_DRIVER, 15);
        WEB_DRIVER.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //TODO POOL Wait
    }

    private static void setWebDriverListener() {
        EVENT_WEB_DRIVER = new EventFiringWebDriver(WEB_DRIVER);
        SeListeners seListeners = new SeListeners();
        EVENT_WEB_DRIVER.register(seListeners);
    }

    public static void closeSelenium() {
        if(WEB_DRIVER != null){
            Selenium.WEB_DRIVER.close();
            Selenium.WEB_DRIVER.quit();
            Selenium.WEB_DRIVER = null;
        }

    }

}
