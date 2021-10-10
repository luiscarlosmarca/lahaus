package tasks.apis;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static util.Constants.*;

public class CreateAnewUser implements Task {

    private String user;
 /*   public static UserAlone myUser;
    public static UserEnterprise myUserEnterprise;
    public static UserMemberOf myUserMemberOf;*/

    public CreateAnewUser(String user) {
        this.user = user;
    }

    public static CreateAnewUser createAn(String user) {
        return instrumented(CreateAnewUser.class,user );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    }

}
