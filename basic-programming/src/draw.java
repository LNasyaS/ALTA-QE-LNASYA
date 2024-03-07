import java.util.Scanner;

//part 2 problem 6
public class draw {

    private static String drawXYZ(int height) {
        StringBuilder result = new StringBuilder();
        int count = 1;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (count % 3 == 0) {
                    result.append("X ");
                } else if (count % 2 == 0) {
                    result.append("Z ");
                } else {
                    result.append("Y ");
                }
                count++;
            }
            result.append("\n");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input height: ");
        int height = Integer.parseInt(scanner.nextLine());
        String result = drawXYZ(height);
        System.out.println(result);
    }
}
