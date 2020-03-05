package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.test.selenium.SeleniumUtils;

public class SearchPO {

    public static SearchPO initSearchPO (){
        SearchPO searchPO = PageFactory.initElements(SeleniumUtils.webDriver, SearchPO.class);
        return searchPO;
    }

    @FindBy(xpath = "//input[@class='gLFyf gsfi']")
    private WebElement searchInputBox;

    public WebElement getSearchInputBox() {
        return searchInputBox;
    }
}
