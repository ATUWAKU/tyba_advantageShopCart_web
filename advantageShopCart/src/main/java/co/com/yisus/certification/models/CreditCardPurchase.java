package co.com.yisus.certification.models;

import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class CreditCardPurchase {

    String products;
    String cardNumber;
    String cvv;
    String expiMonth;
    String expYear;
    String cardHolderNaem;
}
