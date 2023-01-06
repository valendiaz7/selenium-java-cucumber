package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.UdemyPage;

public class UdemySteps {

    UdemyPage Udemy = new UdemyPage();

    @Given("^Ingresamos a la home de Udemy$")
    public void navigateToUdemy() {
        Udemy.navigateToUdemy();
    }

    @When("^Ingreso un criterio de busqueda$")
    public void enterSearchCriteria() {
        Udemy.enterSearchCriteria();
    }

    @And("^Clickeo en el boton search$")
    public void clickButtonSearch() {
        Udemy.clickButton();
    }

    @And("^Aplico filtros ordenar por e idioma$")
    public void aplyFilters() {
        Udemy.aplyFilters();
    }

    @Then("^Valido la cantidad de cursos disponibles$")
    public void validateResults() {
        Udemy.validateResults();
    }


}
