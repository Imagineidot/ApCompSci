
import java.text.DecimalFormat;

public class FormatNumbers {
    public static void main(String[] args) {
        
    DecimalFormat fmt3 = new DecimalFormat("0.###");
    DecimalFormat fmt4 = new DecimalFormat("0000");
    DecimalFormat money = new DecimalFormat("$0.00");
    double val1 = 3.1415926;
    
        System.out.println(fmt3.format(val1));
    System.out.println(fmt4.format(val1));
     System.out.println(money.format(val1));
     
     
    }
}
