
package evidenceproblemsolve.logic;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many number: ");
        int n = sc.nextInt();
        
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        int max = num, min = num;
        
        for (int i = 1; i < n; i++) {
            System.out.println("Enter your number: ");
            num = sc.nextInt();
            
            if(num > max){
            max = num;
            }
            if(num < min){
            min = num;
            }
        }
        System.out.println("Max number is: "+max);
        System.out.println("Max number is: "+min);
    }
}
