import java.util.Scanner;
public class Area_circle{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter radius: ");
    float rad=sc.nextFloat();

    // Area of circle= 3.14*rad*rad units
    float Area= 3.14f*rad*rad;
    System.out.println("Area: " + Area);
  }
}
