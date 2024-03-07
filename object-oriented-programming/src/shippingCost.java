import java.util.Scanner;
import shippingCost.*;

public class shippingCost {
    private final Scanner scanner;

    public shippingCost() {
        this.scanner = new Scanner(System.in);

    }

    public static void main(String[] args) {
        shippingCost calculator = new shippingCost();
        weight weightCalculator = new weight();
        
        System.out.print("Input length (cm): ");
        double length = calculator.scanner.nextDouble();
        System.out.print("Input width (cm): ");
        double width = calculator.scanner.nextDouble();
        System.out.print("Input height (cm): ");
        double height = calculator.scanner.nextDouble();

        double roundWeight = weightCalculator.calcWeight(length, width, height);

        System.out.println("Your shipping cost is " + "Rp." + cost.calcShippingCost(roundWeight));

    }

}