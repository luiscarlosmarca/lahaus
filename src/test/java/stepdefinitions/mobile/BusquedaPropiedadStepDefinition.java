package stepdefinitions.mobile;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import java.net.MalformedURLException;

import static stepdefinitions.SetupConfiguration.Lucilly;
import static tasks.mobile.SetupMobile.openApp;
import static util.MyMobileFactory.la_haus_main;


public class BusquedaPropiedadStepDefinition {


    @Given("^Inició la busqueda de su propiedad$")
    public void inicióLaBusquedaDeSuPropiedad() throws MalformedURLException {
        Lucilly.can(BrowseTheWeb.with(la_haus_main()));

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
