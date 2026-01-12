
package com.cogent.round68.java.practice;


public class NestedLoop {
    public static void main(String[] args) {
        int i, j = 0, k;
        
       
        for (i = 1; i <= 5; i++) {
            System.out.println("Hello");
            System.out.println(i);
        }
        System.out.println(i);
        
        
        /*
        for ( i = 1; i <= 2; i++) {
            System.out.println("Hi"); //2
            for (j = 1; j <= 5; j++) {
                System.out.println("Alen"); //2*5
            }
        }
        System.out.println(i);
        System.out.println(j);
        */
        
        /*
        for ( i = 0; i < 2; i++) {
            for ( j = 0; j < 3; j++) {
                for ( k = 0; k < 5; k++) {  //2*3*5
                    System.out.println("I'm going to be a software engineer");
                    System.out.println(k);
                }
            }
        }
        */
        
        /*
        for ( i = 1; i <= 10; i++) {
            for ( j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        */
        
        /*
        for ( i = 5; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        */
    }
}