import java.util.Scanner;
public class NokiaPhone {
    public static void printCharArray(char []chararray){
        for (int i = 0;i< chararray.length;i++){
            System.out.print(chararray[i] + ", ");
        }
    }

    public static void main(String[]args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("[Nokia Phone]");
        String stringToChar = "";
        int count = 1;
        String fullString = "";
        for (int i = 0; i < count; i++){
           stringToChar = userInput.next().substring(0,1);
           if(stringToChar.equals("#")){
               break;
           } else if (stringToChar.equals("*")) {
               fullString = fullString + " ";
               count++;
           }else {
               fullString = fullString + stringToChar;
               count++;
           }
        }
        char[] charArray = fullString.toCharArray();
        printCharArray(charArray);
    }
}




