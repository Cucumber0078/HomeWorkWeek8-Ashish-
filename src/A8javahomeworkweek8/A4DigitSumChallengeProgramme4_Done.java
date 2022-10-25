package A8javahomeworkweek8;

import java.util.Scanner;

public class A4DigitSumChallengeProgramme4_Done {
    public static void armstrong() {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number: ");

        int number = scn.nextInt(), originalNumber, remainder, result = 0, n = 0;


        for (originalNumber = number; originalNumber != 0; originalNumber /= 10, ++n) ;

        for (originalNumber = number; originalNumber != 0; originalNumber /= 10) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
        }

        if (result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}


