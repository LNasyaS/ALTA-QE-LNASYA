import java.util.Scanner;
import ap.*;

//problem 1
public class areaPerimeter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculate area and perimeter for:");
        System.out.println("1. Square");
        System.out.println("2. Triangle");
        System.out.println("3. Rectangle");
        System.out.print("Input your choice (1/2/3): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                calcSquare.apSquare();
                break;
            case 2:
                calcTriangle.apTriangle();
                break;
            case 3:
                calcRectangle.apRectangle();
                break;
            default:
                System.out.println("not valid");
        }
    }
}
