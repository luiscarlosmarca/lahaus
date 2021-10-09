package stepdefinitions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.thucydides.core.annotations.Managed;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;

import static util.MyMobileFactory.myMobileAndroidDriver;
public class SetupConfiguration {
    public static Actor Negan;
    public static Actor Lucilly;
    @Managed(uniqueSession = true)
    public WebDriver hisBrowser;

    @Before
    public void prepareStage() {

        String theRestApiBaseUrl = (System.getProperty("baseUrl"));

        Negan = Actor.named("The user of apis");
        Negan.can(CallAnApi.at(theRestApiBaseUrl));
        OnStage.setTheStage(new OnlineCast());

        Lucilly = Actor.named("The user mobile");
        Lucilly.whoCan(BrowseTheWeb.with(myMobileAndroidDriver));



    }


}
