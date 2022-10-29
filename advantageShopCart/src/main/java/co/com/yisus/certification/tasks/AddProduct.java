package co.com.yisus.certification.tasks;

import co.com.yisus.certification.interactions.ValidateIsLastProduct;
import co.com.yisus.certification.interactions.SelectProduct;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddProduct implements Task {

    private List<String> lstProducts;

    public AddProduct(List<String> lstProducts) {
        this.lstProducts = lstProducts;
    }

    public static Performable the(List<String> lstProducts) {
        return instrumented(AddProduct.class, lstProducts);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        for (String product: lstProducts) {
            actor.attemptsTo(
                    SelectProduct.the(product),
                    ValidateIsLastProduct.last(product).in(lstProducts)
            );
        }
    }
}
