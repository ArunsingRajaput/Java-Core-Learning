public class StrongNumber {

    public static void main(String[] args) {

        int number = 145;
        int original = number;
        int sum = 0;

        do {

            int digit = number % 10;
            int factorial = 1;

            for (int i = 1; i <= digit; i++) {
                factorial *= i;
            }

            sum += factorial;
            number /= 10;

        } while (number > 0);

        if (original >= 0 && sum == original) {
            System.out.println("Strong Number");
        } else {
            System.out.println("Not Strong Number");
        }
    }
}