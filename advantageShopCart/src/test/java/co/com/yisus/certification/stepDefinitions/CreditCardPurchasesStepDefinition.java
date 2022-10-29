package co.com.yisus.certification.stepDefinitions;

import co.com.yisus.certification.models.CreditCardPurchase;
import co.com.yisus.certification.models.ReportPurchases;
import co.com.yisus.certification.tasks.FillCreditCard;
import co.com.yisus.certification.tasks.PlaceOrder;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import static co.com.yisus.certification.userInterfaces.Home.SHOPING_CART;
import static co.com.yisus.certification.userInterfaces.OrderPayment.CRED_CARD_PAY_NOW_BUTTON;
import static co.com.yisus.certification.userInterfaces.OrderPayment.NEXT_BUTTON;
import static co.com.yisus.certification.userInterfaces.ReportPurcahses.*;
import static co.com.yisus.certification.userInterfaces.ShopingCart.CHECKOUT_BUTTON;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CreditCardPurchasesStepDefinition {

    @DataTableType
    public CreditCardPurchase convert(Map<String, String> object){
        return CreditCardPurchase.builder()
                .products(object.get("Products") == null ? "" : object.get("Products"))
                .cardNumber(object.get("CardNumber") == null ? "" : object.get("CardNumber"))
                .cvv(object.get("CVV") == null ? "" : object.get("CVV"))
                .expiMonth(object.get("ExpiMonth") == null ? "" : object.get("ExpiMonth"))
                .expYear(object.get("ExpYear") == null ? "" : object.get("ExpYear"))
                .cardHolderNaem(object.get("CardHolderNaem") == null ? "" : object.get("CardHolderNaem"))
                .build();

    }

    @DataTableType
    public ReportPurchases transform(Map<String, String> object){
        return ReportPurchases.builder()
                .customer(object.get("Customer")  == null ? "" : object.get("Customer"))
                .address(object.get("Address") == null ? "" : object.get("Address"))
                .address(object.get("City") == null ? "" : object.get("City"))
                .address(object.get("Department") == null ? "" : object.get("Department"))
                .phone(object.get("Phone")  == null ? "" : object.get("Phone"))
                .endCardNumber(object.get("EndCardNumber") == null ? "" : object.get("EndCardNumber"))
                .paymentMethod(object.get("Payment_method") == null ? "" : object.get("Payment_method"))
                .dateOrdered(new SimpleDateFormat("dd/MM/yyyy").format(new Date()))
                .subtotal(object.get("Subtotal") == null ? "" : object.get("Subtotal"))
                .shipping(object.get("Shipping") == null ? "" : object.get("Shipping"))
                .total(object.get("Total") == null ? "" : object.get("Total"))
                .build();
    }

    @When("I make the purchase products with credit card")
    public void iMakeThePurchaseProductsWithCreditCard(CreditCardPurchase data) throws InterruptedException {

        theActorInTheSpotlight().attemptsTo(
                PlaceOrder.of(data.getProducts()),
                Click.on(SHOPING_CART),
                Click.on(CHECKOUT_BUTTON),
                Click.on(NEXT_BUTTON),
                FillCreditCard.data(data),
                Click.on(CRED_CARD_PAY_NOW_BUTTON)
        );

    }
    @Then("The purchase must be completed")
    public void thePurchaseMustBeCompleted(ReportPurchases data) {
        Ensure.that(CUSTOMER).text().isEqualTo(data.getCustomer());
        Ensure.that(ADDRESS).text().isEqualTo(data.getAddress());
        Ensure.that(CITY).text().isEqualTo(data.getCity());
        Ensure.that(DEPARTMENT).text().isEqualTo(data.getDepartment());
        Ensure.that(PHONE).text().isEqualTo(data.getPhone());
        Ensure.that(PAYMENT_METHOD).text().isEqualTo(data.getPaymentMethod());
        Ensure.that(END_CARD_NUMBER).text().isEqualTo(data.getEndCardNumber());
        Ensure.that(DATE_ORDERED).text().isEqualTo(data.getDateOrdered());
        Ensure.that(SUBTOTAL).text().isEqualTo(data.getSubtotal());
        Ensure.that(SHIPPING).text().isEqualTo(data.getShipping());
        Ensure.that(TOTAL).text().isEqualTo(data.getTotal());

    }
}
