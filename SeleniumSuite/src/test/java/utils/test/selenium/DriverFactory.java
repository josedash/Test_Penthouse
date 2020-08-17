package utils.test.selenium;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class DriverFactory {

    private static final Map<String, Supplier<WebDriver>> BROWSERS = new HashMap<>();
    //TODO implement file path separator that should work no matter the os.
    private static final String filePathSep = String.valueOf(File.pathSeparatorChar);


    private static final Supplier<WebDriver> chromeSupplier = () -> {
        System.setProperty("webdriver.chrome.driver", "src\\\\test\\\\resources\\\\webdrivers\\\\chromedriver.exe");
        return new ChromeDriver(BrowserCapabilities.getChromeCapabilities(null));
    };

    private static final Supplier<WebDriver> firefoxSuppler = () -> {
        System.setProperty("webdriver.gecko.driver", "src\\\\test\\\\resources\\\\webdrivers\\\\geckodriver.exe");
        return new FirefoxDriver(BrowserCapabilities.getFireFoxCapabilities());
    };

    private static final Supplier<WebDriver> gridDriverSuppler = () -> {
        FirefoxOptions cap = BrowserCapabilities.getFireFoxCapabilities();
        cap.setCapability("platform", Platform.LINUX);
        try {
            return new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
    };

    public static WebDriver gridDriver(Platform os, String browser) throws MalformedURLException {
        if("chrome".equalsIgnoreCase(browser.trim())){
            return new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),
                    BrowserCapabilities.getChromeCapabilities(os));
        }

        if("firefox".equalsIgnoreCase(browser.trim())){
            return new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),
                    BrowserCapabilities.getChromeCapabilities(os));
        }

        return null;
    }

    static {
        BROWSERS.put("chrome", chromeSupplier);
        BROWSERS.put("firefox", firefoxSuppler);
        BROWSERS.put("grid", gridDriverSuppler);
    }


    public WebDriver getDriver(String name) {
        return BROWSERS.get(name).get();
    }

    public static WebDriver getAvailableGridDriver() {
        return BROWSERS.get("grid").get();
    }

    public static WebDriver getChromeDriver() {
        return BROWSERS.get("chrome").get();
    }

    public static WebDriver getFireFox() {
        return BROWSERS.get("firefox").get();
    }

}
