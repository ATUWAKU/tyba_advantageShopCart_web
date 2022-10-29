package co.com.yisus.certification.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OrderPayment {

    public static final Target NEXT_BUTTON = Target.the("Next Button").located(By.id("next_btn"));
    public static final Target EDIT_CREDIT_CARD = Target.the("Link Edit Credit Card Data").located(By.xpath("//label[contains(.,'Edit')]"));
    public static final Target CARD_NUMBER = Target.the("Link Edit Credit Card Data").located(By.id("creditCard"));
    public static final Target CVV_NUMBER = Target.the("CVV Number").located(By.name("cvv_number"));
    public static final Target LIST_EXPIRED_MONTH = Target.the("Expired Month").located(By.name("mmListbox"));
    public static final Target LIST_EXPIRED_YEAR = Target.the("Expired Year").located(By.name("yyyyListbox"));
    public static final Target CARD_HOLDER_NAME = Target.the("Card Holder Name").located(By.name("cardholder_name"));
    public static final Target SAVE_CREDIT_CARD = Target.the("Check SaveData Credit Card").located(By.name("save_master_credit"));
    public static final Target CRED_CARD_PAY_NOW_BUTTON = Target.the("Pay Now Button").located(By.id("pay_now_btn_ManualPayment"));
    public static final Target SAFE_PAY_NOW_BUTTON = Target.the("Pay Now Button").located(By.id("pay_now_btn_SAFEPAY"));
    public static final Target TC_PAYMENT_METHOD = Target.the("Pay Now Button").located(By.name("masterCredit"));
    public static final Target SAFE_PAYMENT_METHOD = Target.the("Pay Now Button").located(By.name("safepay"));
    public static final Target USER_NAME_SAFEPAY = Target.the("Pay Now Button").located(By.xpath("//input[contains(@name,'safepay_username')]"));
    public static final Target PASSWORD_SAFEPAY = Target.the("Pay Now Button").located(By.name("safepay_password"));
    public static final Target LIST_PRODUCTS = Target.the("List products of order").located(By.xpath("(//table)[2]/tbody/tr/td[2]/a/h3"));
    public static final Target LIST_PRICES = Target.the("List products Prices of order").located(By.xpath("(//table)[2]/tbody/tr/td[3]"));
    public static final Target TOTAL_ORDER = Target.the("Total price").located(By.xpath("//span[@class='roboto-medium totalValue ng-binding']"));
    public static final Target SHIPPING_COST = Target.the("Shiping Cost").located(By.id("shippingCost"));

}
