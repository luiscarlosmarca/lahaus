package questions.mobile;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static interactions.Wait.oneMoment;
import static org.junit.Assert.assertEquals;

import static ui.mobile.Android.LoginScreen.VIEW_NO_HABILITADA;
import static util.MyMobileFactory.myMobileAndroidDriver;

public class VerListaCiudadesScreen implements Question<Boolean> {

    public VerListaCiudadesScreen() {
    }

    public static VerListaCiudadesScreen lasCiudadesNoHabilitadas(){
        return new VerListaCiudadesScreen();
    }



    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(oneMoment(1));
        assertEquals((VIEW_NO_HABILITADA.resolveFor(actor).isDisabled()), true);
        myMobileAndroidDriver.quit();
        return true;


    }







}
