import java.util.Scanner;
public class SorthNameLength {
    public static void sort(String [] unsortedArray){
        for (int i = 0;i < unsortedArray.length;i++){
            String temp = unsortedArray[i];
            int j = i -1;
            while (j >= 0 && temp.length() < unsortedArray[j].length()){
                unsortedArray[j + 1] = unsortedArray[j];
                j--;
            }
            unsortedArray[j + 1] = temp;
        }

    }
    public static void printArray(String []namePrint){
        for (int i = 0; i < namePrint.length; i++){
            System.out.print(namePrint[i] + ", ");

        }
    }
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        String []nameArray = new String[5];
        System.out.println("Enter 5 names");
        int count = 1;
        for (int i = 0;i < 5;i++){
            System.out.printf("Name %d:\n",count);
            nameArray[i] = userInput.next();
            count++;
        }
        sort(nameArray);
        printArray(nameArray);
    }
}
