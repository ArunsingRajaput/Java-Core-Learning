public class PrimeNumber {

    public static void main(String[] args) {

        int number = 17;

        boolean isPrime = number > 1;

        for (int i = 2; i <= number / i; i++) {

            if (number % i == 0) {

                isPrime = false;
                break;
            }
        }

        if (isPrime) {

            System.out.println("Prime Number");
        } else {

            System.out.println("Not Prime Number");
        }
    }
}