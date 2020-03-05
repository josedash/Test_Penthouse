package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPO {

    @FindBy(xpath = "//input[@class='gLFyf gsfi']")
    private WebElement searchInputBox;

    public WebElement getSearchInputBox() {
        return searchInputBox;
    }
}
