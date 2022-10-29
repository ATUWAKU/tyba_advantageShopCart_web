package co.com.yisus.certification.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ReportPurchases {
    String customer;
    String address;
    String city;
    String department;
    String phone;
    String endCardNumber;
    String paymentMethod;
    String dateOrdered;
    String subtotal;
    String shipping;
    String total;
}
