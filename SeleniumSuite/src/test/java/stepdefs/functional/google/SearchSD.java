package stepdefs.functional.google;

import cucumber.api.java.en.And;
import app.google.implementation.GoogleSearch;

public class SearchSD {

    @And("^Search for \"([^\"]*)\"$")
    public void searchFor(String searchFor) throws InterruptedException {
        GoogleSearch.searchFor(searchFor);
    }


}
