package co.com.yisus.certification.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;
import java.util.stream.Collectors;

public class Extract implements Question<String> {

    private Target listPrices;

    public Extract(Target listPrices) {
        this.listPrices = listPrices;
    }

    public static Extract the(Target listPrices) {
        return new Extract(listPrices);
    }

    @Override
    public String answeredBy(Actor actor) {
        List<String> resp = listPrices.resolveAllFor(actor).texts();
        return resp.stream()
                .map(x -> x)
                .collect(Collectors.joining(";"));

    }
}
