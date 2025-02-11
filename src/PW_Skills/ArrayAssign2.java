package PW_Skills;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAssign2 extends AnswerSheet {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        AnswerSheet sh1 = new ArrayAssign2();
        sh1.display();

    }

    /*
     * Q1 - Given an unsorted array arr[] of size N having both negative and
     * positive integers, place
     * all negative elements at the end of array without changing the order of
     * positive elements
     * and negative elements.
     */
    @Override
    void Q1Answer() {
        // int N = sc.nextInt();
        // int[] arr = new int[N];
        int[] arr = { 1, -1, 3, 2, -7, -5, 11, 6 };
        int index = 0;
        int[] temp = new int[arr.length];
        // first store only positive values of arr
        for (int j : arr) {
            if (j >= 0) {
                temp[index++] = j;
            }
        }
        // then store negatives values of arr
        for (int j : arr) {
            if (j <= 0) {
                temp[index++] = j;
            }
        }
        printArr(temp);
        System.out.println();
    }

    /*
     * todo Array2 - Q2 pending
     * Q2 - Given two arrays a[] and b[] of size n and m respectively where m >= n.
     * The task is to find union between these two arrays and print the number of
     * elements of the union set.
     * Union of the two arrays can be defined as the set containing distinct
     * elements from both the arrays.
     * If there are repetitions, then only one occurrence of element should be
     * printed in the union.
     */
    
    @SuppressWarnings("unused")
    @Override
    void Q2Answer() {
        int m, n;
        n = sc.nextInt();
        m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        int[] ans = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int j = 0; j < m; j++) {
            b[j] = sc.nextInt();
        }
    }

    /*
     * Q3 - Given an array arr[] and an integer K where K is smaller than size of
     * array, the task is to
     * find the Kth smallest element in the given array. It is given that all array
     * elements are distinct.
     */
    @Override
    void Q3Answer() {
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        // first we need to sort the array [ small -> large ]
        Arrays.sort(arr);
        int K = sc.nextInt();
        // return Kth (smallest) element from start
        System.out.println(arr[K - 1]);
    }

    // todo Array2 - Q4 pending
    /*
     * Q4 - Given an unsorted array A of size N that contains only non-negative
     * integers,
     * find a continuous sub-array which adds to a given number S.
     * In case of multiple sub arrays, return the subarray which comes first on
     * moving from left to right.
     * You need to print the start and end index of answer subarray.
     */

    @Override
    void Q4Answer() {

    }

    /*
     * Q5 - Write a Java program to test the equality of two arrays.
     */
    @Override
    void Q5Answer() {
        
        int m, n;
        n = sc.nextInt();
        m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int j = 0; j < m; j++) {
            b[j] = sc.nextInt();
            if (a[j] != b[j]) {
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }

    static void printArr(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

}
