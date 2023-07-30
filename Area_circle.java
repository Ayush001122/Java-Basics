import java.util.Scanner;
public class Area_circle{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter radius: ");
    float rad=sc.nextFloat();

    // Area of circle= 22/7*rad*rad or 3.14*rad*rad 
    float Area= 3.14f*rad*rad;
    System.out.println("Area: " + Area);
  }
}
