package tasks.apis;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;

import static net.serenitybdd.screenplay.Tasks.instrumented;
//import static tasks.apis.CreateAnewUser.myUser;
//import static ui.apis.kingslading.builder.KingslandingModelBuilder.theEndpointOf;
//import static util.Constants.TOKEN_USER;

public class ConsumeToUsers implements Task {

    private String endpoint;
    private boolean isRequiredToken=false;

    public ConsumeToUsers(String endpoint) {
        this.endpoint = endpoint;
    }

    public ConsumeToUsers withToken(){
        this.isRequiredToken=true;
        return this;
    }
    public static ConsumeToUsers consumeThe(String endpoint) {
        return instrumented(ConsumeToUsers.class, endpoint);
    }
    @Override

    public <T extends Actor> void performAs(T actor) {
    /*    if(isRequiredToken){
            actor.attemptsTo(Post.to(theEndpointOf().userApi().build().theUrlFinal()).
                    with(request->request
                            .header("Content-Type","application/json")
                            .header("Authorization", actor.recall(TOKEN_USER)).relaxedHTTPSValidation("TLS")
                            .body(myUser)));
        }else {
            actor.attemptsTo(Post.to(theEndpointOf().userApi().build().theUrlFinal()).
                    with(request->request
                            .header("Content-Type","application/json")
                            .body(myUser)));
        }
*/
    }
}
