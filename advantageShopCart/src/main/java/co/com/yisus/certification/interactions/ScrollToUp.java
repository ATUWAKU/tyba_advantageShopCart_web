package co.com.yisus.certification.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.conditions.Check;

import static co.com.yisus.certification.userInterfaces.ProductDetails.COLORS_LIST;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class ScrollToUp implements Interaction {
    public static Performable options() {
        return instrumented(ScrollToUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(COLORS_LIST.isVisibleFor(actor)).otherwise(
                        Scroll.to(COLORS_LIST)
                )
        );

    }
}
