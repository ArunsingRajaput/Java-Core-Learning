import java.util.Scanner;

public class ArrayUsingScanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        if (size < 0) {
            System.out.println("Array size cannot be negative.");
            sc.close();
            return;
        }

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " elements:");

        for (int i = 0; i < size; i++) {

            numbers[i] = sc.nextInt();
        }

        System.out.println("Array Elements:");

        for (int i = 0; i < size; i++) {

            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        sc.close();
    }
}