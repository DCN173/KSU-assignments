import java.util.Scanner;
public class Asssignment4B {
    public static void main(String[] args){

        int squareSize;
        int borderSize;
        int squarecolor;
        int bordercolor;


        do {
            Scanner userInput = new Scanner(System.in);
            System.out.println("Enter the size of the square:");
            squareSize = userInput.nextInt();
            if (squareSize <= 0){
                System.out.println("Invalid input!");
            }
        }while (squareSize < 0);

        do {
            Scanner userInput = new Scanner(System.in);
            System.out.println("Enter the size of the border:");
            borderSize = userInput.nextInt();
            if (borderSize <= 0){
                System.out.println("Invalid input!");
            }
        }while (borderSize < 0);

        do {
            Scanner userInput = new Scanner(System.in);
            System.out.println("Enter the color of the square:");
            squarecolor = userInput.nextInt();
            if (!(squarecolor == 0 || squarecolor == 1)){
                System.out.println("Invalid input!");
            }
        }while (!(squarecolor == 0 || squarecolor == 1));

        do {
            Scanner userInput = new Scanner(System.in);
            System.out.println("Enter the color of the border:");
            bordercolor = userInput.nextInt();
            if (!(bordercolor == 0 || bordercolor == 1)){
                System.out.println("Invalid input!");
            }
        }while (!(bordercolor == 0 || bordercolor == 1));

        System.out.println("PBM File Contents:");
        System.out.println("P1");
        System.out.print((borderSize + bordercolor + squareSize + squarecolor));
        System.out.print(" " + (borderSize + bordercolor + squareSize + squarecolor));

        //First the for loop will print a certain amount of rows before it reaches the square
        //then you will add the border size twice then add the square to get the total amount of 0s or 1s to print
        //Once that ends border size will print then square then border again and it will repeat based on the square size
        //Once this finishes then  the loop from before can be duplicated















    }
}
