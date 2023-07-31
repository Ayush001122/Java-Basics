import java.util.Scanner;
public class Avg_three{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter value a= ");
        int a= sc.nextInt();
        System.out.print("Enter value b= ");
        int b= sc.nextInt();
        System.out.print("Enter value c= ");
        int c= sc.nextInt();
        int avg= (a+b+c)/3;
        System.out.println("Average of three numbers: "+ avg);
    }
}


