// To Check Even Odd
import java.util.Scanner;
public class Check_even_odd{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number: ");
        int num=sc.nextInt();
        // even numbers are always divisible by 2  
        
        if(num%2==0){ 
            System.out.print("EVEN");
        }
        else{
            System.out.print("ODD");
        }
    }
}
