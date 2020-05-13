package utils.test.selenium;

import static utils.test.selenium.Selenium.WEB_DRIVER;

public class SeUtils {

    public static void navigateTo(String url) {
        WEB_DRIVER.navigate().to(url);
    }



}
