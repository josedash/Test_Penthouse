package utils.test.selenium;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserCapabilities {

        public static ChromeOptions getChromeCapabilities(){
                ChromeOptions options = new ChromeOptions();
                options.addArguments("start-maximized");
                options.addArguments("enable-automation");
                options.addArguments("--no-sandbox");
                options.addArguments("--disable-extensions");
                options.addArguments("--dns-prefetch-disable");
                options.addArguments("--disable-gpu");
                return options;
        }

        public static FirefoxOptions getFireFoxCapabilities(){
                FirefoxProfile firefoxProfile = new FirefoxProfile();
                FirefoxOptions options = new FirefoxOptions();
                options.setProfile(firefoxProfile);
                options.addArguments("start-maximized");
                options.addArguments("enable-automation");
                options.addArguments("-incognito");
                return options;
        }

        public static Capabilities printBrowserProperties(){
                Capabilities caps = ((RemoteWebDriver) Selenium.WEB_DRIVER).getCapabilities();
                String browserName = caps.getBrowserName();
                String browserVersion = caps.getVersion();
                String os = System.getProperty("os.name").toLowerCase();
                System.out.println(browserName);
                System.out.println(browserVersion);
                System.out.println(os);
                return caps;



        }

}

