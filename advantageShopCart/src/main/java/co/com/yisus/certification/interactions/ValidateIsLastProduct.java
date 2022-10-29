package co.com.yisus.certification.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;

import java.util.List;

import static co.com.yisus.certification.userInterfaces.Home.POPULAR_ITEMS_MENU;
import static co.com.yisus.certification.userInterfaces.ProductDetails.HOME_PATH;

public class ValidateIsLastProduct implements Interaction {

    private String product;
    private List<String> lstProducts;

    public ValidateIsLastProduct(String product, List<String> lstrProducts) {
        this.product = product;
        this.lstProducts = lstrProducts;
    }

    public static IsBuilder last(String product) {
        return new IsBuilder(product);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(!product.equals(lstProducts.get(lstProducts.size()-1)))
                        .andIfSo(
                                Click.on(HOME_PATH),
                                Click.on(POPULAR_ITEMS_MENU)

                        )
        );
    }
}
