package ui.mobile.Android;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginScreen {


    public final static Target VIEW_NO_HABILITADA= Target.the("ciudad no habilitada")
            .located(By.xpath("//android.widget.ImageView[@content-desc='Próximamente Santa Marta']"));




}
