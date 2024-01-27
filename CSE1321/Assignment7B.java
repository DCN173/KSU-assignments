
import java.io.FileNotFoundException;
import java.util.*;
class Pixel {
    private int red;
    private int green;
    private int blue;
    public Pixel() {
        this.red = 255;
        this.green = 255;
        this.blue = 255;
    }
    public Pixel(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }
    public void setColor(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }
    public void printColor() {
        System.out.println("RGB values: " + this.red + ", " + this.green + ", " + this.blue);
    }
    public int getRed() {
        return this.red;
    }
    public int getGreen() {
        return this.green;
    }
    public int getBlue() {
        return this.blue;
    }
}

public class Assignment7B {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner userInput = new Scanner(System.in);
        System.out.println("[Color Art Program]");
        System.out.print("Enter an image width: ");
        int width = userInput.nextInt();
        System.out.print("Enter an image height: ");
        int height = userInput.nextInt();

        Pixel[][] image_matrix = new Pixel[height][width];

        System.out.print("Enter the fill color’s red value:");
        int fillRed = userInput.nextInt();
        System.out.print("Enter the fill color's green value: ");
        int fillGreen = userInput.nextInt();
        System.out.print("Enter the fill color's blue value: ");
        int fillBlue = userInput.nextInt();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                image_matrix[i][j] = new Pixel(fillRed, fillGreen, fillBlue);
            }
        }
        int choice;
        do {
            System.out.println("\nWhat will you do?");
            System.out.println("1) Fill in a pixel");
            System.out.println("2) Fill in a line");
            System.out.println("3) Print the image");
            System.out.println("4) Quit");

            System.out.print("Choice? ");
            choice = userInput.nextInt();

            if (choice == 1) {
                System.out.print("Row: ");
                int row = userInput.nextInt();
                System.out.print("Column: ");
                int color = userInput.nextInt();
                System.out.print("New Red Color: ");
                int newRed = userInput.nextInt();
                System.out.print("New Green Color: ");
                int newGreen = userInput.nextInt();
                System.out.print("New Blue Color: ");
                int newBlue = userInput.nextInt();
                image_matrix[row][color].setColor(newRed, newGreen, newBlue);

            } else if (choice == 2) {
                System.out.println("Row: ");
                int startRow = userInput.nextInt();
                System.out.println("Column:");
                int startCol = userInput.nextInt();
                System.out.println("Last Row:");
                int endRow = userInput.nextInt();
                System.out.println("Last column: ");
                int endCol = userInput.nextInt();

                System.out.println("Enter red color: ");
                int myredinputvar = userInput.nextInt();
                System.out.println("Enter green color: ");
                int mygreeninputvar = userInput.nextInt();
                System.out.println("Enter blue color: ");
                int mybluevar = userInput.nextInt();

                for (int row = startRow; row <= endRow; row++) {
                    for (int col = startCol; col <= endCol; col++) {
                        Pixel pixel = new Pixel(myredinputvar, mygreeninputvar, mybluevar);
                        image_matrix[row][col] = pixel;
                    }
                }
            }
            else if (choice == 3) {
                System.out.println("PPM Image Contents");
                System.out.println("P3");
                System.out.println(width + " " + height);
                System.out.println("255");
                for (int row = 0; row < height; row++) {
                    for (int col = 0; col < width; col++) {
                        Pixel pixel = image_matrix[row][col];
                        System.out.print(pixel.getRed() + " ");
                        System.out.print(pixel.getGreen() + " ");
                        System.out.print(pixel.getBlue() + " ");
                    }
                    System.out.println();
                }
            } else if (choice == 4) {
                System.out.println("Goodbye!");
            } else {
                System.out.println("Invalid choice, try again.");
            }
            System.out.println();
        } while ((choice != 4));
    }
}
