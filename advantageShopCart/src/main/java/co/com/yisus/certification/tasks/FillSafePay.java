package co.com.yisus.certification.tasks;

import co.com.yisus.certification.models.SafePayPurchase;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.yisus.certification.userInterfaces.OrderPayment.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class FillSafePay implements Task {

    private SafePayPurchase data;

    public FillSafePay(SafePayPurchase data) {
        this.data = data;
    }

    public static Performable data(SafePayPurchase data) {
        return instrumented(FillSafePay.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SAFE_PAYMENT_METHOD),
                Enter.theValue(data.getUserName()).into(USER_NAME_SAFEPAY),
                Enter.theValue(data.getPassword()).into(PASSWORD_SAFEPAY)


        );

    }
}
