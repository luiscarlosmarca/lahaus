package ui.mobile.Android;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeScreen {


    public final static Target BTN_EMPEZAR_BUSQUEDA= Target.the("Boton del home para inicar la primera busqueda")
            .located(By.xpath("//android.widget.Button[@content-desc='Empezar búsqueda']"));





}
