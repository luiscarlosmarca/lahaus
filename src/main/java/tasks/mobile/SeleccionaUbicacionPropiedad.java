package tasks.mobile;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.mobile.Android.ParametrosDeBusquedaScreen.*;

public class SeleccionaUbicacionPropiedad implements Task {

    String pais,ciudad;

    public SeleccionaUbicacionPropiedad(String pais) {
        this.pais = pais;

    }

    public static SeleccionaUbicacionPropiedad seleccionaEl(String pais) {
        return instrumented(SeleccionaUbicacionPropiedad.class,pais);
    }

    public SeleccionaUbicacionPropiedad yLaCiudadDe(String ciudad){
        this.ciudad=ciudad;
        return this;
    }
    @Override

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_SELECCIONAR_PAIS.of(pais)));
        actor.attemptsTo(Click.on(BTN_SELECCIONAR_CIUDAD.of(ciudad)));

    }
}
