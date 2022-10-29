package co.com.yisus.certification.stepDefinitions;

import co.com.yisus.certification.models.SafePayPurchase;
import co.com.yisus.certification.tasks.FillCreditCard;
import co.com.yisus.certification.tasks.FillSafePay;
import co.com.yisus.certification.tasks.PlaceOrder;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;

import java.util.Map;

import static co.com.yisus.certification.userInterfaces.Home.SHOPING_CART;
import static co.com.yisus.certification.userInterfaces.OrderPayment.*;
import static co.com.yisus.certification.userInterfaces.ShopingCart.CHECKOUT_BUTTON;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SafePayPurchasesStepDefinition {

    @DataTableType
    public SafePayPurchase convert(Map<String, String> object){
        return SafePayPurchase.builder()
                .products(object.get("Products") == null ? "" : object.get("Products"))
                .userName(object.get("Username") == null ? "" : object.get("Username"))
                .password(object.get("Password") == null ? "" : object.get("Password")).build();
    }

    @When("I make the purchase products with safe pay")
    public void iMakeThePurchaseProductsWithSafePay(SafePayPurchase data) {
        theActorInTheSpotlight().attemptsTo(
                PlaceOrder.of(data.getProducts()),
                Click.on(SHOPING_CART),
                Click.on(CHECKOUT_BUTTON),
                Click.on(NEXT_BUTTON),
                FillSafePay.data(data),
                Click.on(SAFE_PAY_NOW_BUTTON)
        );
    }
}
