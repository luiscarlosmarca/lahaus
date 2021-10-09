package stepdefinitions.mobile;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import java.net.MalformedURLException;

import static questions.mobile.VerListaCiudadesScreen.lasCiudadesNoHabilitadas;
import static questions.mobile.VerLoginScreen.verLoginScreen;
import static stepdefinitions.SetupConfiguration.Lucilly;
import static tasks.mobile.SeleccionaTipoPropiedad.buscaUnApartamento;
import static tasks.mobile.SeleccionaTipoPropiedad.buscarUnaCasa;
import static tasks.mobile.SeleccionaUbicacionPropiedad.seleccionaEl;
import static ui.mobile.Android.HomeScreen.BTN_EMPEZAR_BUSQUEDA;
import static ui.mobile.Android.ParametrosDeBusquedaScreen.BTN_SELECCIONAR_PAIS;
import static util.Constants.*;
import static util.MyMobileFactory.la_haus_main;


public class BusquedaPropiedadStepDefinition {


    @Given("^Inició la busqueda de su propiedad$")
    public void inicióLaBusquedaDeSuPropiedad() throws MalformedURLException {
        Lucilly.can(BrowseTheWeb.with(la_haus_main()));
        Lucilly.attemptsTo(Click.on(BTN_EMPEZAR_BUSQUEDA));
    }

    @When("^el usuario selecciona el (.*) para la ciudad de Medellin$")
    public void elUsuarioSeleccionaElPaisParaLaCiudad(String pais) {
        Lucilly.attemptsTo(seleccionaEl(pais).yLaCiudadDe(MEDELLIN));
        
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
        Lucilly.should(GivenWhenThen.seeThat(verLoginScreen()));
    }


    @When("^el usuario selecciona el (.*) para la ciudad de (.*)$")
    public void elUsuarioSeleccionaElMexicoParaLaCiudadDeMexico(String pais,String ciudad) {
        Lucilly.attemptsTo(seleccionaEl(pais).yLaCiudadDe(ciudad));
    }

    @When("^el usuario selecciona el (.*) para la ciudad de Bogota$")
    public void elUsuarioSeleccionaElColombiaParaLaCiudadDeBogota(String pais) {
        Lucilly.attemptsTo(seleccionaEl(pais).yLaCiudadDe(BOGOTA));
    }


    @When("^el usuario selecciona el (.*)$")
    public void elUsuarioSeleccionaElMexico(String pais) {
        Lucilly.attemptsTo(Click.on(BTN_SELECCIONAR_PAIS.of(pais)));

    }

    @Then("^el usuario visualizará las ciudades inhabilitadas para Mexico$")
    public void elUsuarioVisualizaráLasCiudadesInhabilitadasParaMexico() {
        Lucilly.should(GivenWhenThen.seeThat(lasCiudadesNoHabilitadas()));
    }
}
