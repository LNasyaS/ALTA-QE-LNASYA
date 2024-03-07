
//part 2 problem 7
public class mean {

    private static double mean(double[] numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

    public static void main(String[] args) {
        double[] numbers = {1, 2, 3, 4};
        System.out.println(mean(numbers));
    }
}
