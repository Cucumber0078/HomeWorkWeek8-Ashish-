package A8javahomeworkweek8;

import java.util.Scanner;

public class A10ArmstrongnNumberProgramme10_Done {
    private static boolean isArmStorng(int num) {
        int result = 0;
        int orig = num;
        while (num != 0) {
            int rem = num % 10;
            result = result + rem * rem * rem;
            num = num / 10;

        }
        if (orig == result) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Please enter a 3 digit number to find Armstrong number :");
        int num = new Scanner(System.in).nextInt();
        if (isArmStorng(num)) {
            System.out.println("Number : " + num + " is a Armstrong number");
        } else {
            System.out.println("Number : " + num + " is not a Armstrong number");
        }
    }
}
