package utils.test.selenium;

import org.openqa.selenium.WebElement;

import static utils.test.selenium.Selenium.WEB_DRIVER;

/**
 * Store selenium generic methods. DO not include business logic into them.
 */
public class SeUtils {

    public static void navigateTo(String url) {
        WEB_DRIVER.navigate().to(url);
    }

    public static void clickElement(WebElement appointment) {
        appointment.click();
    }
}
