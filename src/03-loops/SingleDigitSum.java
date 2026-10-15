public class SingleDigitSum {

    public static void main(String[] args) {

        int number = 9875;

        while (number >= 10) {

            int sum = 0;

            while (number > 0) {

                sum += number % 10;

                number /= 10;
            }

            number = sum;
        }

        System.out.println("Single Digit Sum: " + number);
    }
}