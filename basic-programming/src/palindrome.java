import java.util.Scanner;

//part 2 problem 5
public class palindrome {

	private static boolean isPalindrome(String word) {
		int length = word.length();
		for (int i = 0; i < length / 2; i++) {
			if (word.charAt(i) != word.charAt(length - i - 1)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input word: ");
		String word = scanner.nextLine();

		if (isPalindrome(word)) {
			System.out.println(word + " is Palindrome");
		} else {
			System.out.println(word + " is not Palindrome");
		}
	}
}

