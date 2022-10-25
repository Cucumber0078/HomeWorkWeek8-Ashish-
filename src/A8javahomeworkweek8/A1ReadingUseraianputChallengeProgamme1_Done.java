package A8javahomeworkweek8;

import java.util.Scanner;

public class A1ReadingUseraianputChallengeProgamme1_Done {
    public void sumOfAllNumber() {
        Scanner scan = new Scanner(System.in);
        int count = 1;
        int sum = 0;

        while (count <= 10) {
            System.out.print(" Enter number # " + count + " : ");

            boolean verifyNumber = scan.hasNextInt();
            if (verifyNumber) {
                int n = scan.nextInt();
                sum += n;
                count++;

            } else {
                System.out.println("This is Invalid Number");
            }
            scan.nextLine();
        }
        System.out.println("Sum of all the numbers = " + sum);
        scan.close();
    }

    public static void main(String[] args) {
        A1ReadingUseraianputChallengeProgamme1_Done obj = new A1ReadingUseraianputChallengeProgamme1_Done();
        obj.sumOfAllNumber();
    }
}
