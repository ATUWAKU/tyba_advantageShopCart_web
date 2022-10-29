package co.com.yisus.certification.interactions;

import net.serenitybdd.screenplay.Performable;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IsBuilder {

    private String product;

    public IsBuilder(String product) {
        this.product = product;
    }

    public Performable in(List<String> lstProducts) {
        return instrumented(ValidateIsLastProduct.class, this.product, lstProducts);
    }
}
