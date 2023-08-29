// average 
import java.util.Scanner;
public class Avg_two{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a=sc.nextInt();
        System.out.print("Enter number 2: ");
        int b=sc.nextInt();
        float avg=(a+b)/2;
        System.out.println("Average of 2 numbers: " + avg );
    }
}


