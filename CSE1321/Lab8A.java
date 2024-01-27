import java.util.Scanner;
public class Lab8A {
    public static void main(String[] args){

        //Creates count and arrays
        int arrayIntegers1 = 1;
        int arrayIntegers2 = 1;
        int[] arrayOne = new int[5];
        int[] arrayTwo = new int[5];

        //Asks for 5 values and stores them into the 1st array
        System.out.println("Please enter 5 integers for the first array:");
        Scanner userInput = new Scanner(System.in);
        for (int i = 0;i <=4;i++){
            System.out.println("Integer " + arrayIntegers1 +":");
            int uservalue = userInput.nextInt();

            arrayIntegers1++;
            arrayOne[i] = uservalue;
        }

        //Asks for 5 values and stores them into the 2nd array
        System.out.println("Please enter 5 integers for the second array:");
        for (int x = 0;x <=4;x++){
            System.out.println("Integer " + arrayIntegers2 +":");
            int uservalue = userInput.nextInt();

            arrayIntegers2++;
            arrayTwo[x] = uservalue;
        }
        System.out.print("The resulting sums are ");
        for (int y = 0;y <=4;y++){
            int sum = arrayOne[y] + arrayTwo[y];
            System.out.print(sum +"|");
        }



    }
}
