package stepdefinitions.mobile;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static stepdefinitions.SetupConfiguration.Negan;
import static stepdefinitions.SetupConfiguration.RickGrimes;
import static tasks.apis.CreateAnewUser.createAn;


public class BusquedaPropiedadStepDefinition {

    @Given("^created a (.*) user$")
    public void cratedAnAnloneUser(String user) {
        Negan.attemptsTo(createAn(user));
    }


    @Given("^Inició la busqueda de su propiedad$")
    public void inicióLaBusquedaDeSuPropiedad() {
        
    }

    @When("^el usuario selecciona el (.*) para la (.*)$")
    public void elUsuarioSeleccionaElPaisParaLaCiudad(String pais, String ciudad) {
        
    }


    @And("^selecciona el tipo de vivienda (.*)$")
    public void seleccionaElTipoDeViviendaCasa(String tipo_vivienda) {
    }

    @Then("^el usuario visualizará el módulo de login$")
    public void elUsuarioVisualizaráElMóduloDeLogin() {
    }
}
