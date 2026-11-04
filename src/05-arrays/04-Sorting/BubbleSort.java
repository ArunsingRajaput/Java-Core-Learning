import java.util.Arrays;

public class BubbleSort {

    static void sort(int[] numbers) {

        int n = numbers.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - 1 - i; j++) {

                if (numbers[j] > numbers[j + 1]) {

                    int temp = numbers[j];

                    numbers[j] = numbers[j + 1];

                    numbers[j + 1] = temp;
                }
            }
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