package co.com.yisus.certification.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static co.com.yisus.certification.utils.Constants.BASE_URL;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Navigate implements Task {
    private String url;

    public Navigate(String url) {
        this.url = url;
    }

    public static Performable LoginPage() {
        return instrumented(Navigate.class, BASE_URL);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(url));
    }
}
