public class RecursiveFactorial {

    static long factorial(int number) {

        if (number < 0 || number > 20) {
            throw new IllegalArgumentException(
                "Enter a number between 0 and 20"
            );
        }

        if (number == 0 || number == 1) {
            return 1;
        }

        return number * factorial(number - 1);
    }

    public static void main(String[] args) {

        int number = 5;

        long result = factorial(number);

        System.out.println("Factorial = " + result);
    }
}