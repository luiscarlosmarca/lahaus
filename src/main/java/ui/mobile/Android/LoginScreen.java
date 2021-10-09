package ui.mobile.Android;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginScreen {


    public final static Target FRAME_LOGIN_GOOGLE= Target.the("frame para seleccionar la cuenta de google")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout"));




}
