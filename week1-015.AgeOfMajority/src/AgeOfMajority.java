
import java.util.Scanner;

public class AgeOfMajority {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i;
        System.out.println("How old are you? ");
        i = reader.nextInt();
        System.out.println("You have" + (i < 18 ? " not " : " ") +"reached the age of majority!");
        // Type your program here 
    }
}
