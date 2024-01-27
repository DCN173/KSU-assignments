import java.util.Scanner;
public class Lab5C {
    public static void main(String[] args){

        int xValue;
        int yValue;

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter x:");
        xValue = userInput.nextInt();
        System.out.println("Enter y:");
        yValue = userInput.nextInt();

        if ((xValue == 0) && (yValue == 0)){
            System.out.println("This point is the origin.");
        } else if ((xValue == 0) && (yValue > 0)) {
            System.out.println("This point is on the y axis.");
        }
        else if ((yValue == 0) && (xValue > 0)) {
            System.out.println("This point is on the x axis.");
        }
        else if ((yValue > 0) && (xValue > 0)) {
            System.out.println("This point is in the first quadrant.");
        }
        else if ((yValue > 0) && (xValue < 0)) {
            System.out.println("This point is in the second quadrant.");
        }
        else if ((yValue < 0) && (xValue < 0)) {
            System.out.println("This point is in the third quadrant.");
        }
        else if ((yValue < 0) && (xValue > 0)) {
            System.out.println("This point is in the fourth quadrant.");
        }


        for (int hi = 5; hi==5; hi++){
            System.out.println("Hi");
        }
    }
}
