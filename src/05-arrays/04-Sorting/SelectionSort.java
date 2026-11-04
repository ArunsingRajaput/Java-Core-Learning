import java.util.Arrays;

public class SelectionSort {

    static void sort(int[] numbers) {

        int n = numbers.length;

        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < n; j++) {

                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = numbers[i];

            numbers[i] = numbers[minIndex];

            numbers[minIndex] = temp;
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