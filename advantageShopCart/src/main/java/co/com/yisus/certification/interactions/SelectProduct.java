package co.com.yisus.certification.interactions;


import co.com.yisus.certification.utils.SearchProduct;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.yisus.certification.userInterfaces.Home.prodButtonOpt;
import static co.com.yisus.certification.userInterfaces.ProductDetails.ADD_TO_CART_BUTTON;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectProduct implements Interaction {

    private String product;

    public SelectProduct(String product) {
        this.product = product;
    }

    public static Performable the(String product) {
        return instrumented(SelectProduct.class, product);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(prodButtonOpt(SearchProduct.byName(product))),
                ScrollToUp.options(),
                Select.color(),
                Click.on(ADD_TO_CART_BUTTON)
        );
    }
}
