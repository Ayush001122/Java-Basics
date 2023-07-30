import java.util.Scanner;
public class Area_square{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter side: ");
        int side= sc.nextInt();

        // Area of square= side*side
        int area= side*side;
        System.out.println("Area of the square: "+ area);
    }
}
