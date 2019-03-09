
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double i;
        System.out.println("Type the radius: ");
        i = Integer.parseInt(reader.nextLine());
        System.out.println("Circumference of the circle: " + 2 * Math.PI * i);
        // Program your solution here 
    }
}
