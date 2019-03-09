
import java.util.Scanner;

public class PositiveValue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i;
        System.out.println("Type a number: ");
        i = reader.nextInt();
        System.out.print("The number is " + (i <= 0 ? "not positive" : "positive"));
        // Type your program here:
    }
}
