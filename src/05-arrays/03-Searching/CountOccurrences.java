public class CountOccurrences {

    static int countOccurrences(int[] numbers, int target) {

        int count = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == target) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 20, 40, 20};

        int target = 20;

        int result = countOccurrences(numbers, target);

        System.out.println("Occurrences = " + result);
    }
}