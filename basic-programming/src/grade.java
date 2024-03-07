import java.util.Scanner;

//part 1 problem 2
public class grade {

	public static String gradeCalculator(int studentScore) {
		if(studentScore >= 80) {
			return "A";
		} else if (studentScore >= 65) {
			return "B+";
		} else if (studentScore >= 50) {
			return "B";
		} else if (studentScore >= 35) {
			return "C";
		} else if (studentScore >= 0) {
			return "D";
		} else if (studentScore <= 0 || studentScore > 100) {
			return "Invalid";
		}
		return null;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input student score: ");
		int studentScore = Integer.parseInt(scanner.nextLine());
		String grade = gradeCalculator(studentScore);
		System.out.println("The student grade is " + grade);

	}

}
