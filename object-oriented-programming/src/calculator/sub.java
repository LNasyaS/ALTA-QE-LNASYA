package calculator;

import java.util.Scanner;

public class sub {
    public static void subtraction() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input your number ");
        double numberOne = scanner.nextDouble();
        System.out.print((int)numberOne + " subtract by ");
        double numberTwo = scanner.nextDouble();

        double subtraction = numberOne - numberTwo ;

        System.out.println((int)numberOne + " - " + (int)numberTwo + " is "+ (int)subtraction);

    }
}
