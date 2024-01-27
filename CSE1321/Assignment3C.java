import java.util.Scanner;

public class Assignment3C {
    public static void main(String [] args){

        String userDecision;

        //Prints exclamation and creates scanner
        System.out.println("[Cretaceous Park Dialog]");
        System.out.println("""
                Oh no, the power has gone out at Cretaceous Park!\s
                 1) What does that mean?\s
                 2) No, I just turned the light off.""");
        Scanner userInput = new Scanner(System.in);

        userDecision = userInput.nextLine();

        //Starts the conditions
        if (userDecision.equals("No, I just turned off the light")){
            System.out.println("Oh thank goodness!");
        }
        else if (userDecision.equals("What does that mean?")) {
            System.out.println("[Cretaceous Park Dialog]");
            System.out.println("The dinosaurs will get loose... again...\n" +
                    "1) Life finds a way...\n" +
                    "2) What do we do?\n");
            userDecision = userInput.nextLine();
            if (userDecision.equals("Life finds a way...")){
                System.out.println("That’s not helpful right now!\n" +
                        "We have to evacuate the park!");
            } else if (userDecision.equals("What do we do?")) {
                System.out.println("We have to evacuate the park!");
            }
        }
    }
}
