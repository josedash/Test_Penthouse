package utils.test.selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SeValidations {

    public static void isVisible(WebElement element) {
        Selenium.WAIT.until(ExpectedConditions.visibilityOf(element));
    }

    public static void isEnabled() {

    }

}
