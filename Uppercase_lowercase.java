import java.util.Scanner;
public class Uppercase_lowercase{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter alphabet: ");
        char ch= sc.next().charAt(0);
        if (ch>='a' && ch<='z'){
        System.out.println("Lowercase");
         }
        else if(ch>='A' && ch<='Z')      
         System.out.println("Uppercase");
    }
}

