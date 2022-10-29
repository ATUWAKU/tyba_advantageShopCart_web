package co.com.yisus.certification.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SafePayPurchase {

    String products;
    String userName;
    String password;
}
