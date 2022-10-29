package co.com.yisus.certification.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.yisus.certification.userInterfaces.OrderPayment.SHIPPING_COST;

public class SubtractShipping implements Question<Double> {

    private Target totalOrder;

    public SubtractShipping(Target totalOrder) {
        this.totalOrder = totalOrder;
    }

    public static SubtractShipping of(Target totalOrder) {
        return new SubtractShipping(totalOrder);
    }

    @Override
    public Double answeredBy(Actor actor) {

        double total = Double.parseDouble(totalOrder.resolveFor(actor).getText().replace("$","").replace(",",""));
        double shiping = Double.parseDouble(SHIPPING_COST.resolveFor(actor).getText().replace("$","").replace(",",""));
        return total- shiping;
    }


}
