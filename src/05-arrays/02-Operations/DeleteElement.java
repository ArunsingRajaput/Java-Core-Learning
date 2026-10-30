import java.util.Arrays;

public class DeleteElement {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        int position = 2;

        if (position < 0 || position >= numbers.length) {
            System.out.println("Invalid deletion position");
            return;
        }

        int[] result = new int[numbers.length - 1];

        for (int i = 0; i < position; i++) {
            result[i] = numbers[i];
        }

        for (int i = position + 1; i < numbers.length; i++) {
            result[i - 1] = numbers[i];
        }

        System.out.println("Original Array: "
                + Arrays.toString(numbers));

        System.out.println("After Deletion: "
                + Arrays.toString(result));
    }
}