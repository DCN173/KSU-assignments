import java.util.Scanner;

public class Assignment3A {
    public static void main(String [] args){


        //Creates variables for coordinates
        float xCoordinate;
        float yCoordinate;

        //Asks user for X and Y coordinates and stores it
        Scanner userInput = new Scanner(System.in);

        System.out.println("[Cretaceous Park GIS]");

        System.out.println("X Coordinate: ");
        xCoordinate = userInput.nextFloat();

        System.out.println("Y Coordinate: ");
        yCoordinate = userInput.nextFloat();

        if((xCoordinate > 8) || (xCoordinate < 0) || (yCoordinate > 8) || (yCoordinate < 0)){
            System.out.println("WARNING: You have left the boundaries of the park.\n" + "Please return immediately.");
        }
        else if (((xCoordinate >= 6) && (xCoordinate < 8)) && ((yCoordinate < 4) && (yCoordinate >= 2))){
            System.out.println("You are at the Visitor’s Center");
        }
        else if (((xCoordinate >= 5) && (xCoordinate < 8)) && ((yCoordinate < 8) && (yCoordinate >= 5))){
            System.out.println("You are at the Deinonychus Pen");
        }
        else if (((xCoordinate >= 5) && (xCoordinate < 8)) && ((yCoordinate < 2) && (yCoordinate >= 0))){
            System.out.println("You are at the Pterodactyl Aviary");
        }
        else if (((xCoordinate >= 2) && (xCoordinate < 4)) && ((yCoordinate < 6) && (yCoordinate >= 2))){
            System.out.println("You are at the T. Rex Lake");
        }
        else if (((xCoordinate >= 6) && (xCoordinate < 8)) && ((yCoordinate < 5) && (yCoordinate >= 4))){
            System.out.println("You are at the Triceratops Grasslands");
        }
        else if (((xCoordinate >= 5) && (xCoordinate < 6)) && ((yCoordinate < 5) && (yCoordinate >= 2))){
            System.out.println("You are at the Triceratops Grasslands");
        }
        else if (((xCoordinate >= 4) && (xCoordinate < 5)) && ((yCoordinate < 8) && (yCoordinate >= 0))){
            System.out.println("You are at the Triceratops Grasslands");
        }
        else if (((xCoordinate >= 2) && (xCoordinate < 4)) && ((yCoordinate < 8) && (yCoordinate >= 6))){
            System.out.println("You are at the Triceratops Grasslands");
        }
        else if (((xCoordinate >= 0) && (xCoordinate < 2)) && ((yCoordinate < 8) && (yCoordinate >= 2))){
            System.out.println("You are at the Triceratops Grasslands");
        }
        else if (((xCoordinate >= 0) && (xCoordinate < 4)) && ((yCoordinate < 2) && (yCoordinate >= 0))){
            System.out.println("You are at the Triceratops Grasslands");
        }







    }
}
