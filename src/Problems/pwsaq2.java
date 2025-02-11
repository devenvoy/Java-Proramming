package Problems;
// Find the total number of bits needed to be flipped to convert x to y.

// //The idea is to take XOR of the given two integers. After calculating the XOR, the problem will reduce to
// counting set bits in the XOR output using Brian Kernighan algorithm.

import java.util.Scanner;

public class pwsaq2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        scn.close();
        int n = x ^ y;
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        System.out.print(count);
    }
}