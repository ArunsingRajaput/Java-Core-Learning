public class ArmstrongNumber {

    public static void main(String[] args) {

        int number = 153;

        int original = number;

        int temp = number;

        int digits = 0;

        do {
            digits++;
            temp /= 10;
        } while (temp != 0);

        temp = number;

        long sum = 0;

        while (temp > 0) {

            int digit = temp % 10;

            long power = 1;

            for (int i = 1; i <= digits; i++) {
                power *= digit;
            }

            sum += power;

            temp /= 10;
        }

        if (number >= 0 && sum == original) {

            System.out.println("Armstrong Number");
        } else {

            System.out.println("Not Armstrong Number");
        }
    }
}+