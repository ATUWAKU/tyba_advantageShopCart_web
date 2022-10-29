package co.com.yisus.certification.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;

import static co.com.yisus.certification.userInterfaces.ProductDetails.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Select implements Interaction {
    public static Performable color() {
        return instrumented(Select.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(COLORS_LIST.resolveAllFor(actor).size() > 1)
                        .andIfSo(
                                Click.on(
                                        COLORS_LIST.resolveAllFor(actor).stream().filter(x -> x.getAttribute("title").toString().equals("GRAY")).findFirst().isPresent() ? T_COLOR_GRAY : T_COLOR_PURPLE
                                )
                        )
        );

    }
}
