import java.util.Scanner;

class Lab4A {

    public static void main(String[] args){

        float grade = 0;


        //Asks for the score and stores it
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the score of your exam: ");
        grade = userInput.nextFloat();

        //score goes through each if statement until one is matched
        if((grade <=100) && (grade >= 98)){
            System.out.println("Letter grade is: A+");
        }
        else if((grade <=97) && (grade >= 95)){
            System.out.println("Letter grade is: A:");
        }
        else if((grade <=94) && (grade >= 92)){
            System.out.println("Letter grade is: A-");
        }
        else if((grade <=91) && (grade >= 89)){
            System.out.println("Letter grade is: B+");
        }
        else if((grade <=88) && (grade >= 86)){
            System.out.println("Letter grade is: B");
        }
        else if((grade <=85) && (grade >= 83)){
            System.out.println("Letter grade is: B-");
        }
        else if((grade <=82) && (grade >= 80)){
            System.out.println("Letter grade is: C+");
        }
        else if((grade <=79) && (grade >= 77)){
            System.out.println("Letter grade is: C");
        }
        else if((grade <=76) && (grade >= 74)){
            System.out.println("Letter grade is: C-");
        }
        else if((grade <=73) && (grade >= 71)){
            System.out.println("Letter grade is: D+");
        }
        else if((grade <=70) && (grade >= 68)){
            System.out.println("Letter grade is: D");
        }
        else if((grade <=67) && (grade >= 65)){
            System.out.println("Letter grade is: D-");
        }
        else if((grade <=64) && (grade >= 0)){
            System.out.println("Letter grade is: F");
        }


    }
}