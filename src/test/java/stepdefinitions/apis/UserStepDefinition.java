package stepdefinitions.apis;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static questions.apis.VerificarCodigoEstado.verificarCodigoEstado;
import static stepdefinitions.SetupConfiguration.Negan;
import static tasks.apis.ActualizarUsuario.actualizarUsuario;
import static tasks.apis.CrearUnNuevoUsuario.createAnUser;
import static tasks.apis.EliminarUsuario.eliminarUsuario;
import static tasks.apis.ListarUsuarios.listarUsuarios;
import static util.Constants.CREACION_EXITOSA;


public class UserStepDefinition {

    @Given("^Consumiendo la api User se crea un usuario nuevo$")
    public void consumiendoLaApiUserSeCreaUnUsuarioNuevo() {
        Negan.attemptsTo(createAnUser());
    }
    @When("^Lo actualiza$")
    public void loActualiza() {
        Negan.attemptsTo(actualizarUsuario());
    }
    @And("^elimina$")
    public void elimina() {
        Negan.attemptsTo(eliminarUsuario());

    }
    @Then("^el usuario creado ya no sera visible$")
    public void elUsuarioCreadoYaNoSeraVisible() {
        Negan.attemptsTo(listarUsuarios());

    }
}
