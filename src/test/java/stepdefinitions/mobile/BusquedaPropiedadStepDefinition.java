package stepdefinitions.mobile;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;

import java.net.MalformedURLException;

import static stepdefinitions.SetupConfiguration.Lucilly;
import static tasks.mobile.SeleccionaTipoPropiedad.buscaUnApartamento;
import static tasks.mobile.SeleccionaTipoPropiedad.buscarUnaCasa;
import static tasks.mobile.SeleccionaUbicacionPropiedad.seleccionaEl;
import static ui.mobile.Android.HomeScreen.BTN_EMPEZAR_BUSQUEDA;
import static util.MyMobileFactory.la_haus_main;


public class BusquedaPropiedadStepDefinition {


    @Given("^Inició la busqueda de su propiedad$")
    public void inicióLaBusquedaDeSuPropiedad() throws MalformedURLException {
        Lucilly.can(BrowseTheWeb.with(la_haus_main()));
        Lucilly.attemptsTo(Click.on(BTN_EMPEZAR_BUSQUEDA));


    }

    @When("^el usuario selecciona el (.*) para la (.*)$")
    public void elUsuarioSeleccionaElPaisParaLaCiudad(String pais, String ciudad) {
        Lucilly.attemptsTo(seleccionaEl(pais).yLa(ciudad));
        
    }

    @And("^selecciona el tipo de vivienda Casa$")
    public void seleccionaElTipoDeViviendaCasa() {
        Lucilly.attemptsTo(buscarUnaCasa());
    }

    @And("^selecciona el tipo de vivienda Apartamento$")
    public void seleccionaElTipoDeViviendaApartamento() {
        Lucilly.attemptsTo(buscaUnApartamento());
    }


    @Then("^el usuario visualizará el módulo de login$")
    public void elUsuarioVisualizaráElMóduloDeLogin() {


    }


}
