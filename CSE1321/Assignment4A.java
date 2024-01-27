import java.util.Scanner;

public class Assignment4A {
    public static void main(String[] args){

        int x = 0;
        int y = 0;
        int startNumber;
        int endNumber;

        Scanner userInput = new Scanner(System.in);
        System.out.println("What loop do you want to use?");
        int choice = userInput.nextInt();

        switch(choice) {
            case 1:
                System.out.println("Your Choice:" + choice);
                System.out.println("Whats your start number?");
                startNumber = userInput.nextInt();
                System.out.print("Counting: ");

                while(startNumber >= 0){
                    System.out.print(startNumber + ", ");
                    startNumber--;
                }
                break;

            case 2:
                System.out.println("Your Choice:" + choice);
                System.out.println("Whats your start number?");
                startNumber = userInput.nextInt();
                System.out.print("Counting: ");
                do {
                    System.out.print(startNumber + ", ");
                    startNumber--;
            }while (startNumber >= 0);
                break;

            case 3:
                System.out.println("Your Choice:" + choice);
                System.out.println("Whats your start number?");
                startNumber = userInput.nextInt();
                System.out.println("Whats your end number?");
                endNumber = userInput.nextInt();
                System.out.print("Counting: ");

                for ( ; startNumber >= endNumber;startNumber--)
                    System.out.print(startNumber + ", ");
                break;
        }

    }
}
