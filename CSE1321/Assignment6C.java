import java.util.Random;

public class Assignment6C{
    public static int binarySearch(int[] array, int target){
        int guess = 0;
        int low = 0;
        int high = array.length-1;
        int index = Integer.MAX_VALUE;
        while(low <= high){
            int mid = low + ((high-low)/2);
            guess += 1;

            if(array[mid]<target) {
                low = mid+1;
            }
            else if(array[mid]>target){
                high = mid-1;
            }
            else if(array[mid]==target){
                index = mid;
                break;
            }
        }
        return guess;
    }

    public static int linearSearch(int[] array, int target) {
        int k = array.length, count = 0;
        for(int i=0; i<k; i++){
            count += 1;
            if(array[i]==target){
                break;
            }
        }
        return count;
    }

    public static void main(String[] args)
    {
        int size = 1000000;
        int[] array = new int[size];
        for(int i=0; i<size; i++) { array[i] = i; }

        // Generate a Random Target (To be Searched)
        Random rand = new Random();
        int target = rand.nextInt(size);

        // Performing Linear Search on Array (Returning Number of iterations)
        int linears = linearSearch(array,target);

        // Performing Binary Search on Array (Returning Number of Guesses)
        int binarys = binarySearch(array,target);

        // Print the Output and Number of iterations and guesses
        System.out.println("\nComparing Linear Search and Binary Search:");
        System.out.println("Our target is "+target);
        System.out.println("Linear Search: "+linears+" loop(s)");
        System.out.println("Binary Search: "+binarys+" guess(es)");

        // Comparing Number of Iteration of Linear Search with guesses of Binary Search
        if(linears>binarys) { System.out.println("Binary Search is faster this time!"); }
        else { System.out.println("Linear Search is faster this time!"); }
    }
}