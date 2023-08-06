import java.util.Scanner;
public class Range{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter number here: ");
    int a=sc.nextInt();
    if (a<=20){
      System.out.print("The number lies in range 0-20");
    }
    else if (a<=40){
      System.out.print("The number lies in range 20-40");
    }
    else if (a<=60){
      System.out.print("The number lies in range 40-60");
    }
    else if (a<=80){
      System.out.print("The number lies in range 60-80");
    }
    else
    System.out.print("The number doesn't lies within range");
  }
}

