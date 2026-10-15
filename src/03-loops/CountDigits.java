public class CountDigits {

    public static void main(String[] args) {

        int number = 12345;

        int count = 0;

        do {

            count++;

            number /= 10;

        } while (number != 0);

        System.out.println("Total Digits: " + count);
    }
}