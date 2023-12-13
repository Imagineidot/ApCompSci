
import java.util.Scanner;

public class AverageClass {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
         int num1,num2,num3;
        System.out.println("Enter 3 integers");
        num1 = scan.nextInt();
         num2 = scan.nextInt();
          num3 = scan.nextInt();
        System.out.println("The average of "+num1+" and "+num2+" and "+num3+" is "+(num1+num2+num3)/3+"" );
        
        
    }
}
