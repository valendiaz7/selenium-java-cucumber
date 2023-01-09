package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.UdemyPage;

public class UdemySteps {

    UdemyPage Udemy = new UdemyPage();

    @Given("^Ingresamos a la home de Udemy$")
    public void navigateToUdemy() {
        Udemy.navigateToUdemy();
    }

    @When("^Ingreso un criterio de busqueda$")
    public void enterSearchCriteria() {
        Udemy.enterSearchCriteria("Java con selenium");
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
        Assert.assertEquals("436 resultados para “Java con selenium”", Udemy.coursesMessage());
    }


}
