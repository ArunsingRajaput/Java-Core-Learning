public class BinaryToDecimal {

    public static void main(String[] args) {

        String binary = "1101";
        int decimal = 0;

        for (int i = 0; i < binary.length(); i++) {

            int digit = binary.charAt(i) - '0';

            if (digit != 0 && digit != 1) {
                System.out.println("Invalid Binary Number");
                return;
            }

            decimal = decimal * 2 + digit;
        }

        System.out.println("Binary: " + binary);
        System.out.println("Decimal: " + decimal);
    }
}