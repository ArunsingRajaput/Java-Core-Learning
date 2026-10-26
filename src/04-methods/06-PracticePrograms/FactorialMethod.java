public class FactorialMethod {

    static long factorial(int number) {

        if (number < 0 || number > 20) {
            throw new IllegalArgumentException(
                "Enter a number between 0 and 20"
            );
        }

        long fact = 1;

        for (int i = 1; i <= number; i++) {
            fact *= i;
        }

        return fact;
    }

    public static void main(String[] args) {

        int number = 5;

        long result = factorial(number);

        System.out.println("Factorial of " + number + " = " + result);
    }
}