
package evidenceproblemsolve.logic;

import java.util.Scanner;


public class OddEven {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.print("Enter number " + i + ": ");
            int num = sc.nextInt();

            if (num % 2 == 0) {
                System.out.println(num + " is Even");
            } else {
                System.out.println(num + " is Odd");
            }
        }

        sc.close();
    }
}

