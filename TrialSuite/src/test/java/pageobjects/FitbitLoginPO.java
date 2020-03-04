package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FitbitLoginPO {

    @FindBy(xpath = "")
    private WebElement email;

    @FindBy(xpath = "")
    private WebElement password;

}
