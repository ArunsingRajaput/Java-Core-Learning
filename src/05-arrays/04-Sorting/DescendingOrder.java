import java.util.Arrays;

public class DescendingOrder {

    public static void main(String[] args) {

        int[] numbers = {45, 10, 80, 25, 5};

        for (int i = 0; i < numbers.length - 1; i++) {

            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[i] < numbers[j]) {

                    int temp = numbers[i];

                    numbers[i] = numbers[j];

                    numbers[j] = temp;
                }
            }
        }

        System.out.println("Descending Order: "
                + Arrays.toString(numbers));
    }
}