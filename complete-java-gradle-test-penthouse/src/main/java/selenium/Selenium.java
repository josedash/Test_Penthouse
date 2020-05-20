package selenium;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class Selenium {

    private static Logger logger = LogManager.getLogger(Selenium.class);

    private static ThreadLocal<WebDriver> WEB_DRIVER = new ThreadLocal<WebDriver>();
    private static ThreadLocal<WebDriverWait> WAIT = new ThreadLocal<WebDriverWait>();
    private static ThreadLocal<FluentWait> FLUENT_WAIT = new ThreadLocal<FluentWait>();
    private static ThreadLocal<EventFiringWebDriver> EVENT_WEB_DRIVER = new ThreadLocal<EventFiringWebDriver>();

    public static WebDriver getWebDriver() {
        return WEB_DRIVER.get();
    }

    public static WebDriverWait getWait() {
        return WAIT.get();
    }

    public static FluentWait getFluentWait() {
        return FLUENT_WAIT.get();
    }

    public static EventFiringWebDriver getWebDriverList() {
        return EVENT_WEB_DRIVER.get();

    }

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
        if (WEB_DRIVER.get() == null) {
            getWebDriverFromFromDriverFactory(browser);
            setWaits();
            setWebDriverListener();
        }
    }


    private static void getWebDriverFromFromDriverFactory(String browser) {
        switch (browser) {
            case "chrome":
                Selenium.WEB_DRIVER.set(DriverFactory.getChromeDriver());
                logger.info("Chrome browser has been fetched.");
                break;
            case "firefox":
                Selenium.WEB_DRIVER.set(DriverFactory.getFireFox());
                logger.info("Firefox browser has been fetched.");
                break;
            case "mobilechrome":
                Selenium.WEB_DRIVER.set(DriverFactory.getMobileChrome());
                logger.info("Chrome with mobile settings has been fetched.");
                break;
            default:
                logger.error("Browser not handle.");
                break;
        }
    }

    private static void setWaits() {
        WAIT.set(new WebDriverWait(WEB_DRIVER.get(), 15));
        WEB_DRIVER.get().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        FLUENT_WAIT.set(new FluentWait<WebDriver>(WEB_DRIVER.get())
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class));
        logger.info("Explicit and Implicit wait have been started.");
    }

    private static void setWebDriverListener() {
        EVENT_WEB_DRIVER.set(new EventFiringWebDriver(WEB_DRIVER.get()));
        SeListeners seListeners = new SeListeners();
        EVENT_WEB_DRIVER.get().register(seListeners);
        logger.info("Event web listener has been initialized.");
    }

    public static void closeSelenium() {
        if (WEB_DRIVER.get() != null) {
            WEB_DRIVER.get().close();
            WEB_DRIVER.get().quit();
            WEB_DRIVER.remove();
            logger.info("Selenium has been closed and quit.");
        }
    }

}
