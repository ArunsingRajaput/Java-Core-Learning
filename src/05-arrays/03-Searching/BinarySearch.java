public class BinarySearch {

    static int search(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (numbers[mid] == target) {
                return mid;
            }

            if (numbers[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50, 60, 70};

        int target = 50;

        int result = search(numbers, target);

        if (result != -1) {
            System.out.println("Element Found at Index: " + result);
        } else {
            System.out.println("Element Not Found");
        }
    }
}