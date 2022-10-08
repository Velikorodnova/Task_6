import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = {35, 7, 8, 73, 12, 5, 56, 3};
        System.out.println(Arrays.toString(getNumbers(a)));
    }

    public static int[] getNumbers(int[] numbers) {
        int[] resultNumbers = {numbers[2], numbers[3], numbers[4], numbers[5], numbers[6]};
        for (int i = 0; i < resultNumbers.length; i++) {
            if (resultNumbers[i] % 2 == 0) {
                resultNumbers[i] = resultNumbers[i] + 1;
            }
        }
        return resultNumbers;
    }
}