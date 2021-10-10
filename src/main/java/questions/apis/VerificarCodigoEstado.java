package questions.apis;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;



public class VerificarCodigoEstado implements Question<Boolean> {

    int code;

    public VerificarCodigoEstado(int code) {
        this.code = code;
    }

    public static VerificarCodigoEstado verificarCodigoEstado(int code){
        return new VerificarCodigoEstado(code);
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        return SerenityRest.lastResponse().statusCode()==code;
    }

}
