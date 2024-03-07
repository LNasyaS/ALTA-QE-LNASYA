package shippingCost;

public class cost {
    public static double calcShippingCost(double roundWeight) {
        double shippingCost;
        double price = 5000;

        if (roundWeight == 1) {
            shippingCost = price;
        } else {
            shippingCost = price + (roundWeight - 1) * price;
        }
        return shippingCost;
    }
}

