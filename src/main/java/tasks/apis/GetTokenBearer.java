package tasks.apis;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;
//import static util.Constants.TOKEN_USER;
import static util.GetResponse.ofAuthenticacion;

public class GetTokenBearer  implements Task {

    public GetTokenBearer() {
    }

    public static GetTokenBearer getTokenBearer() {
        return instrumented(GetTokenBearer.class);
    }
    @Override

    public <T extends Actor> void performAs(T actor) {
        //actor.remember(TOKEN_USER,ofAuthenticacion());
    }
}
