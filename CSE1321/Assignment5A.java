import java.util.Scanner;

public class Assignment5A {
    public static void main(String[] args) {
        int[] ID = {0,1,2,3,4};
        String[] firstName = {"Mark", "Amanda", "Norman", "Steve","Jesse"};
        String[] lastName = {"Sloan", "Bentley", "Briggs","Sloan", "Travis"};
        boolean[] medicalLicense = {true, true, false, false, true};
        int[] age = {67, 33, 47,35, 24};
        String[] occupation = {"Chief of Internal Medicine", "Pathologist", "Administrator","Hospital Security", "Surgeon Intern"};

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("[Community General Hospital Directory]");
            System.out.println("1) List all employees");
            System.out.println("2) Search employee records by ID");
            System.out.println("3) Search employee records by Last Name");
            System.out.println("4) Quit");
            System.out.print("Choice: ");
            choice = scanner.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    for (int i = 0; i < ID.length; i++) {
                        System.out.printf("#%d: %s %s, Age %d, %s, Medical License: %s\n",
                                ID[i], firstName[i], firstName[i], age[i], occupation[i],
                                medicalLicense[i] ? "TRUE" : "FALSE");
                    }
                    break;
                case 2:
                    System.out.print("Enter ID: ");
                    int idChoice = scanner.nextInt();
                    if (idChoice == 0 || idChoice == 1 ||idChoice == 2 ||  idChoice == 3  || idChoice == 4) {
                        System.out.printf("#%d: %s %s, Age %d, %s, Medical License: %s\n",
                                ID[idChoice], firstName[idChoice], firstName[idChoice], age[idChoice], occupation[idChoice],
                                medicalLicense[idChoice] ? "TRUE" : "FALSE");
                    } else {
                        System.out.println("Invalid ID!");
                    }
                    break;
                case 3:
                    System.out.print("Enter Last Name: ");
                    String searchLastName = scanner.next();
                    boolean found = false;
                    for (int i = 0; i < lastName.length; i++) {
                        if (lastName[i].equalsIgnoreCase(searchLastName)) {
                            System.out.printf("#%d: %s %s, Age %d, %s, Medical License: %s\n",
                                    ID[i], firstName[i], firstName[i], age[i], occupation[i],
                                    medicalLicense[i] ? "TRUE" : "FALSE");
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("No Records Found!");
                    }
                    break;
                case 4:
                    System.out.println("[Closing Directory...]");
                    break;
                default:
                    System.out.println("No option " + choice +"!");
                    break;
            }
            System.out.println();
        } while (choice != 4);
    }
}