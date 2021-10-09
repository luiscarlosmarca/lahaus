package ui.mobile.Android;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ParametrosDeBusquedaScreen {


    public final static Target BTN_SELECCIONAR_PAIS= Target.the("Boton del home para seleccionar el pais de la primera busqueda")
            .locatedBy("//android.widget.ImageView[@content-desc='{0}']");



    public final static Target BTN_SELECCIONAR_CIUDAD= Target.the("Boton del home para seleccionar el ciudad de la primera busqueda")
            .locatedBy("//android.widget.ImageView[@content-desc='{0} y alrededores']");



    public final static Target BTN_SELECCIONAR_CIUDAD_= Target.the("Boton del home para seleccionar el ciudad de la primera busqueda")
            .locatedBy("//android.widget.ImageView[@content-desc='{0}']");
    public final static Target BTN_SELECCIONAR_TIPO_VIVIENDA_CASA= Target.the("Boton del home para seleccionar casa como tipo de vivienda de la primera busqueda")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[4]"));


    public final static Target BTN_SELECCIONAR_TIPO_VIVIENDA_APARTAMENTO= Target.the("Boton del home para seleccionar apartamento como tipo de vivienda de la primera busqueda")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[5]"));



    public final static Target VIEW_NO_HABILITADA_MX= Target.the("ciudades no habilitada")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View[7]"));

}
