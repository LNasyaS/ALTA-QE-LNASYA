package volume;

import java.util.Scanner;

public class calcCube {
    public static void volumeCube() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input length: ");
        double length = scanner.nextDouble();
        double volume = length * length * length ;

        System.out.println("Cube volume: " + volume);

    }
}
