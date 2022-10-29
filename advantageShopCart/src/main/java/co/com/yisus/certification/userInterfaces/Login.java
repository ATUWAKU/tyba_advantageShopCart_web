package co.com.yisus.certification.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Login {
    public static final Target USER_FIELD = Target.the("User Name Login").located(By.name("username"));
    public static final Target PASSWORD_FIELD = Target.the("Password Login").located(By.name("password"));
    public static final Target BUTTON_SIG_IN = Target.the("Button Sig In").located(By.id("sign_in_btnundefined"));


}
