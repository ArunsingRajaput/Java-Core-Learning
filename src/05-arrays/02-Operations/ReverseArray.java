import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Original Array: "
                + Arrays.toString(numbers));

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {

            int temp = numbers[left];

            numbers[left] = numbers[right];

            numbers[right] = temp;

            left++;
            right--;
        }

        System.out.println("Reversed Array: "
                + Arrays.toString(numbers));
    }
}