package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import org.awaitility.Awaitility;

import java.util.concurrent.TimeUnit;

import static  util.FitTime.succefull;

public class Wait implements Interaction {
    private int segundos;

    public Wait(int segundos) {
        this.segundos = segundos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        Awaitility.await().forever().pollInterval(segundos, TimeUnit.SECONDS).until(succefull());

    }

    /** Metodo de Espera implicita genérico, espera cantidad de segundos fijos
     * <p>&nbsp;</p>
     * <pre>
     * Espera.unMomento(10).performAs(actor);
     * </pre>
     * @param segundos Cantidad de segundos fijos a esperar
     * */
    public static Wait oneMoment(int segundos) {
        return Tasks.instrumented(Wait.class, segundos);
    }

}
