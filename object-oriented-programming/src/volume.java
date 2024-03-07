import java.util.Scanner;
import volume.*;

//problem 2
public class volume {
//
//    private static void calcCube() {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Input length: ");
//        double length = scanner.nextDouble();
//        double volume = length * length * length ;
//
//        System.out.println("Cube volume: " + volume);
//
//    }
//
//    private static void calcRectangularPrism() {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Input length: ");
//        double length = scanner.nextDouble();
//        System.out.print("Input width: ");
//        double width = scanner.nextDouble();
//        System.out.print("Input height: ");
//        double height = scanner.nextDouble();
//
//        double volume = length * width * height;
//
//        System.out.println("Rectangular prism volume: " + volume);
//
//    }
//
//    private static void calcCylinder() {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("input radius: ");
//        double radius = scanner.nextDouble();
//        System.out.print("input depth: ");
//        double depth = scanner.nextDouble();
//
//        double volume = Math.PI * Math.pow(radius, 2) * depth;
//
//        System.out.println("Cylinder volume: " + volume + " or " + Math.round(volume));
//
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculate volume for:");
        System.out.println("1. Cube");
        System.out.println("2. Rectangular Prism");
        System.out.println("3. Cylinder");
        System.out.print("Input your choice (1/2/3): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                calcCube.volumeCube();
                break;
            case 2:
                calcRectangularPrism.volumeRectangularPrism();
                break;
            case 3:
                calcCylinder.volumeCylinder();
                break;
            default:
                System.out.println("not valid");
        }
    }
}