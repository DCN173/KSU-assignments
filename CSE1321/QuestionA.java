
import java.util.Scanner;

public class QuestionA {

    public static void main(String [] args){

        Scanner userInput = new Scanner(System.in);
        System.out.println("[T-9 Dialing]");
        System.out.println("Enter your message, one letter at a time:");

        String message = "";
        String filler;
        boolean end = false;
        int count = 1;
        do {
            filler = userInput.next();
            if (filler.equals("1") || filler.equals("11") || filler.equals("111")){
                switch (filler) {
                    case "1" -> message = message + "A";
                    case "11" -> message = message + "B";
                    case "111" -> message = message + "C";
                }
            } else if (filler.equals("2") || filler.equals("22")|| filler.equals("222")) {
                message = switch (filler) {
                    case "2" -> message + "D";
                    case "22" -> message + "E";
                    case "222" -> message + "F";
                    default -> message;
                };
            }else if (filler.equals("3") || filler.equals("33")) {
                message = switch (filler) {
                    case "3" -> message + "G";
                    case "33" -> message + "H";
                    default -> message;
                };
            }else if (filler.equals("4") || filler.equals("44") || filler.equals("444")) {
                message = switch (filler) {
                    case "4" -> message + "I";
                    case "44" -> message + "J";
                    case "444" -> message + "K";
                    default -> message;
                };
            }else if (filler.equals("5") || filler.equals("55") || filler.equals("555")) {
                message = switch (filler) {
                    case "5" -> message + "L";
                    case "55" -> message + "M";
                    case "555" -> message + "N";
                    default -> message;
                };
            }else if (filler.equals("6") || filler.equals("66")) {
                message = switch (filler) {
                    case "6" -> message + "O";
                    case "66" -> message + "P";
                    default -> message;
                };
            }else if (filler.equals("7") || filler.equals("77") || filler.equals("777") || filler.equals("7777")) {
                message = switch (filler) {
                    case "7" -> message + "Q";
                    case "77" -> message + "R";
                    case "777" -> message + "S";
                    case "7777" -> message + "T";
                    default -> message;
                };
            }else if (filler.equals("8") || filler.equals("88") || filler.equals("888") || filler.equals("8888")) {
                message = switch (filler) {
                    case "8" -> message + "U";
                    case "88" -> message + "V";
                    case "888" -> message + "W";
                    case "8888" -> message + "X";
                    default -> message;
                };
            }else if (filler.equals("9") || filler.equals("99")) {
                message = switch (filler) {
                    case "9" -> message + "Y";
                    case "99" -> message + "Z";
                    default -> message;
                };
            } else if (filler.equals("0")) {
                message = message + " ";
            } else if (filler.equals("*") || filler.equals("#")) {
                System.out.println(message);
                end = true;
            }else {
                //do nothing
            }
        }while (!(end));
    }
}
