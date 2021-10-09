package stepdefinitions.apis;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static tasks.apis.ConsumeToUsers.consumeThe;
import static tasks.apis.CreateAnewUser.createAn;
import static stepdefinitions.SetupConfiguration.Negan;


public class UserStepDefinition {

    @Given("^created a (.*) user$")
    public void cratedAnAnloneUser(String user) {
        Negan.attemptsTo(createAn(user));
    }

    @When("^consuming an API (.*)$")
    public void consumingAnAPIUsers(String endpoint) {
        Negan.attemptsTo(consumeThe(endpoint));
    }

    @When("^using the key of a user enterprise an API (.*)$")
    public void usingTheKeyOfUserEnterpriseAnAPIUsers(String endpoint) {
        Negan.attemptsTo(consumeThe(endpoint).withToken());
    }






}
