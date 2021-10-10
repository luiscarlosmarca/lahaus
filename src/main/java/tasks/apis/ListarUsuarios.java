package tasks.apis;

import models.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.serenitybdd.screenplay.rest.interactions.Put;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static questions.apis.VerificarCodigoEstado.verificarCodigoEstado;
import static util.Constants.*;
import static util.GenerateDataFake.generateTo;

public class ListarUsuarios implements Task {

    private User myUser;

    public static ListarUsuarios listarUsuarios() {
        return instrumented(ListarUsuarios.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        myUser =actor.recall(USER);

        actor.attemptsTo(Get.resource(END_POINT_USER+myUser.getId()).
                with(request->request
                        .header("Content-Type","application/json")));
        actor.should(seeThat(verificarCodigoEstado(NO_FOUND)));

    }

}
