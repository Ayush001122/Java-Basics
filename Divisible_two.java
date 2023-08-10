 import java.util.Scanner;
  public class Divisible_two{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number: ");
      int a= sc.nextInt();
      if (a%2==0){
        System.out.println("It is divisible by 2");
      }
      else
      System.out.println("It is not divisable by 2");
  }
}
