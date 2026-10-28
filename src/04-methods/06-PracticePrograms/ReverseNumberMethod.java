public class ReverseNumberMethod {

    static int reverseNumber(int number) {

        int reverse = 0;

        while (number > 0) {

            int digit = number % 10;

            reverse = reverse * 10 + digit;

            number /= 10;
        }

        return reverse;
    }

    public static void main(String[] args) {

        int number = 12345;

        int result = reverseNumber(number);

        System.out.println("Original Number = " + number);
        System.out.println("Reversed Number = " + result);
    }
}