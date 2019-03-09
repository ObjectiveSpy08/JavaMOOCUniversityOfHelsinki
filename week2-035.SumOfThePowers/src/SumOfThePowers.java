
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int s = 0, n;
        System.out.println("Type a number: ");
        n = reader.nextInt();
        for (int i = 0; i <= n; i++) s += Math.pow(2, i);
        System.out.println(s);
    }
}
