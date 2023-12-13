
import java.util.Scanner;

public class GetStuffDoStuff {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String game; 
        int hour;
        boolean isreal = true;
        System.out.println("What game do you play?");
        game = scan.next();
        System.out.println("How long do you usually play?");
        hour = scan.nextInt();
        System.out.println( isreal +" is this real... true or false?");
        isreal = scan.nextBoolean();
        
        
        
    }
            
}