

import java.util.Scanner;

public class ArithmeticClass {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
         double num1,num2;
        System.out.println("Enter 2 numbers");
        num1 = scan.nextDouble();
         num2 = scan.nextDouble();
       
        System.out.println("The sum of "+num1+" and "+num2+" and  is "+(num1+num2)+"" );
        System.out.println("The difference of "+num1+" and "+num2+" and  is "+(num1-num2)+"" );
        System.out.println("The product of "+num1+" and "+num2+" and  is "+(num1*num2)+"" );
    }
}
