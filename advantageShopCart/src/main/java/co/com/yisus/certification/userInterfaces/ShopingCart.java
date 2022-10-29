package co.com.yisus.certification.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ShopingCart {

    public static final Target CHECKOUT_BUTTON = Target.the("Checkout Button").located(By.id("checkOutButton"));
    public static final Target CART_LIST_NAME_PRODUCT = Target.the("Cart List Name Product").located(By.xpath("//table[@class='fixedTableEdgeCompatibility']/tbody/tr/td[2]"));


}
