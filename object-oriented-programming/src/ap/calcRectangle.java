package ap;

import java.util.Scanner;

public class calcRectangle {
    public static void apRectangle() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("input length: ");
        double length = scanner.nextDouble();
        System.out.print("input width: ");
        double width = scanner.nextDouble();

        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.println("Rectangle area: " + area);
        System.out.println("Rectangle perimeter: " + perimeter);
    }
}
