import java.util.Random;

public class Assignment6A {

    // Performs a linear search on the array and returns the number of iterations
    public static int linearSearch(int[] array, int target) {
        int size = array.length;
        int count = 0;
        for (int i = 0; i < size; i++) {
            count += 1;
            if (array[i] == target) {
                break;
            }
        }
        return count;
    }

    // Performs a binary search on the array and returns the number of guesses
    public static int binarySearch(int[] array, int target) {
        int guess = 0;
        int low = 0;
        int high = array.length - 1;
        int index = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            guess += 1;
            if (array[mid] < target) {
                low = mid + 1;
            } else if (array[mid] > target) {
                high = mid - 1;
            } else if (array[mid] == target) {
                index = mid;
                break;
            }
        }
        return guess;
    }

    // Main method
    public static void main(String[] args) {
        int size = 1000000;
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }
        Random rand = new Random();
        int target = rand.nextInt(size);
        int linearSearchIterations = linearSearch(array, target);
        int binarySearchGuesses = binarySearch(array, target);
        System.out.println("\nComparing Linear Search and Binary Search:");
        System.out.println("Our target is " + target);
        System.out.println("Linear Search: " + linearSearchIterations + " loop(s)");
        System.out.println("Binary Search: " + binarySearchGuesses + " guess(es)");
        if (linearSearchIterations > binarySearchGuesses) {
            System.out.println("Binary Search is faster this time!");
        } else {
            System.out.println("Linear Search is faster this time!");
        }
    }
}