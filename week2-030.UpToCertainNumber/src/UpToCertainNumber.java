
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Write your code here
        System.out.println("Upto what number? ");
        int t = reader.nextInt();
        for(int i=1;i<=t;i++) System.out.println(i);
    }
}
