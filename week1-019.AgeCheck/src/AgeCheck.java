
import java.util.Scanner;

public class AgeCheck {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i;
        System.out.println("How old are you? ");
        i = reader.nextInt();
        System.out.println((i >= 0 && i <= 120) ? "OK" : "Impossible!");
    }
}
