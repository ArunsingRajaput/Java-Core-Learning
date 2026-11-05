public class SecondLargest {
    public static void main(String[] args) {

        int[] numbers = {10, 25, 5, 40, 30};

        long largest = Long.MIN_VALUE;
        long secondLargest = Long.MIN_VALUE;

        for (int number : numbers) {

            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } 
            else if (number > secondLargest && number < largest) {
                secondLargest = number;
            }
        }

        if (secondLargest == Long.MIN_VALUE) {
            System.out.println("Second largest element does not exist.");
        } else {
            System.out.println("Second largest: " + secondLargest);
        }
    }
}