public class EvenOddMethod {

    static boolean isEven(int number) {

        return number % 2 == 0;
    }

    public static void main(String[] args) {

        int number = 15;

        if (isEven(number)) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
    }
}