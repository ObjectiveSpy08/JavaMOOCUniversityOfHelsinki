
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int y;
        System.out.println("Type a year: ");
        y = reader.nextInt();
        if (y % 400 == 0) System.out.println("The year is a leap year.");
        else if (y % 4 == 0 && y % 100 != 0) System.out.println("The year is a leap year.");
        else System.out.println("The year is not a leap year.");
    }
}
