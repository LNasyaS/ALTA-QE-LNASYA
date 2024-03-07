package calculator;

import java.util.Scanner;

public class div {
    public static void division() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input your number ");
        double numberOne = scanner.nextDouble();
        System.out.print((int)numberOne + " divide by ");
        double numberTwo = scanner.nextDouble();

        double division = numberOne / numberTwo ;

        System.out.println((int) numberOne + " / " + (int) numberTwo + " is " + division);
    }
}
