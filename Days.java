import java.util.Scanner;
public class Days{
    public static void main(String args[]){
         Scanner sc= new Scanner(System.in);
         System.out.print("Enter month here: ");
         int month=sc.nextInt();
         switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
            System.out.println("Number of days are 31");
            break;
            case 4:
            case 6:
            case 9:
            case 11:
            System.out.println("Number of days are 30");
            break;
            case 2:
            System.out.println("Number of days are 28 if non-leap year & number of days are 29 if leap year");
            default:
            System.out.println("Please enter number within 1-12");
        }
   }
}

