import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i, j;
        System.out.println("Type the first number:");
        i = reader.nextInt();
        System.out.println("Type the second number:");
        j = reader.nextInt();
        System.out.print(i == j ? "The numbers are equal!" : ("Greater number: " + Math.max(i, j)));
    }
}
