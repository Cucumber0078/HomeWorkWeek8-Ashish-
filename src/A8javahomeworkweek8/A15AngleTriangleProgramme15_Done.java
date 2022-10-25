package A8javahomeworkweek8;

import java.util.Scanner;

public class A15AngleTriangleProgramme15_Done {
    public static void main(String[] args) {
        triangle();
    }

    public static void triangle() {
        int a, b;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter any number: ");
        int k = scan.nextInt();
        for (a = 0; a < k; a++) {

            for (b = 2 * (k - a); b >= 0; b--) {
                System.out.print(" ");
            }

            for (b = 0; b <= a; b++) {
                // printing stars
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
