
import java.util.Scanner;
import java.text.DecimalFormat;

public class HeronsFormClass {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
      DecimalFormat fmt3 = new DecimalFormat("0.###");
        Double a, b, c, s;
     
        System.out.println("Enter Triangle side lengths");
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();
        System.out.println("The perimeter of the triangle is "+(a+b+c));
        System.out.println("s is equal to "+(a+b+c)/2);
        s = (a+b+c)/2;
        System.out.println("Using Herons Formula the area of the triangle is "+((fmt3.format(Math.sqrt(s*(s-a)*(s-b)*(s-c))))));
        
    }
}
