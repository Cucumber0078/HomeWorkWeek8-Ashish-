package A8javahomeworkweek8;

import java.util.Scanner;

public class A14DiamondProgramme14_Done {
    public class AnDiamond14 {
        public static void main(String[] args){

            int a;
            int b;
            int c;
            System.out.print("Input number of rows (half of the diamond) : ");
            Scanner scanner = new Scanner(System.in);
            c= scanner.nextInt();
            for(a=0;a<=c;a++)
            {
                for(b=1;b<=c-a;b++)
                    System.out.print(" ");
                for(b=1;b<=2*a-1;b++)
                    System.out.print("*");
                System.out.print("\n");
            }

            for(a=c-1;a>=1;a--)
            {
                for(b=1;b<=c-a;b++)
                    System.out.print(" ");
                for(b=1;b<=2*a-1;b++)
                    System.out.print("*");
                System.out.print("\n");
            }

        }

    }
}
