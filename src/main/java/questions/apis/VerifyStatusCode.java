package questions.apis;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;



public class VerifyStatusCode implements Question<Boolean> {

    int code;

    public VerifyStatusCode(int code) {
        this.code = code;
    }

    public static VerifyStatusCode verifyStatusCode(int code){
        return new VerifyStatusCode(code);
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        return SerenityRest.lastResponse().statusCode()==code;
    }

}
