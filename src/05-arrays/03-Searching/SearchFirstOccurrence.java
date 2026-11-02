public class SearchFirstOccurrence {

    static int firstOccurrence(int[] numbers, int target) {

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 20, 40, 20};

        int target = 20;

        int result = firstOccurrence(numbers, target);

        if (result != -1) {
            System.out.println("First Occurrence Index: " + result);
        } else {
            System.out.println("Element Not Found");
        }
    }
}