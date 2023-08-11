// Age of children

import java.util.Scanner;
public class Age{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter age: ");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("adult");
        }
        else if(age>13 && age<18){
            System.out.println("teenager");
        }
        else{
            System.out.println("child");
        }
        
    }
}

