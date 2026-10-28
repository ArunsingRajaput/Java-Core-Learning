public class LCMMethod {

    static int findGCD(int a, int b) {

        while (b != 0) {

            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    static long findLCM(int a, int b) {

        if (a == 0 || b == 0) {
            return 0;
        }

        int gcd = findGCD(a, b);

        return ((long) a / gcd) * b;
    }

    public static void main(String[] args) {

        int a = 12;
        int b = 18;

        long result = findLCM(a, b);

        System.out.println("LCM = " + result);
    }
}