public class AutomorphicNumber {

    public static void main(String[] args) {

        int number = 25;
        long square = (long) number * number;

        long temp = number;
        long divisor = 1;

        do {
            divisor *= 10;
            temp /= 10;
        } while (temp != 0);

        if (number >= 0 && square % divisor == number) {
            System.out.println("Automorphic Number");
        } else {
            System.out.println("Not Automorphic Number");
        }
    }
}