package questions.mobile;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static interactions.Wait.oneMoment;
import static org.junit.Assert.assertEquals;
import static ui.mobile.Android.LoginScreen.FRAME_LOGIN_GOOGLE;
import static util.MyMobileFactory.myMobileAndroidDriver;

public class VerLoginScreen implements Question<Boolean> {

    public VerLoginScreen() {
    }

    public static VerLoginScreen verLoginScreen(){
        return new VerLoginScreen();
    }



    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(oneMoment(1));
        assertEquals((FRAME_LOGIN_GOOGLE.resolveFor(actor).isPresent()), true);
        myMobileAndroidDriver.quit();
        return true;


    }







}
