public class MaximumElement {

    public static void main(String[] args) {

        int[] numbers = {25, 10, 75, 40, 60};

        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Maximum Element = " + max);
    }
}