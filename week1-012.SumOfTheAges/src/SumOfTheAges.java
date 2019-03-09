
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String a,b;
        int i,j;
        System.out.println("Type your name: ");
        a = reader.nextLine();
        System.out.println("Type your age: ");
        i = Integer.parseInt(reader.nextLine());
        System.out.println("Type your name: ");
        b = reader.nextLine();
        System.out.println("Type your age: ");
        j = Integer.parseInt(reader.nextLine());

        System.out.println(a + " and " + b + " are " + (i+j) + " years old in total.");
        // Implement your program here
    }
}
