import java.util.Random;
import java.util.Scanner;

class Player {
    private String name;
    private int roLimit;
    private int shamLimit;

    public Player(String name, int roLimit, int shamLimit) {
        this.name = name;
        this.roLimit = roLimit;
        this.shamLimit = shamLimit;
    }

    public boolean play(String attack) {
        String opponentAttack;
        Random rand = new Random();
        int randNum = rand.nextInt(101);

        if (randNum <= roLimit) {
            opponentAttack = "Ro";
        } else if (randNum <= shamLimit) {
            opponentAttack = "Sham";
        } else {
            opponentAttack = "Bo";
        }

        if (attack.equals("Ro") && opponentAttack.equals("Bo")) {
            return false;
        } else if (attack.equals("Sham") && opponentAttack.equals("Ro")) {
            return false;
        } else if (attack.equals("Bo") && opponentAttack.equals("Sham")) {
            return false;
        } else {
            return true;
        }
    }

    public String getName() {
        return name;
    }
}

public class Assignment7A {
    public static void main(String[] args) {
        Player p1 = new Player("Player One", 30, 60);
        Player p2 = new Player("Player Two", 40, 85);

        System.out.println("Choose an opponent:");
        System.out.println("1. " + p1.getName());
        System.out.println("2. " + p2.getName());

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        Player opponent = (choice == 1) ? p1 : p2;

        while (true) {
            System.out.println("Enter 'Ro', 'Sham', 'Bo' to play or 'Quit' to quit");
            String attack = scanner.next();

            if (attack.equals("Quit")) {
                break;
            } else if (!attack.matches("Ro|Sham|Bo")) {
                System.out.println("Invalid input. Please try again.");
            } else {
                boolean result = opponent.play(attack);
                System.out.println(result ? "You won!" : "You lost.");
            }
        }

        System.out.println("Thanks for playing!");
    }
}