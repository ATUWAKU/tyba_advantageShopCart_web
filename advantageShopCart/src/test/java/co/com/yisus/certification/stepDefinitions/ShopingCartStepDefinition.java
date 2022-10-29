package co.com.yisus.certification.stepDefinitions;

import co.com.yisus.certification.models.ListProdOrdPay;
import co.com.yisus.certification.models.LoginData;
import co.com.yisus.certification.questions.Extract;
import co.com.yisus.certification.questions.SubtractShipping;
import co.com.yisus.certification.tasks.Authenticate;
import co.com.yisus.certification.tasks.Navigate;
import co.com.yisus.certification.tasks.PlaceOrder;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;

import java.util.Map;

import static co.com.yisus.certification.userInterfaces.Home.SHOPING_CART;
import static co.com.yisus.certification.userInterfaces.OrderPayment.*;
import static co.com.yisus.certification.userInterfaces.ShopingCart.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class ShopingCartStepDefinition {

    private static final String YISUS = "Yisus";


    @DataTableType
    public LoginData convert(Map<String, String> object){
        LoginData obj = new LoginData();

        obj.setUser(object.get("User") == null ? "" : object.get("User"));
        obj.setPassword(object.get("Password") == null ? "" : object.get("Password"));
        return obj;
    }
    @DataTableType
    public ListProdOrdPay transform(Map<String, String> object){
        ListProdOrdPay obj = new ListProdOrdPay();

        obj.setProducts(object.get("Products") == null ? "" : object.get("Products"));
        obj.setPrices(object.get("Prices") == null ? "" : object.get("Prices"));
        obj.setTotal(object.get("Total") == null ? "" : object.get("Total"));
        return obj;
    }

    @Before
    public void setup(){
        setTheStage(new OnlineCast());
    }

    @Given("I authenticate with User And Password")
    public void iAuthenticateWithUserAndPassword(LoginData loginData) {
        theActorCalled(YISUS).wasAbleTo(
                Navigate.LoginPage(),
                Authenticate.with(loginData));
    }
    @When("I make the order of {string}")
    public void iMakeTheOrderOfAnd(String products) {
        theActorInTheSpotlight().attemptsTo(
                PlaceOrder.of(products),
                Click.on(SHOPING_CART)
        );
    }
    @Then("The purchase order must list the products {string}")
    public void thePurchaseOrderMustListTheProductsAnd(String products) {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(CART_LIST_NAME_PRODUCT.resolveAllFor(theActorInTheSpotlight()).texts()).contains(products.split(","))
        );
    }
    @When("I generate an order payment for the {string}")
    public void iGenerateAnOrderPaymentForThe(String products) {
        theActorInTheSpotlight().attemptsTo(
                PlaceOrder.of(products),
                Click.on(SHOPING_CART),
                Click.on(CHECKOUT_BUTTON)
        );
    }
    @Then("The Order payment should be generated with the data")
    public void theOrderPaymentShouldBeGeneratedWithTheData(ListProdOrdPay data) {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that("Total order", SubtractShipping.of(TOTAL_ORDER)).isEqualTo(data.getTotal()),
                Ensure.that(Extract.the(LIST_PRICES)).isEqualTo(data.getPrices()),
                Ensure.that(LIST_PRODUCTS).textValues().contains(data.getProducts())
        );
    }
}
