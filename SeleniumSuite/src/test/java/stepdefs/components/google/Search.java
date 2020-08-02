package stepdefs.components.google;

import cucumber.api.java.en.And;
import tests.functional.GoogleSearch;

public class Search {

    @And("^Search for \"([^\"]*)\"$")
    public void searchFor(String searchFor) throws InterruptedException {
        GoogleSearch.searchFor(searchFor);
    }


}
