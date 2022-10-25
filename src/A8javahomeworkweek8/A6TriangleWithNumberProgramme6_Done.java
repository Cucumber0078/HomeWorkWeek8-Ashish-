package A8javahomeworkweek8;

import java.util.Scanner;

public class A6TriangleWithNumberProgramme6_Done {
    public static void main(String[] args) {
        triangle();
    }

    public static void triangle() {
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.print("Input number of rows : ");
        num = scan.nextInt();
        scan.close();

        for (int i = 1; i <= num; i++) {
            for (int h = 1; h <= i; h++) {
                System.out.print(h);
            }
            System.out.println();
        }
    }
}
