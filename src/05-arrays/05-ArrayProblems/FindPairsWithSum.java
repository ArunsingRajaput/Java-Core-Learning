import java.util.HashSet;
import java.util.Set;

public class FindPairsWithSum {
    public static void main(String[] args) {

        int[] numbers = {2, 4, 6, 8, 4, 6};

        int target = 10;

        Set<Integer> seen = new HashSet<>();
        Set<String> printedPairs = new HashSet<>();

        for (int number : numbers) {

            int complement = target - number;

            if (seen.contains(complement)) {

                int first = Math.min(number, complement);
                int second = Math.max(number, complement);

                String pair = first + "," + second;

                if (printedPairs.add(pair)) {
                    System.out.println(first + " + " + second + " = " + target);
                }
            }

            seen.add(number);
        }
    }
}