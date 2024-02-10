package Problems;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        System.out.println("1-D Array example:");
        Array1();
        System.out.println();
        System.out.println("2-D Array example");
        Array2();
    }

     public static void Array1()  {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[5];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + i + 1 + " element:");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.print("\t" + arr[i]);
        }
    }

    public static void Array2(){
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print("Enter element in matrix:");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.println("Matrix A =>");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(" "+matrix[i][j]);
            }
            System.out.println();
        }

    }
}
