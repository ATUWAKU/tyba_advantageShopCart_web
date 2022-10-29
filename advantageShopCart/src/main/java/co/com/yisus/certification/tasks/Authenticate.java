package co.com.yisus.certification.tasks;

import co.com.yisus.certification.models.LoginData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.yisus.certification.userInterfaces.Home.USER_LOGIN_MENU;
import static co.com.yisus.certification.userInterfaces.Login.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class Authenticate implements Task {

    private LoginData loginData;

    public Authenticate(LoginData loginData) {
        this.loginData = loginData;
    }

    public static Performable with(LoginData loginData) {
        return instrumented(Authenticate.class, loginData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(USER_LOGIN_MENU),
                Enter.theValue(loginData.getUser()).into(USER_FIELD),
                Enter.theValue(loginData.getPassword()).into(PASSWORD_FIELD),
                WaitUntil.the(BUTTON_SIG_IN, isEnabled()).forNoMoreThan(20).seconds(),
                Click.on(BUTTON_SIG_IN)
        );

    }
}