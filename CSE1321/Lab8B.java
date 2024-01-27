import java.util.Scanner;

public class Lab8B {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        int rows, columns;

        System.out.print("Please enter the number of rows: ");
        rows = userInput.nextInt();

        System.out.print("Please enter the number of columns: ");
        columns = userInput.nextInt();

        int myArray[][] = new int[rows][columns];
        int x = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                myArray[i][j] = x++;
            }
        }

        System.out.println("I have " + rows + " rows and " + columns + " columns. I need to fill-up " + (rows*columns) + " spaces.");

        System.out.println("The " + rows + "x" + columns + " array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(myArray[i][j] + " | ");
            }
            System.out.println();
        }
    }
}