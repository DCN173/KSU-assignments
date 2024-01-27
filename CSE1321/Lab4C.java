import java.util.Scanner;
public class Lab4C {
    public static void main(String [] args){

        //Welcomes user and stores their input
        System.out.println("Welcome!");
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please input a number: ");
        float numberInput = userInput.nextFloat();

        //Prints out the choices and stores the input for the switch
        System.out.println("What would you like to do to this number:");
        System.out.println("0) Get the additive inverse of the number");
        System.out.println("1) Get the reciprocal of the number");
        System.out.println("2) Square the number");
        System.out.println("3) Cube the number");
        System.out.println("4) Exit the program");
        int switchChoice = userInput.nextInt();

        //Searches for which number matches the switch and runs the matching case
        switch (switchChoice)
        {
            case 0:
                float additiveInverse = numberInput - (numberInput*2);
                System.out.println("The additive inverse of " + numberInput + " is "+ additiveInverse);
                break;
            case 1:
                float reciprocalNumber = 1/numberInput;
                System.out.println("The reciprocal of " + numberInput + " is " + reciprocalNumber);
                break;
            case 2:
                float squareNumber = numberInput * numberInput;
                System.out.println("The square of " + numberInput + " is " + squareNumber);
                break;
            case 3:
                float cubedNumber = numberInput * numberInput * numberInput;
                System.out.println("The cube of " + numberInput + " is " + cubedNumber);
                break;
            case 4:
                System.out.println("Thank you, goodbye!");
                break;
            default:
                System.out.println("Invalid input, please try again!");

        }

    }
}
