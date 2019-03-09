
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Until what? ");
        int sum=0, n = reader.nextInt();
        for(int i=1;i<=n;i++) sum+=i;
        System.out.println(sum);
    }
}
