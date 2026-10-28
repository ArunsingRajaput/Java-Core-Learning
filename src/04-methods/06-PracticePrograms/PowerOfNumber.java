public class PowerOfNumber {

    static long calculatePower(int base, int exponent) {

        if (exponent < 0) {
            throw new IllegalArgumentException(
                "Exponent must be non-negative"
            );
        }

        long result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        return result;
    }

    public static void main(String[] args) {

        int base = 2;
        int exponent = 5;

        long result = calculatePower(base, exponent);

        System.out.println("Power = " + result);
    }
}