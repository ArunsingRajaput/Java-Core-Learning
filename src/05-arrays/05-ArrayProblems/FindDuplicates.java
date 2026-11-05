import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 10, 30, 20, 40, 10};

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int number : numbers) {

            if (!seen.add(number)) {
                duplicates.add(number);
            }
        }

        if (duplicates.isEmpty()) {
            System.out.println("No duplicate elements found.");
        } else {
            System.out.println("Duplicate elements: " + duplicates);
        }
    }
}