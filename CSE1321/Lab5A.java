import java.util.Scanner;
public class Lab5A {
    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);
        System.out.println("Do you have a driving permit (Y/N)?");
        String yesNo = userInput.nextLine();

        if(yesNo.equals("n") || (yesNo.equals("N"))){
            System.out.println("Driving permit is a prerequisite to purchase a vehicle!");
        } else if (yesNo.equals("y") || (yesNo.equals("Y"))) {
            System.out.println("Do you have a commercial driving license (Y/N)?");
            yesNo = userInput.nextLine();
            if (yesNo.equals("n") || (yesNo.equals("N"))){
                System.out.println("Commercial driving license is a prerequisite to purchase a vehicle!");
            } else if (yesNo.equals("y") || (yesNo.equals("Y"))) {
                System.out.println("Congratulations! You can purchase a vehicle, let's start talking options!");
            }
        }




    }
}
