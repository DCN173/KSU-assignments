import java.util.Scanner;
public class Lab4B {
    public static void main(String[] args){

        //Asks for the day of the week and stores it
        String dayOfTheWeek = "";
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the day:");
        dayOfTheWeek = userInput.nextLine();

        //Compares input to see if it matches one or the other
        if ((dayOfTheWeek.equals("Monday")) || (dayOfTheWeek.equals("monday")))
        {
            System.out.println("I have class today!");
        }
        else if ((dayOfTheWeek.equals("Tuesday")) || (dayOfTheWeek.equals("tuesday")))
        {
            System.out.println("I should use this time to do my homework.");
        }
        else if ((dayOfTheWeek.equals("Wednesday")) || (dayOfTheWeek.equals("wednesday")))
        {
            System.out.println("I have class today!");
        }
        else if ((dayOfTheWeek.equals("Thursday")) || (dayOfTheWeek.equals("thursday")))
        {
            System.out.println("I should use this time to do my homework.");
        }

        else if ((dayOfTheWeek.equals("Friday")) || (dayOfTheWeek.equals("friday")))
        {
            System.out.println("  It's Friday! Friday! Gotta get down on Friday!");
        }
        else if ((dayOfTheWeek.equals("Sunday")) || (dayOfTheWeek.equals("sunday")))
        {
            System.out.println("I should use this time to do my homework.");
        }



    }
}
