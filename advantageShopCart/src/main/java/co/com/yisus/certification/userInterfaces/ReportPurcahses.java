package co.com.yisus.certification.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ReportPurcahses {
    public static final Target CUSTOMER = Target.the("Customer Shiping to").located(By.xpath("(//label[@class='ng-binding'])[10]"));
    public static final Target ADDRESS = Target.the("Address Shiping to").located(By.xpath("(//label[@class='ng-binding'])[11]"));
    public static final Target CITY = Target.the("City Shiping to").located(By.xpath("(//label[@class='ng-binding'])[12]"));
    public static final Target DEPARTMENT = Target.the("Department Shiping to").located(By.xpath("(//label[@class='ng-binding'])[13]"));
    public static final Target PHONE = Target.the("Phone Shiping to").located(By.xpath("(//label[@class='ng-binding'])[14]"));
    public static final Target PAYMENT_METHOD = Target.the("Phone Shiping to").located(By.xpath("(//label[@class='ng-binding'])[15]"));
    public static final Target END_CARD_NUMBER = Target.the("End of Card Number Shiping to").located(By.xpath("(//span[@class='ng-binding ng-scope'])[8]"));
    public static final Target DATE_ORDERED = Target.the("End of Card Number Shiping to").located(By.xpath("(//a[@class='floater ng-binding'])[1]"));
    public static final Target SUBTOTAL = Target.the("End of Card Number Shiping to").located(By.xpath("(//a[@class='floater ng-binding'])[2]"));
    public static final Target SHIPPING = Target.the("End of Card Number Shiping to").located(By.xpath("(//a[@class='floater ng-binding'])[3]"));
    public static final Target TOTAL = Target.the("End of Card Number Shiping to").located(By.xpath("(//a[@class='floater ng-binding'])[4]"));



}
