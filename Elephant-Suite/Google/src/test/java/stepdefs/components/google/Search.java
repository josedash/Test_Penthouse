package stepdefs.components.google;


import io.cucumber.java.en.And;
import tests.search.SearchForTest;

public class Search {

    @And("^Search for \"([^\"]*)\"$")
    public void searchFor(String searchFor) throws InterruptedException {
        SearchForTest.searchFor(searchFor);
    }


}
