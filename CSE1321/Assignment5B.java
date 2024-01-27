import java.util.Scanner;

public class Assignment5B {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("[KSU Image Manipulation Program]");
        System.out.print("Enter an image width: ");
        int width = userInput.nextInt();
        System.out.print("Enter an image height: ");
        int height = userInput.nextInt();
        System.out.print("Enter the fill color: ");
        int fill = userInput.nextInt();

        // Create the 2D array with the given dimensions and fill value
        int[][] image = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                image[i][j] = fill;
            }
        }

        // Loop for the menu
        while (true) {
            System.out.println("What will you do?");
            System.out.println("1) Fill in a pixel");
            System.out.println("2) Fill in a line");
            System.out.println("3) Print the image");
            System.out.println("4) Quit");
            System.out.println("Choice?");
            int choice = userInput.nextInt();
            if (choice == 1) {
                System.out.print("Row:");
                int row = userInput.nextInt();
                System.out.print("Column: ");
                int col = userInput.nextInt();
                System.out.print("New Color: ");
                int color = userInput.nextInt();
                if (row >= 0 && row < height && col >= 0 && col < width && color >= 0 && color <= 255) {
                    image[row][col] = color;
                } else {
                    System.out.println("Invalid information!");
                }
            } else if (choice == 2) {
                System.out.print("Row:");
                int row = userInput.nextInt();
                System.out.print("Column: ");
                int col = userInput.nextInt();
                System.out.print("New Color: ");
                int color = userInput.nextInt();
                System.out.print("Length: ");
                int length = userInput.nextInt();
                System.out.print("Direction: ");
                String dir = userInput.next();
                boolean valid = true;
                for (int i = 0; i < length && valid; i++) {
                    if (row < 0 || row >= height || col < 0 || col >= width) {
                        valid = false;
                    } else {
                        image[row][col] = color;
                        switch (dir) {
                            case "left":
                                col--;
                                break;
                            case "right":
                                col++;
                                break;
                            case "up":
                                row--;
                                break;
                            case "down":
                                row++;
                                break;
                            default:
                                valid = false;
                                break;
                        }
                    }
                }
                if (!valid) {
                    System.out.println("Invalid information!");
                }
            } else if (choice == 3) {
                // Print the PGM file
                System.out.println("P2");
                System.out.println(width + " " + height);
                System.out.println("255");
                for (int i = 0; i < height; i++) {
                    for (int j = 0; j < width; j++) {
                        System.out.print(image[i][j] + " ");
                    }
                    System.out.println();
                }
            } else if (choice == 4) {
                System.out.println("[Exiting KSU Image Manipulation Program]\n");
            }
        }
    }
}