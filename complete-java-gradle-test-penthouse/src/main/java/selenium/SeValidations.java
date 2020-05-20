package selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SeValidations {

    public static void isVisible(WebElement element) {
        Selenium.getWait().until(ExpectedConditions.visibilityOf(element));
    }

    public static void isEnabled() {

    }

}
