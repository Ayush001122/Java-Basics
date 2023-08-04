import java.util.Scanner;
public class Check_pass_fail{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks=sc.nextInt();
        String report=(marks>=33)?"PASS":"FAIL";
        System.out.println(report);
    }
}

 