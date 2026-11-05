import java.util.Arrays;

public class RotateArrayLeft {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        int k = 2;
        int n = numbers.length;

        if (n > 0) {
            k = k % n;

            reverse(numbers, 0, k - 1);
            reverse(numbers, k, n - 1);
            reverse(numbers, 0, n - 1);
        }

        System.out.println(Arrays.toString(numbers));
    }

    static void reverse(int[] numbers, int start, int end) {

        while (start < end) {

            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;

            start++;
            end--;
        }
    }
}