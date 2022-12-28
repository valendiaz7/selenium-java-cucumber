package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.MaximusPage;

public class MaximusSteps {

    MaximusPage maximus = new MaximusPage();

    @Given("^Ingreso a la home page$")
    public void navigateToMaximus() {
        maximus.navigateToMaximus();

    }

    @When("^Busco por (.+)$")
    public void enterSearchCriteria(String criteria) {
        maximus.enterSearchCriteria(criteria);
        maximus.clickSearchButton();

    }

    @And("^Clickeo en el boton de busqueda$")
    public void clickSearchButton() {

    }

    @Then("^Valido que no exista el criterio buscado$")
    public void validateResults() {
        Assert.assertEquals("CATEGORIA SIN ARTICULOS", maximus.messageText());

    }

}
