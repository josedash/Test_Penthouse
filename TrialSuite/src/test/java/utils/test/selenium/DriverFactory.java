package utils.test.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class DriverFactory {

    private static final Map<String, Supplier<WebDriver>> BROWSERS = new HashMap<>();

    private static final Supplier<WebDriver> chromeSupplier =()->{
        System.setProperty("webdriver.chrome.driver","src\\\\test\\\\resources\\\\webdrivers\\\\chromedriver.exe");
        return new ChromeDriver(BrowserCapabilities.getChromeCapabilities());
    };

    private static final Supplier<WebDriver> fireFoxSupplier =()->{
        System.setProperty("","");
        return new FirefoxDriver(BrowserCapabilities.getFireFoxCapabilities());
    };

    static {
        BROWSERS.put("chrome", chromeSupplier);
//        BROWSERS.put("chrome", fireFoxSupplier);
    }

    public static WebDriver getDriver(String name){
        return BROWSERS.get(name).get();
    }

    public static WebDriver getChromeDriver(){
        return BROWSERS.get("chrome").get();
    }

    public static WebDriver getFireFox(){
        return BROWSERS.get("firefox").get();
    }


}
