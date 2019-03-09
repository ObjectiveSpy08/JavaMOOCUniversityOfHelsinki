
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0, f, l;
        System.out.println("First: ");
        f = reader.nextInt();
        System.out.println("Last: ");
        l = reader.nextInt();
        for (int i = f; i <= l; i++) sum += i;
        System.out.println(sum);
    }
}
