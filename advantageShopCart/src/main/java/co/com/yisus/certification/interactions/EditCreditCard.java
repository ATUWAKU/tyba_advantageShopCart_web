package co.com.yisus.certification.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;

import static co.com.yisus.certification.userInterfaces.OrderPayment.EDIT_CREDIT_CARD;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EditCreditCard implements Interaction {
    public static Performable information() {
        return instrumented(EditCreditCard.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Check.whether(EDIT_CREDIT_CARD.isVisibleFor(actor))
                    .andIfSo(
                            Click.on(EDIT_CREDIT_CARD)
                    )
        );
    }
}
