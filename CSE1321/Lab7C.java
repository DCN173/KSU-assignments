import java.util.Scanner;

public class Lab7C {
    public static void main(String[] args){

        //Creates variable
        int size;

        //Asks for box size and stores it
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a value for the size:");
        size = userInput.nextInt();
        System.out.println("This is the requested " + size + "x" + size + " right-triangle:");

        for (int x = 0; x < size; x++) {
            for (int y = size; y > x; y--) {
                System.out.print(" ");
            }
            for (int z = 1; z <= x + 1; z++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
