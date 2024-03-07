package volume;

import java.util.Scanner;

public class calcRectangularPrism {
    public static void volumeRectangularPrism() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input length: ");
        double length = scanner.nextDouble();
        System.out.print("Input width: ");
        double width = scanner.nextDouble();
        System.out.print("Input height: ");
        double height = scanner.nextDouble();

        double volume = length * width * height;

        System.out.println("Rectangular prism volume: " + volume);

    }
}
