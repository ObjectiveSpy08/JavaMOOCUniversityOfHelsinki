
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber(), n, cnt = 0;
        while(true) {
            System.out.println("Guess a number: ");
            n = reader.nextInt();
            cnt++;
            if(n == numberDrawn) { System.out.println("Congratulations, your guess is correct!"); break;}
            else if(n > numberDrawn) System.out.println("The number is lesser, guesses made: " + cnt);
            else System.out.println("The number is greater, guesses made: " + cnt);
        }

        // program your solution here. Do not touch the above lines!
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
