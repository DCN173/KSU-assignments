import java.util.*;

class Dog {
    public int age;
    public double weight;
    public String name;
    public String color;
    public String breed;

    public void introduce(){
        System.out.println(name + " is a " + age + " year old " + color + " " + breed + " that weighs " + weight + " lbs.");
    }

    public void bark(){
        System.out.println("Woof! Woof!");
    }

    public void eat(double foodAmount){
        System.out.print(name + " is hungry, how much should he eat: ");
        Scanner sc = new Scanner(System.in);
        foodAmount = sc.nextDouble();
        weight += foodAmount;
        System.out.println(name + " now weighs " + weight + " lbs.");
    }

    public void rename(){
        System.out.print(name + " isn't a very good name. What should they be renamed to:");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println(name + " is a " + age + " year old " + color + " " + breed + " that weighs " + weight + " lbs.");
    }
}

public class Lab12B{
    public static void main(String[] args){
        Dog dog = new Dog();
        Scanner sc = new Scanner(System.in);
        System.out.println("You are about to create a dog");
        System.out.print("How old is the dog: ");
        dog.age = sc.nextInt();
        System.out.print("How much does the dog weigh: ");
        dog.weight = sc.nextDouble();
        sc.nextLine();
        System.out.print("What is the dog's name: ");
        dog.name = sc.nextLine();
        System.out.print("What color is the dog: ");
        dog.color = sc.nextLine();
        System.out.print("What breed is the dog: ");
        dog.breed = sc.nextLine();
        System.out.println();
        dog.introduce();
        dog.bark();
        dog.eat(0);
        dog.rename();
    }
}