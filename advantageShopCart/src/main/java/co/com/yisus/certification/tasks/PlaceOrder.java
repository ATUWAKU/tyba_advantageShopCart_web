package co.com.yisus.certification.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import java.util.Arrays;
import java.util.List;

import static co.com.yisus.certification.userInterfaces.Home.POPULAR_ITEMS_MENU;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PlaceOrder implements Task {

    private List<String> lstProducts;


    public PlaceOrder(String products) {
        this.lstProducts = Arrays.asList(products.split(","));
        lstProducts.replaceAll(String::trim);

    }

    public static PlaceOrder of(String products) {
        return instrumented(PlaceOrder.class, products);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(POPULAR_ITEMS_MENU),
                AddProduct.the(lstProducts)
        );
    }
}
