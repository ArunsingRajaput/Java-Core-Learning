public class RecursiveSum {

    static int calculateSum(int n) {

        if (n < 0) {
            throw new IllegalArgumentException(
                "Number must be non-negative"
            );
        }

        if (n == 0) {
            return 0;
        }

        return n + calculateSum(n - 1);
    }

    public static void main(String[] args) {

        int number = 5;

        int result = calculateSum(number);

        System.out.println("Sum = " + result);
    }
}