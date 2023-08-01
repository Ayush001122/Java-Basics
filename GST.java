import java.util.Scanner;
public class GST{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter price of pencil: ");
        float pencil=sc.nextFloat();
        System.out.print("Enter price of eraser: ");
        float eraser=sc.nextFloat();
        System.out.print("Enter price of pen: ");
        float pen=sc.nextFloat();
        float total= pen+pencil+eraser;
        System.out.println("Total price: "+ total);
        float with_gst = (total+ 0.18f*(total));
        System.out.println("Total cost with GST: "+ with_gst);
    }
}

