package volume;

import java.util.Scanner;

public class calcCylinder {
    public static void volumeCylinder() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("input radius: ");
        double radius = scanner.nextDouble();
        System.out.print("input depth: ");
        double depth = scanner.nextDouble();

        double volume = Math.PI * Math.pow(radius, 2) * depth;

        System.out.println("Cylinder volume: " + volume + " or " + Math.round(volume));

    }
}
