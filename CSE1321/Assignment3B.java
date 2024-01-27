import java.util.Scanner;
public class Assignment3B {
    public static void main (String[] args){

        //Creates variables
        int imageWidth;
        int imageHeight;
        int fileSize;

        int bpc;
        int imageSum;

        //Asks user for input and stores it
        Scanner userInput = new Scanner(System.in);

        System.out.println("[Image Encoding Checker}");
        System.out.println("What is the image width? ");
        imageWidth = userInput.nextInt();

        System.out.println("What is the image height? ");
        imageHeight = userInput.nextInt();

        System.out.println("What is the file size (in bytes)? ");
        fileSize = userInput.nextInt();

        //Checks potential issues before heading to switch statement
        if (fileSize == imageWidth * imageHeight){
            System.out.println("The information is invalid - please re-enter it.");
        }
        else if((imageWidth <= 0) || (imageHeight <= 0) || (fileSize <= 0)){
            System.out.println("The information is invalid - please re-enter it.");
        }
        else {
            imageSum = imageWidth * imageHeight;
            bpc = fileSize/imageSum;
            switch (bpc)
            {
                case 3:
                    System.out.println("The RGB image is encoded with 8 bits per channel.");
                    break;
                case 6:
                    System.out.println("The RGB image is encoded with 16 bits per channel.");
                    break;
                case 12:
                    System.out.println("The RGB image is encoded with 32 bits per channel.");
                    break;
                default:
                    System.out.println("your computer does not know how to read this encoding");
            }

        }

    }
}
