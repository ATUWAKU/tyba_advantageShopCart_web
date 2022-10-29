package co.com.yisus.certification.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static co.com.yisus.certification.utils.ColorIndex.*;

public class ProductDetails {

    public static String COLOR = "(//span[contains(@title,'%s')])[%s]";

    public static final Target COLORS_LIST = Target.the("Product Colors").located(By.xpath("//div[contains(@ng-show,'!firstImageToShow')]/span"));
    //public static final Target PRODUCT_NAME = Target.the("Product Name").located(By.className("roboto-regular screen768 ng-binding"));
    public static final Target T_COLOR_GRAY = Target.the("Color Gray").located(By.xpath(String.format(COLOR, GRAY.getName(), GRAY.getIndex())));
    public static final Target T_COLOR_PURPLE = Target.the("Color Blue").located(By.xpath(String.format(COLOR, PURPLE.getName(), PURPLE.getIndex())));
    public static final Target ADD_TO_CART_BUTTON = Target.the("SubtractShipping To Cart Button").located(By.name("save_to_cart"));
    public static final Target HOME_PATH = Target.the("Home Path").located(By.xpath("//a[contains(.,'HOME')]"));


}