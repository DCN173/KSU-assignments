import java.util.Scanner;
public class Lab9A
{
    public static void main(String[] args) {
        Scanner userInput =new Scanner(System.in);
        int[] array=new int[10];
        int i,number,flag=0;
        System.out.println("Please enter 10 numbers:");
        for(i=0;i<10;i++){
            System.out.print("Integer "+(i+1)+": ");
            array[i]=userInput.nextInt();
        }
        System.out.print("What is the target number:");
        number=userInput.nextInt();
        for(i=0;i<10;i++)
        {
            if(array[i]==number)
            {
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println("The target is in the set.");}
        else{
            System.out.println("The target is not in the set.");}
    }
}