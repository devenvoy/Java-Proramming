package javabasic;

import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // triangle
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("```````````````````````````````````````````````````````````````````````````");
        System.out.println("```````````````````````````````````````````````````````````````````````````");
        
        // upside down triangle //Inverted triangle 
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=(n+1-i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
        for(int i = n ;i >= 1 ;i--){
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
         */

         System.out.println("```````````````````````````````````````````````````````````````````````````");
         System.out.println("```````````````````````````````````````````````````````````````````````````");
         
         //Pyramid 
         for(int i = 1 ;i <= n ;i++){
            for(int k = n-i;k >= 1;k--){
                System.out.print(" ");
            }
            for(int j = 1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("```````````````````````````````````````````````````````````````````````````");
        System.out.println("```````````````````````````````````````````````````````````````````````````");
        
        // Numeric Triangle pyramid
        for(int i = 1 ;i <= n ;i++){
            for(int k = n-i;k >= 1;k--){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print(j);
            }
            for(int l =i-1;l>=1;l--){
                System.out.print(l);
            }
            System.out.println();
        }

        // hollow triangle 

    }
}
