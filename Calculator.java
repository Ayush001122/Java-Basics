// Simple Calculator 
import java.util.Scanner;
public class Calculator{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter value a: ");
        float a=sc.nextInt();
        System.out.print("Enter value b: ");
        float b=sc.nextInt();
        System.out.print("Enter operator here: ");
        char operator=sc.next().charAt(0);
        switch(operator){
            case '+':
            System.out.println("Answer: "+ (a+b));
            break;
            case '-':
            System.out.println("Answer: "+ (a-b));
            break;
            case '*':
            System.out.println("Answer: "+ (a*b));
            break;
            case '/':
            System.out.println("Answer: "+ (a/b));
            break;
            case '%':
            System.out.println("Answer: "+ (a%b));
            break;
            default:
            System.out.println("Wrong operator");
        }
    }
}
