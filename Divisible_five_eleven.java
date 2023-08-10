import java.util.Scanner;
public class Divisible_five_eleven{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number: ");
        int a= sc.nextInt();
        if (a%5==0 && a%11==0){
            System.out.println("Number is divisible by 5&11");
        }
        else
        System.out.println("Number is not divisible by 5&11 ");
    }
}
