import java.util.Scanner;
import calculator.*;

//problem 3
public class calculator {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculate for:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Input your choice (1/2/3/4): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                add.addition();
                break;
            case 2:
                sub.subtraction();
                break;
            case 3:
                multi.multiplication();
                break;
            case 4:
                div.division();
                break;
            default:
                System.out.println("not valid");
        }
    }
}
