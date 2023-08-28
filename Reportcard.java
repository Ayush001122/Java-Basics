// Report Card of Class 12th , CBSE !!
public class Reportcard{
    public static void main(String args[]){ 

        System.out.println("Report Card of 12th");

        String name="Ayush";
        System.out.println("Student name = "+ name);

        int Maths=78;
        System.out.println("Marks in Mathematics = "+ Maths);

        int Chemistry=83;
        System.out.println("Marks in Chemistry = "+ Chemistry);

        int Physics=86;
        System.out.println("Marks in Physics = "+ Physics);

        int English=81;
        System.out.println("Marks in English = "+ English);

        int Physical_Education=85;
        System.out.println("Marks in Physical Education = "+ Physical_Education);

        int Total_Marks =(Maths+Chemistry+Physics+English+Physical_Education);
        System.out.println("Total Marks of Student = "+ Total_Marks);

        double Percentage = (Maths+Chemistry+Physics+English+Physical_Education)/5;
        System.out.println("Percentage of Student = "+ Percentage);

        // Qualify or not?
        System.out.println("Qualify Status = PASS");
    }
}

