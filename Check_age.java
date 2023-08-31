// age 
import java.util.Scanner;
public class Check_age{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter age of Student A: ");
        int a= sc.nextInt();
        System.out.print("Enter age of Student B: ");
        int b= sc.nextInt();
        System.out.print("Enter age of Student C: ");
        int c= sc.nextInt();
        if (a>=b && a>=c){
        System.out.println("A is older");
        }
        else if (b>=c){
        System.out.println("B is older");
        }
        else
        System.out.println("C is older");
    }
}

