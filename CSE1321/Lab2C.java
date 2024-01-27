import java.util.Scanner;

public class Lab2C {
    public static void main(String[] args){
        //Scans for input
        Scanner numberInput = new Scanner(System.in);

        //Asks for input and stores integer
        System.out.print("Enter a width: ");
        int width = numberInput.nextInt();

        System.out.print("Enter a height: ");
        int height = numberInput.nextInt();

        //Does the math for Perimeter and Area
        int perimeter = 2*(height+width);
        int area = height*width;

        //Prints the results to console
        System.out.print("The area is "+area);
        System.out.println("\n"+"The perimeter is "+perimeter);
    }
}
