import java.util.Arrays;
import java.util.Random;

public class Lab10B {
    private static final int ARRAY_SIZE = 17;
    private static final int MAX_RANDOM_VALUE = 359;
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        int[] arr = createRandomArray();
        printArray(arr);

        int numAttempts = 0;
        while (!isSorted(arr)) {
            arr = shuffleArray(arr);
            printArray(arr);
            numAttempts++;
        }
        System.out.println("Sorted in " + numAttempts + " attempts.");
    }

    private static int[] createRandomArray() {
        int[] arr = new int[ARRAY_SIZE];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = RANDOM.nextInt(MAX_RANDOM_VALUE) + 1;
        }
        return arr;
    }

    private static int[] shuffleArray(int[] arr) {
        int[] newArr = arr.clone();
        for (int i = newArr.length - 1; i > 0; i--) {
            int j = RANDOM.nextInt(i + 1);
            int temp = newArr[i];
            newArr[i] = newArr[j];
            newArr[j] = temp;
        }
        return newArr;
    }

    private static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i+1]) {
                return false;
            }
        }
        return true;
    }

    private static void printArray(int[] arr) {
        System.out.print("Array: ");
        System.out.println(Arrays.toString(arr));
        if (isSorted(arr)) {
            System.out.println("The array is sorted!");
        } else {
            System.out.println("The array is not sorted yet.");
        }
        System.out.println();
    }
}