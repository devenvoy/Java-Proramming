package LeetCode;

import java.util.Scanner;

public class happy_matrix {
    public static void main(String[] args) {
        happynumber obj = new happynumber();
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][3];
        System.out.println("Enter element in matrix:");

        // take input in matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        // check if it is happy number or not
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (obj.isHappyNumber(arr[i][j])) {
                    System.out.println(arr[i][j] + " is Happy number.");
                } else {
                    System.out.println(arr[i][j] + " is not happy number.");
                }
            }
        }
    }
}
