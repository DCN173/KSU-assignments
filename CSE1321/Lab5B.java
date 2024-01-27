import java.util.Scanner;
public class Lab5B {
    public static void main(String[] args){

        int decision = 0;

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int number;
        number = userInput.nextInt();

        if ( 0 == number % 2 ) {
            decision = 2;
        } else if (0 == number % 3) {
            decision = 3;
        } else if (0 == number % 5) {
            decision = 5;
        }
        else decision = 0;

        switch ((int) decision){
            case 2:
                System.out.println("This number is divisible by 2");
                break;
            case 3:
                System.out.println("This number is divisible by 3");
                break;
            case 5:
                System.out.println("This number is divisible by 5");
                break;
            default:
                System.out.println("This number is undetermined");

        }


    }
}
