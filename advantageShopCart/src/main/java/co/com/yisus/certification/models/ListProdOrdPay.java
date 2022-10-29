package co.com.yisus.certification.models;

import lombok.Setter;

import java.util.Arrays;
import java.util.stream.Collectors;

@Setter
public class ListProdOrdPay {

    String products;
    String prices;
    String total;



    public String[] getProducts() {
        return Arrays.asList(products.split(",")).stream().map(String::trim).collect(Collectors.toList()).toArray(new String[products.split(",").length]);
    }

    public String getPrices() {
        return prices;
    }

    public double getTotal() {
        return Double.parseDouble(total.replace("$","").replace(",",""));
    }
}
