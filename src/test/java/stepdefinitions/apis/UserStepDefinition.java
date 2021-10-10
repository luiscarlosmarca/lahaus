package stepdefinitions.apis;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static stepdefinitions.SetupConfiguration.Negan;
import static tasks.apis.CrearUnNuevoUsuario.createAnUser;


public class UserStepDefinition {



    @Given("^Consumiendo la api User se crea un usuario nuevo$")
    public void consumiendoLaApiUserSeCreaUnUsuarioNuevo() {
        Negan.attemptsTo(createAnUser());
    }

    @When("^Lo actualiza$")
    public void loActualiza() {


    }

    @And("^elimina$")
    public void elimina() {

    }

    @Then("^el usuario creado ya no sera visible$")
    public void elUsuarioCreadoYaNoSeraVisible() {
    }
}
