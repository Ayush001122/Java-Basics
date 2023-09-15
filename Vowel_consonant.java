// Vowel Consonant 
import java.util.Scanner;
public class Vowel_consonant{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter alphabet/word here: " );
        char ch= sc.next().charAt(0);
        switch(ch){
            case 'A':
            case 'O':
            case 'I':
            case 'E':
            case 'U':
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            System.out.println(" It is Vowel");
            break;
            default:
            System.out.println("It is Consonant");
        }
    }
}