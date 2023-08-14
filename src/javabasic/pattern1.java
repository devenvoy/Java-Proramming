package javabasic;

import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, k;

        int n = sc.nextInt();
        int m = sc.nextInt();

        // rectangle
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("```````````````````````````````````````````````````````````````````````````");
        System.out.println("```````````````````````````````````````````````````````````````````````````");
        
        // Hollow rectangle
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= m; j++) {
                if (i == 1 || i == n || j == 1 || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("```````````````````````````````````````````````````````````````````````````");
        System.out.println("```````````````````````````````````````````````````````````````````````````");
      
        // Numeric rectangular pattern
        for(i = 1; i<=n ;i++){
            for( j = i; j<=n;j++){
                System.out.print(j);
            }
            for(k=1;k<i;k++){
                System.out.print(k);
            }
            System.out.println();
        }
        System.out.println("```````````````````````````````````````````````````````````````````````````");
        System.out.println("```````````````````````````````````````````````````````````````````````````");
        for(i=1;i<=n;i++){
            for(j =1;j<=m;j++){
                System.out.print(j);
            }
            System.out.println();
        } 

        System.out.println("```````````````````````````````````````````````````````````````````````````");
        System.out.println("```````````````````````````````````````````````````````````````````````````");
        for(i=1;i<=n;i++){
            for(j =1;j<=m;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                } else {
                    System.out.print("2");
                }
            }
            System.out.println();
        } 


    }
}
