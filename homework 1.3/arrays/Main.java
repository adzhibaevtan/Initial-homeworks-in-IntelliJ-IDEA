import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] numbers = {1.0, -2.0, 3.0, -4.0, 5.0, -6.0, 7.0, -8.0, 9.0, -10.0, 11.0, -12.0, 13.0, -14.0, 15.0};
        double result = 0;
        double length = 0;
        boolean minus = false;

        for (Double m : numbers) {
            if (m < 0) {
                minus = true;
            } else {
                if (m > 0 && minus) {
                    result += m;
                    length++;
                }
                System.out.println(m);
            }
        }
        System.out.println("\n");
        System.out.println(result / length);
        System.out.println("\n");

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    double temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}