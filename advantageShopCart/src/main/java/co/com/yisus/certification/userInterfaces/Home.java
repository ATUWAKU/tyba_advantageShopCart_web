package co.com.yisus.certification.userInterfaces;

import co.com.yisus.certification.utils.SearchProduct;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Home {

    public static String PRODUCT = "details_%s";

    public static final Target USER_LOGIN_MENU = Target.the("User Login Menu").located(By.id("menuUserSVGPath"));
    public static final Target POPULAR_ITEMS_MENU = Target.the("Popular Items Menu").located(By.xpath("//a[@translate='POPULAR_ITEMS']"));
    public static final Target SHOPING_CART = Target.the("Shoping Cart").located(By.id("shoppingCartLink"));



    public static Target prodButtonOpt(String product){
        return Target.the("Product " + SearchProduct.byCode(product)).located(By.id(String.format(PRODUCT,product)));
    }
}
