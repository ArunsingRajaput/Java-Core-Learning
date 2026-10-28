public class GCDMethod {

    static int findGCD(int a, int b) {

        while (b != 0) {

            int temp = b;

            b = a % b;

            a = temp;
        }

        return a;
    }

    public static void main(String[] args) {

        int a = 24;
        int b = 36;

        int result = findGCD(a, b);

        System.out.println("GCD = " + result);
    }
}