package stepdefs.functional.google;

import cucumber.api.java.en.And;
import app.google.search.ui.GoogleSearch;

/**
 * This is only a map for automation, i dont usually like to put everything in here as
 * sometimes you will have to include business logic and it will be a mess.
 */
public class SearchStepDef {

    @And("^Search for \"([^\"]*)\"$")
    public void searchFor(String searchFor) throws InterruptedException {
        GoogleSearch.searchFor(searchFor);
    }
}
