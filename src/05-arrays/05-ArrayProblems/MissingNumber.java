public class MissingNumber {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 4, 5};

        int n = numbers.length + 1;

        long expectedSum = (long) n * (n + 1) / 2;

        long actualSum = 0;

        for (int number : numbers) {
            actualSum += number;
        }

        long missingNumber = expectedSum - actualSum;

        System.out.println("Missing number: " + missingNumber);
    }
}