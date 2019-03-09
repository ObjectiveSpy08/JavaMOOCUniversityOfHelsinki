
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        float i,j;
        System.out.println("Type a number: ");
        i = Integer.parseInt(reader.nextLine());
        System.out.println("Type another number: ");
        j = Integer.parseInt(reader.nextLine());
        System.out.println("Division: " + i + " / " + j + " = " + i/j);
        // Implement your program here. Remember to ask the input from user.
    }
}
