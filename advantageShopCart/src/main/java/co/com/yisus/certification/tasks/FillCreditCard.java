package co.com.yisus.certification.tasks;

import co.com.yisus.certification.interactions.EditCreditCard;
import co.com.yisus.certification.models.CreditCardPurchase;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.yisus.certification.userInterfaces.OrderPayment.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillCreditCard implements Task {

    private CreditCardPurchase data;

    public FillCreditCard(CreditCardPurchase data) {
        this.data = data;
    }

    public static Performable data(CreditCardPurchase data) {
        return  instrumented(FillCreditCard.class,data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(TC_PAYMENT_METHOD),
                EditCreditCard.information(),
                Enter.theValue(data.getCardNumber()).into(CARD_NUMBER),
                Enter.theValue(data.getCvv()).into(CVV_NUMBER),
                SelectFromOptions.byVisibleText(data.getExpiMonth()).from(LIST_EXPIRED_MONTH),
                SelectFromOptions.byVisibleText(data.getExpYear()).from(LIST_EXPIRED_YEAR),
                Enter.theValue(data.getCardHolderNaem()).into(CARD_HOLDER_NAME),
                Click.on(SAVE_CREDIT_CARD)

        );
    }
}
