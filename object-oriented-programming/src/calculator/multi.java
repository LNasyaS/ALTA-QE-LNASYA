package calculator;

import java.util.Scanner;

public class multi {
    public static void multiplication() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input your number ");
        double numberOne = scanner.nextDouble();
        System.out.print((int)numberOne + " multiple by ");
        double numberTwo = scanner.nextDouble();

        double multiplication = numberOne * numberTwo ;

        System.out.println((int)numberOne + " * " + (int)numberTwo + " is "+ multiplication);

    }
}
