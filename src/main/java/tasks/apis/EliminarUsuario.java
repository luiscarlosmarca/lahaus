package tasks.apis;

import models.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Put;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static questions.apis.VerificarCodigoEstado.verificarCodigoEstado;
import static util.Constants.*;
import static util.GenerateDataFake.generateTo;

public class EliminarUsuario implements Task {

    private User myUser;

    public static EliminarUsuario actualizarUsuario() {
        return instrumented(EliminarUsuario.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        myUser =actor.recall(USER);
        myUser.setName(generateTo().aName());
        myUser.setJob(generateTo().ajob());
        actor.attemptsTo(Put.to(END_POINT_USER+myUser.getId()).
                with(request->request
                        .header("Content-Type","application/json")
                        .body(myUser)));
        actor.should(seeThat(verificarCodigoEstado(CODIGO_EXITOSO)));

    }

}
