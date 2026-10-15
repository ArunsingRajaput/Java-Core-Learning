public class DecimalToBinary {

    public static void main(String[] args) {

        int decimal = 13;
        int number = decimal;

        String binary = "";

        do {

            int remainder = number % 2;

            binary = remainder + binary;

            number /= 2;

        } while (number > 0);

        System.out.println("Decimal: " + decimal);
        System.out.println("Binary: " + binary);
    }
}