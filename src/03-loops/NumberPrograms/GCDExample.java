public class GCDExample {

    public static void main(String[] args) {

        int a = 48;
        int b = 18;

        while (b != 0) {

            int remainder = a % b;

            a = b;

            b = remainder;
        }

        System.out.println("GCD: " + a);
    }
}