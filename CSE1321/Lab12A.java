import java.util.*;

class Chair {
    public int numOfLegs;
    public boolean rolling;
    public String material;

    Chair(int numOfLegs, boolean rolling, String material) {
        this.numOfLegs = numOfLegs;
        this.rolling = rolling;
        this.material = material;
    }
}

public class Lab12A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("You are about to create a chair.");
        System.out.print("How many legs does your chair have: ");
        int numOfLegs = Integer.parseInt(in.nextLine());
        System.out.print("Is your chair rolling (true/false): ");
        boolean rolling = in.nextBoolean();
        in.nextLine();
        System.out.print("What is your chair made of: ");
        String material = in.nextLine();

        Chair obj = new Chair(numOfLegs, rolling, material);

        System.out.println("Your chair has " + obj.numOfLegs + " legs, is " +
                (obj.rolling ? "" : "not ") + "rolling, and is made of " + obj.material + ".");

        obj.numOfLegs = 4;
        obj.rolling = false;
        obj.material = "wood";

        System.out.println("This program is going to change that.");
        System.out.println("Your chair has " + obj.numOfLegs + " legs, is " +
                (obj.rolling ? "" : "not ") + "rolling, and is made of " + obj.material + ".");
    }
}
