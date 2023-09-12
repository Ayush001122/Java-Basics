// Positive Negative 
import java.util.Scanner;
public class Positive_negative{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your value here: ");
        int a= sc.nextInt();
        if (a<0){
            System.out.println("Number is negative");
        }
        else if (a>0){
            System.out.println("Number is positive");
        }
        else
        System.out.println("Number is zero");
    }
}

