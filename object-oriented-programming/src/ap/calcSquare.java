package ap;

import java.util.Scanner;

public class calcSquare {
    public static void apSquare() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input length: ");
        double length = scanner.nextDouble();

        double area = length * length;
        double perimeter = 4 * length;

        System.out.println("Square area: " + area);
        System.out.println("Square perimeter: " + perimeter);
    }
}