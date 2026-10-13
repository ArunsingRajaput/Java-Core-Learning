public class VariableCopy {

    public static void main(String[] args) {

        int a = 10;

        int b = a;

        System.out.println("A: " + a);
        System.out.println("B: " + b);

        a = 50;

        System.out.println("After changing A");

        System.out.println("A: " + a);
        System.out.println("B: " + b);
    }
}