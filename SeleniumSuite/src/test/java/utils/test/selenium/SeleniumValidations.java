package utils.test.selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SeleniumValidations {

    public static void isVisible(WebElement element){
        Selenium.WEB_DRIVER_WAIT.until(ExpectedConditions.visibilityOf(element));
    }

    public static void isClickable(){

    }

    public static void isEnabled(){

    }

}
