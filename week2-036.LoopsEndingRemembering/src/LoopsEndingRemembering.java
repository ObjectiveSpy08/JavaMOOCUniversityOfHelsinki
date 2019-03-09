import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts

        Scanner reader = new Scanner(System.in);
        int sum = 0, n, cnt = 0, e = 0, o = 0;
        System.out.println("Type numbers: ");
        while (true) {
            n = reader.nextInt();
            if (n == -1) {
                System.out.println("Thank you and see you later!");
                System.out.println("The sum is " + sum);
                System.out.println("How many numbers: " + cnt);
                System.out.println("Average: " + (double) sum / cnt);
                System.out.println("Even numbers: " + e);
                System.out.println("Odd numbers: " + o);
                break;
            }
            sum += n;
            cnt++;
            if (n % 2 == 0) e++;
            else o++;
        }

    }
}
