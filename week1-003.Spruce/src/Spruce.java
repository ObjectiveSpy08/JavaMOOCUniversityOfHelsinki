public class Spruce {

    public static void main(String[] args) {

        // Write code here
        int i = 4, j = 1, k;
        while (i >= 0 && i <= 9) {
            for (k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            for (k = 1; k <= j; k++) {
                System.out.print("*");
            }
            System.out.println("");
            i--;
            j += 2;
        }
        for (k = 1; k <= 4; k++) {
            System.out.print(" ");
        }
        System.out.print("*");
    }

}
