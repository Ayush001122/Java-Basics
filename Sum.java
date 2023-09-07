// Sum of number
import java.util.Scanner;
public class Sum{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter value 1: ");
    int a= sc.nextInt();
    System.out.print("Enter value 2: ");
    int b= sc.nextInt();
    int sum= a+b;
    System.out.println("sum: " + sum);
  }
}
