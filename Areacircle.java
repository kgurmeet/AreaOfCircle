import java.util.*;
public class Areacircle {
    public static void main(String [] args){
        Double a;
        int r;
        Scanner i = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        r = i.nextInt();
        a = 3.14*r*r;
        System.out.println("Area of circle " + a);
        i.close();
    }
    
}
