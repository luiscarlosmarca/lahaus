package tasks.apis;

import models.User;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;

import static models.builder.UserBuilder.aNewUser;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static questions.apis.VerificarCodigoEstado.verificarCodigoEstado;
import static util.Constants.*;

public class CrearUnNuevoUsuario implements Task {

    private User myUser;

    public static CrearUnNuevoUsuario createAnUser() {
        return instrumented(CrearUnNuevoUsuario.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        myUser =aNewUser().basic().build();
        actor.attemptsTo(Post.to(END_POINT_USER).
                with(request->request
                        .header("Content-Type","application/json")
                        .body(myUser)));
        actor.should(seeThat(verificarCodigoEstado(CREACION_EXITOSA)));
        String id = SerenityRest.lastResponse().header("id");
        actor.remember(ID,id);
        myUser.setId(id);
        actor.remember(USER,myUser);
    }

}
