import java.util.Scanner;

//part 2 problem 4
public class prime {

    private static boolean primeNumber(int number) {
        for(int i = 2; i < number/2; i++) {
            if(number%i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Input prime number: ");
		int number = Integer.parseInt(scanner.nextLine());
		boolean isPrime = primeNumber(number);

		if (isPrime) {
			System.out.println( number + " is a prime number");
		} else {
			System.out.println( number + " is not a prime number");
		}
    }
}
