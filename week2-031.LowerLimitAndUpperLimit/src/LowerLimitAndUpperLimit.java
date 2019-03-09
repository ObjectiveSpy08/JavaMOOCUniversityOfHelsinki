
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int l,h;
        System.out.println("First: ");
        l = reader.nextInt();
        System.out.println("Last: ");
        h = reader.nextInt();
        while(l<=h) {
            System.out.println(l);
            l++;
        }
        // write your code here

    }
}
