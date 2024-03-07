package ap;

import java.util.Scanner;

public class calcTriangle {
    public static void apTriangle() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input length: ");
        double length = scanner.nextDouble();
        System.out.print("Input height: ");
        double height = scanner.nextDouble();

        double area = 0.5 * length * height;
        double pythagoras = Math.sqrt(Math.pow(length / 2, 2) + Math.pow(height, 2));
        double perimeter = length + (2 * pythagoras);

        System.out.println("Triangle area: " + area);
        System.out.println("Triangle perimeter: " + perimeter);
    }

}
