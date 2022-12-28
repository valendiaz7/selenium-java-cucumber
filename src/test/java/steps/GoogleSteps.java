package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.GooglePage;

public class GoogleSteps {

    GooglePage google = new GooglePage();

    @Given("^I am on the google search page$")
    public void navigateToGoogle() {
        google.navigateToGoogle();

    }

    @When("^I enter a search criteria$")
    public void enterSearchCriteria() {
        google.enterSearchCriteria("Google");
    }

    @And("^click on the search button$")
    public void clickSearchButton() {
        google.clickGoogleSearch();

    }

    @Then("^The results match the criteria$")
    public void validateResults() {
        Assert.assertEquals("Texto que esperamos", google.firstResult());
    }
}
