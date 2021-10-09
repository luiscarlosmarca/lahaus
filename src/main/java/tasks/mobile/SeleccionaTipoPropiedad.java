package tasks.mobile;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.mobile.Android.ParametrosDeBusquedaScreen.*;

public class SeleccionaTipoPropiedad implements Task {

    boolean casa=true;

    public SeleccionaTipoPropiedad(boolean casa) {
        this.casa = casa;
    }

    public static SeleccionaTipoPropiedad buscarUnaCasa() {
        return instrumented(SeleccionaTipoPropiedad.class,true);
    }
    public static SeleccionaTipoPropiedad buscaUnApartamento() {
        return instrumented(SeleccionaTipoPropiedad.class,false);
    }

    @Override

    public <T extends Actor> void performAs(T actor) {
        if(casa)
            actor.attemptsTo(Click.on(BTN_SELECCIONAR_TIPO_VIVIENDA_CASA));
        else
            actor.attemptsTo(Click.on(BTN_SELECCIONAR_TIPO_VIVIENDA_APARTAMENTO));

    }
}
