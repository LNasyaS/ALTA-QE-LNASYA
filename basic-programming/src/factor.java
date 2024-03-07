import java.util.Scanner;

//part 1 problem 3
public class factor {

	private static String numberFactor(int number) {
        for (int i = 1; i <= number; i++ ) {
            if (number % i == 0) {
                System.out.println(i + " ");
            }
        }
        return null;
    }

    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input number: ");
		int number = Integer.parseInt(scanner.nextLine());
		String factor = numberFactor(number);
    }
}
