package shippingCost;

import java.util.Scanner;

public class weight {
    private Scanner scanner;

    public weight() {
        this.scanner = new Scanner(System.in);
    }

    public double calcWeight(double length, double width, double height) {
        double volume = length * width * height;
        if (volume < 50) {
            throw new IllegalArgumentException(
                    "Product volume must be more than 50cm3. Please input new product dimension");
        }
        System.out.print("Input weight (kg): ");
        double weight = this.scanner.nextDouble();

        return (int) Math.ceil(weight);
    }
}
