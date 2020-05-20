package selenium;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.HashMap;
import java.util.Map;

public class BrowserCapabilities {

        private static Logger LOGGER = LogManager.getLogger(BrowserCapabilities.class);

        public static ChromeOptions getChromeCapabilities(){
                ChromeOptions options = new ChromeOptions();
                options.addArguments("start-maximized");
                options.addArguments("enable-automation");
                options.addArguments("--no-sandbox");
                options.addArguments("--disable-extensions");
                options.addArguments("--dns-prefetch-disable");
                options.addArguments("--disable-gpu");
                //TODO implement configurable.
                options.addArguments("--headless");
                return options;
        }

        public static ChromeOptions getMobileChromeCapabilities(){
                ChromeOptions options = new ChromeOptions();
                Map<String, String> mobileEmulation = new HashMap<>();
                mobileEmulation.put("deviceName","iPhone X");
                options.setExperimentalOption("mobileEmulation", mobileEmulation);
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
                Capabilities caps = ((RemoteWebDriver) Selenium.getWebDriver()).getCapabilities();
                String browserName = caps.getBrowserName();
                String browserVersion = caps.getVersion();
                String os = System.getProperty("os.name").toLowerCase();
                LOGGER.info("Browser Name : " + browserName);
                LOGGER.info("Browser Version : " + browserVersion);
                LOGGER.info("OS : " + os);
                return caps;
        }

}

