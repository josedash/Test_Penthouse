package pageobjects.google;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import selenium.Selenium;

public class SearchPO {

    public static SearchPO initSearchPO() {
        return PageFactory.initElements(Selenium.getWebDriver(), SearchPO.class);
    }

    @FindBy(xpath = "//input[@class='gLFyf gsfi']")
    private WebElement searchInputBox;

    public WebElement getSearchInputBox() {
        return searchInputBox;
    }
}
