import java.util.Scanner;

public class Assignment2B {
    public static void main(String [] args){

        //Creates scanner
        Scanner input = new Scanner(System.in);

        //Asks for user input and stores it
        System.out.println("[Fast-Forward]");
        System.out.println("What is the original video time?");
        float originalVideoTime = input.nextFloat();
        System.out.println("What is the playback speed factor?");
        float playbackSpeed = input.nextFloat();



        //Converts user input into seconds
        int modulusMinutes = 60*(int)(originalVideoTime/1);
        float modulusSeconds = Math.round(100*(originalVideoTime%1));
        int originalTime = (int) (modulusMinutes+modulusSeconds);

        //Does the math for New Video Time and Saved Time
        int newVideoTime = (int) (originalTime/playbackSpeed);
        int savedVideoTime = (originalTime - newVideoTime);

        //Prints output
        System.out.println("The new video time would be "+newVideoTime+"(s)");
        System.out.println("That saves you "+savedVideoTime+"(s) from the original video speed.");
    }
}
