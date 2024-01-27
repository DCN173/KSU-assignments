package CSE1322;

import java.util.Scanner;
class stockItem {
    private final String name;
    private final String description;
    private double price;
    private int quantity;
    private int id;
    private static int nextId = 0;

    //Getters
     public String getDescription(){
         return description;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
    public int getId(){
        return id;
    }
    //Setters
    public void newPrice(double setPrice){

        if (setPrice < 0){
            System.out.println("Price cannot be below zero");
        }else {
            price = setPrice;
        }
    }

    public void lowerQuantity(){
        quantity -= 1;
    }

    public void higherQuantity(int setQuantity){
        quantity += setQuantity;
    }

    public stockItem(String newName,String newDescription, double newPrice, int newQuantity, int nextId) {
         name = newName;
        description = newDescription;
        price = newPrice;
        quantity = newQuantity;
        id = nextId++;
    }
    public stockItem(){
         name = "Bread";
         description = "1 Loaf of Bread";
         price = 1.98;
         quantity = 30;
         id = nextId++;

    }
    @Override
    public String toString(){
         return name+": Item number: " + id+" is "+description+" has price "+price+" we currently have "+quantity+" in stock";
    }
}
public class Lab2 {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        stockItem milk = new stockItem("Milk","1 Gallon of Milk",3.60,15, 1);
        stockItem bread = new stockItem();

        int choice;
        do {
            System.out.println("1. Sold One Milk\n" +
                    "2. Sold One Bread\n" +
                    "3. Change price of Milk\n" +
                    "4. Change price of Bread\n" +
                    "5. Add Milk to Inventory\n" +
                    "6. Add Bread to Inventory\n" +
                    "7. See Inventory\n" +
                    "8. Quit\n");
            choice = userInput.nextInt();
            switch (choice) {
                case 1:
                    milk.lowerQuantity();
                    break;
                case 2:
                    bread.lowerQuantity();
                    break;
                case 3:
                    System.out.println("What is the new price for milk");
                    milk.newPrice(userInput.nextDouble());
                    break;
                case 4:
                    System.out.println("What is the new price for bread");
                    bread.newPrice(userInput.nextDouble());
                    break;
                case 5:
                    System.out.println("How many milk did we get?");
                    milk.higherQuantity(userInput.nextInt());
                    break;
                case 6:
                    System.out.println("How many bread did we get?");
                    bread.higherQuantity(userInput.nextInt());
                    break;
                case 7:
                    System.out.println(milk);
                    System.out.println(bread);
                    break;
                case 8:
                    System.out.println("Exiting");
                    break;
            }
        } while (choice != 8);
    }
}
