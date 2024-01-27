import java.util.Scanner;

public class Assignment2A {
    public static void main(String[] args){

        /* Scans user input and stores it */
        Scanner numberInput = new Scanner(System.in);
        System.out.println("First number:");
        int firstNumber = numberInput.nextInt();

        System.out.println("Second number:");
        int secondNumber = numberInput.nextInt();

        System.out.println("Number for Modulus Operation:");
        int modulusNumber = numberInput.nextInt();

        //Math for the four variables
        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        int product = firstNumber * secondNumber;
        int quotient = firstNumber / secondNumber;

        //Math using modulus
        int modulusSum = sum % modulusNumber;
        int modulusDifference = difference % modulusNumber;
        int modulusProduct = product % modulusNumber;
        int modulusQuotient = quotient % modulusNumber;

        System.out.println(firstNumber+" + "+secondNumber+" = "+sum+".  The remainder if divided by "+modulusNumber+" is "+modulusSum+".");
        System.out.println(firstNumber+" - "+secondNumber+" = "+difference+".  The remainder if divided by "+modulusNumber+" is "+modulusDifference+".");
        System.out.println(firstNumber+" * "+secondNumber+" = "+product+".  The remainder if divided by "+modulusNumber+" is "+modulusProduct+".");
        System.out.println(firstNumber+" / "+secondNumber+" = "+quotient+" (Approximately).  The remainder if divided by "+modulusNumber+" is "+modulusQuotient+".");












}

}
