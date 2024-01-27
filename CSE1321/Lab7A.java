import java.util.Scanner;
public class Lab7A {
    public static void main(String[] args){

        //Creates variables
        int size;

        //Asks for box size and stores it
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a value for the size:");
        size = userInput.nextInt();
        System.out.println("This is the requested " + size + "x" + size + " box:");

        //It will increase by 1 until it reaches the users desired size
        for (int x = 1;x <= size;x++){
            //will print asterics on the same line until requestedBox is equal to users size
            for (int y = 1;y <= size;y++){
                //prints asterics on the same line
                System.out.print("*");
            }
            //Once all asterics are printed it will move onto the next line and continue the loop
            System.out.println();
        }

    }
}
