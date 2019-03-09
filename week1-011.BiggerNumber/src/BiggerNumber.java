
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i,j;
        System.out.print("Type a number: ");
        i  = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        j  = Integer.parseInt(reader.nextLine());
        System.out.print("The bigger number of the two numbers given was: " + Math.max(i,j));
        // Implement your program here. Remember to ask the input from user
    }
}
