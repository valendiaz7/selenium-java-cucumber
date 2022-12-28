package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.PerozziPage;

public class PerozziSteps {

    PerozziPage perozzi = new PerozziPage();

    @Given("^Ingreso a la pagina principal$")
    public void navigateToPerozzi() {
        perozzi.navigateToPerozzi();
    }

    @When("^Busco por (.+)$")
    public void ingresoBusqueda(String criterio) {
        perozzi.ingresoBusqueda(criterio);
        perozzi.clickButton();
    }

    @And("^Clickeo sobre el primer item$")
    public void clickItem() {

    }


}
