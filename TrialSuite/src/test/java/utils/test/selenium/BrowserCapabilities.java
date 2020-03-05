package utils.test.selenium;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class BrowserCapabilities {

        public static ChromeOptions getChromeCapabilities(){
                ChromeOptions options = new ChromeOptions();
                options.addArguments("start-maximized");
                options.addArguments("enable-automation");
                options.addArguments("--no-sandbox");
                options.addArguments("--disable-dev-shm-usage");
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


}

