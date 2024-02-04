package javabasic;

import java.util.Scanner;

public class ArrayManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        distinctElementFromArray(arr);
    }

    private static void distinctElementFromArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = arr[j] = -1;
                }
            }
        }

        for (int j : arr) {
            if (j > 0) {
                System.out.println(j);
            }
        }
    }
}
