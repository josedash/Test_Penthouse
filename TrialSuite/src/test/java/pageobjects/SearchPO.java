package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.test.selenium.Selenium;

public class SearchPO {

    public static SearchPO initSearchPO (){
        return PageFactory.initElements(Selenium.WEB_DRIVER, SearchPO.class);
    }

    @FindBy(xpath = "//input[@class='gLFyf gsfi']")
    private WebElement searchInputBox;

    public WebElement getSearchInputBox() {
        return searchInputBox;
    }
}
