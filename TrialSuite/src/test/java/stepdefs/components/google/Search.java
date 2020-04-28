package stepdefs.components.google;

import cucumber.api.java.en.And;
import tests.components.Google.SearchForTest;

public class Search {

    @And("^Search for \"([^\"]*)\"$")
    public void searchFor(String searchFor) throws InterruptedException {
        SearchForTest.searchFor(searchFor);
    }


}
