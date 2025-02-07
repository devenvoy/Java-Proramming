package LeetCode;

import java.util.Arrays;
import java.util.Scanner;

public class sort_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[3][3];
        int[][] transpose_mat = new int[3][3];
        int[][] sort_mat = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
                transpose_mat[j][i] = matrix[i][j];
            }
        }
        sc.close();
        // Sort matrix row wise
        for (int i = 0; i < 3; i++) {
            Arrays.sort(transpose_mat[i]);
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sort_mat[i][j] = transpose_mat[j][i];
            }
        }

        // sort matrix column wise
        for (int j = 0; j < 3; j++) {
            Arrays.sort(sort_mat[j]);
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + sort_mat[i][j]);
            }
            System.out.println();
        }
    }

}
