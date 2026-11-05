import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 10, 30, 20, 40};

        LinkedHashSet<Integer> uniqueNumbers = new LinkedHashSet<>();

        for (int number : numbers) {
            uniqueNumbers.add(number);
        }

        System.out.println("Original array:");

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println("\nAfter removing duplicates:");

        for (int number : uniqueNumbers) {
            System.out.print(number + " ");
        }
    }
}