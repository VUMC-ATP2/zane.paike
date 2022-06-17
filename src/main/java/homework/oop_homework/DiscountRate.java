package homework.oop_homework;

import lombok.Getter;

import java.net.Proxy;

@Getter
public class DiscountRate {

    public static Double getServiceDiscountRate (String type) {

        double serviceDiscountPremium = 0.2;
        double serviceDiscountGold = 0.15;
        double serviceDiscountSilver = 0.1;

        switch (type) {
            case "premium":
                return serviceDiscountPremium;
            case "gold":
                return serviceDiscountGold;
            case "silver":
                return serviceDiscountSilver;
            default:
                return 0.0;
        }
    }

    public static Double getProductDiscountRate (String type) {

        double productDiscountPremium = 0.1;
        double productDiscountGold = 0.1;
        double productDiscountSilver = 0.1;

        switch (type) {
            case "premium":
                return productDiscountPremium;
            case "gold":
                return productDiscountGold;
            case "silver":
                return productDiscountSilver;
            default:
                return 0.0;
        }
    }

}
