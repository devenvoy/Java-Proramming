package javabasic;

import java.util.Scanner;

public class pwsaq1 {
    public static void main (String[] args) {
         Scanner scn = new Scanner (System.in);
         int x = scn. nextInt();
         System.out.print((((x + 8) / 3) % 5) * 5);
     }

}