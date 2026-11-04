import java.util.Arrays;

public class InsertionSort {

    static void sort(int[] numbers) {

        int n = numbers.length;

        for (int i = 1; i < n; i++) {

            int key = numbers[i];

            int j = i - 1;

            while (j >= 0 && numbers[j] > key) {

                numbers[j + 1] = numbers[j];

                j--;
            }

            numbers[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        int[] numbers = {50, 20, 40, 10, 30};

        System.out.println("Original Array: "
                + Arrays.toString(numbers));

        sort(numbers);

        System.out.println("Sorted Array: "
                + Arrays.toString(numbers));
    }
}