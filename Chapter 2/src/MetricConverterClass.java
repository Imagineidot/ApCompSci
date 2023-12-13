
import java.util.Scanner;
public class MetricConverterClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        double  Miles;
        System.out.println("Enter amount of miles");
        Miles = scan.nextDouble();
        System.out.println(""+Miles+" miles to kilometers is "+(Miles*1.609344)+" kilometers");
       
    }
}
