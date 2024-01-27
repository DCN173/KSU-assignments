import java.util.Random;
public class Assignment6B {
    public static boolean checkIfSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i+1]) {
                return false;
            }
        }
        return true;
    }

    public static int[] shuffleArray(int[] arr) {

        int[] newArr = arr.clone();

        Random rnd = new Random();

        for (int i = newArr.length - 1; i > 0; i--) {

            int index = rnd.nextInt(i + 1);

            int temp = newArr[index];
            newArr[index] = newArr[i];
            newArr[i] = temp;
        }
        return newArr;
    }

    public static void printArray(int[] arr) {
        System.out.print("Printing array... \n");
        for (int i : arr) {
            System.out.print(i + ",");
        }
        if (checkIfSorted(arr)) {
            System.out.println("\nHooray, it's sorted!");
        }
        else {
            System.out.println("\n Not sorted yet!\n");
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[17];
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(359) + 1;
        }

        printArray(arr);
        int count = 0;
        while (!checkIfSorted(arr)) {
            arr = shuffleArray(arr);
            printArray(arr);
            count++;
        }
        System.out.println("And it only took " + count + " attempts!");
    }
}