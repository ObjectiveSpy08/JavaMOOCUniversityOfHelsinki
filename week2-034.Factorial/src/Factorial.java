import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int f = 1, n;
        System.out.println("Type a number: ");
        n = reader.nextInt();
        for (int i = 2; i <= n; i++) f *= i;
        System.out.println(f);
    }
}
