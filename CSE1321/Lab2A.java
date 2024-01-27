import java.util.Scanner;

public class Lab2A {
    public static void main (String[] args){

        // Asks for input and assigns it to a variable
        Scanner nameInput = new Scanner(System.in);
        System.out.println("Enter a name:");
        String name = nameInput.nextLine();

        Scanner anotherNameInput = new Scanner(System.in);
        System.out.println("Enter another name:");
        String anotherName = nameInput.nextLine();

        Scanner verbInput = new Scanner(System.in);
        System.out.println("Enter a verb:");
        String verb = nameInput.nextLine();

        Scanner adverbInput = new Scanner(System.in);
        System.out.println("Enter an adverb:");
        String adverb = nameInput.nextLine();

        //Prints the given inputs into a MadLib
        System.out.println("Once upon a time, there was a person named "+name+" who had a child named "+anotherName+". "+"This child would "+verb+" "+adverb+" while singing to strangers.");







    }
}
