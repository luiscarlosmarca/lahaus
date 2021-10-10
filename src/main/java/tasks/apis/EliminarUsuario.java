package tasks.apis;

import models.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Delete;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static questions.apis.VerificarCodigoEstado.verificarCodigoEstado;
import static util.Constants.*;

public class EliminarUsuario implements Task {

    private User myUser;

    public static EliminarUsuario eliminarUsuario() {
        return instrumented(EliminarUsuario.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        myUser =actor.recall(USER);
        actor.attemptsTo(Delete.from(END_POINT_USER+myUser.getId()).
                with(request->request
                        .header("Content-Type","application/json")));
        actor.should(seeThat(verificarCodigoEstado(ELIMINACION_EXITOSA)));

    }

}
