
import java.util.Scanner;

public class DistanceFormulaClass {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter two coordinates : ");
    Double x1,x2,y1,y2;
    String coordinate1, coordinate2;
    coordinate1 = scan.next();
     coordinate2 = scan.next();
        
        System.out.println("Enter x1 and x2");
   x1 = scan.nextDouble();
    x2 = scan.nextDouble();
        System.out.println(Math.pow((x1-x2), 2));
       
          System.out.println("Enter y1 and y2");
   y1 = scan.nextDouble();
    y2 = scan.nextDouble();
         System.out.println(Math.pow((y1-y2), 2));
        
         System.out.println(Math.sqrt(Math.pow((x1-x2), 2) + (Math.pow((y1-y2), 2))));
         
    }
}
