import java.util.Scanner;

public class Assignment2C {
    public static void main(String[] args){

        /* Conversion Rates */
        final int MOON_DISTANCE = 384615384;
        final float ANIMAL_CRACKER_SIZE = 0.025F;

        Scanner input = new Scanner(System.in);
        System.out.println("How many meters?");
        float meters = input.nextFloat();

        double meterMoon = meters/MOON_DISTANCE;
        int meterAnimal = (int) (meters/ANIMAL_CRACKER_SIZE);

        System.out.println(meters+" meter(s) is...");
        System.out.println("..."+meterMoon);
        System.out.println("..."+(meterAnimal));


    }
}
