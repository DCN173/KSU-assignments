import java.util.Arrays;
import java.util.Scanner;

public class Lab9B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[11];

        System.out.println("Please enter 11 numbers:");
        for (int i = 0; i < 11; i++) {
            System.out.print("Integer " + (i+1) + ": ");
            array[i] = input.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.print("The sorted set is:");
        for (int i = 0; i < array.length; i++) {
        System.out.print(" " + array[i]);
        }
        System.out.println();
        System.out.println("What is the target number: ");
        int target = input.nextInt();
        int low = 0;
        int high = array.length - 1;
        int mid = 0;
        boolean found = false;

        while (low <= high) {
            mid = (low + high) / 2;
            System.out.println("Low is " + low);
            System.out.println("High is " + high);
            System.out.println("Mid is " + mid);

            if (array[mid] == target) {
                found = true;
                break;
            } else if (array[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

            System.out.println("Searching");
        }

        if (found) {
            System.out.println("The target is in the set.");
        } else {
            System.out.println("The target is not in the set.");
        }
    }
}