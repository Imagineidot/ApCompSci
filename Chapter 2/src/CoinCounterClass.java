import java.text.DecimalFormat;
import java.util.Scanner;

public class CoinCounterClass
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner (System.in); 
        
        DecimalFormat fmt3 = new DecimalFormat("0.00");
        
        System.out.println("Enter the number of quarters, dimes, nickels, and pennies to computer your total amount of money.");
        
        int q, d, n, p;
       
        q = scan.nextInt();
        d = scan.nextInt();
        n = scan.nextInt();
        p = scan.nextInt();

        System.out.println("You have $"+fmt3.format((q*0.25)+(d*0.1)+(n*0.05)+(p*0.01))+" Need more money bud");         
   }
}


