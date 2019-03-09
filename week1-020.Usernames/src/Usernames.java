
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String uname, pwd;
        System.out.println("Type your username: ");
        uname = reader.nextLine();
        System.out.println("Type your password");
        pwd = reader.nextLine();
        if((uname.equals("alex") && pwd.equals("mightyducks")) || (uname.equals("emily") && pwd.equals("cat")))
            System.out.println("You are now logged into the system!");
        else
            System.out.println("Your username or password was invalid!");
    }
}
