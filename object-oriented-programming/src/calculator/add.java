package calculator;

import java.util.Scanner;

public class add {
    public static void addition() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input your number ");
        double numberOne = scanner.nextDouble();
        System.out.print((int)numberOne + " add by ");
        double numberTwo = scanner.nextDouble();

        double addition = numberOne + numberTwo ;

        System.out.println((int)numberOne + " + " + (int)numberTwo + " is "+ (int)addition);

    }

}
