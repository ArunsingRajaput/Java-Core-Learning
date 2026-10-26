public class ArmstrongMethod {

    static boolean isArmstrong(int number) {

        if (number < 0) {
            return false;
        }

        int original = number;
        int temp = number;
        int digits = 0;

        // Count digits
        do {
            digits++;
            temp /= 10;
        } while (temp > 0);

        temp = number;
        long sum = 0;

        // Calculate sum of digit powers
        do {

            int digit = temp % 10;
            long power = 1;

            for (int i = 1; i <= digits; i++) {
                power *= digit;
            }

            sum += power;

            temp /= 10;

        } while (temp > 0);

        return sum == original;
    }

    public static void main(String[] args) {

        int number = 153;

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong Number");
        } else {
            System.out.println(number + " is Not an Armstrong Number");
        }
    }
}