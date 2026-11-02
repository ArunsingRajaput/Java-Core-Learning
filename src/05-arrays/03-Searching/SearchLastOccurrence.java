public class SearchLastOccurrence {

    static int lastOccurrence(int[] numbers, int target) {

        for (int i = numbers.length - 1; i >= 0; i--) {

            if (numbers[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 20, 40, 20};

        int target = 20;

        int result = lastOccurrence(numbers, target);

        if (result != -1) {
            System.out.println("Last Occurrence Index: " + result);
        } else {
            System.out.println("Element Not Found");
        }
    }
}