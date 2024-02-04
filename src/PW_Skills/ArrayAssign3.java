package PW_Skills;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAssign3 {
    public static void main(String[] args) {
        q3();
    }

    /*
    Q1 - Given an array sorted in increasing order of size n and an integer x,
    find if there exists a pair in the array whose absolute difference is exactly x.(n>1)
     */
    static void q1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int N = sc.nextInt();
        int[] arr = new int[N];

        System.out.println("Enter " + N + " Elements");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target X");
        int X = sc.nextInt();

        Arrays.sort(arr);
        int ans = 0;
        for (int i = N - 1; i >= 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[i] - arr[j] == X) {
                    ans++;
//                    System.out.println(arr[j] + " " + arr[i]);
                }
            }
        }
        System.out.print("Answer ::  ");
        if (ans > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }


    /*
    Q2 - Given an array of size n, find the total number of occurrences of given number x.
     */
    private static void q2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int N = sc.nextInt();
        int[] arr = new int[N];

        System.out.println("Enter " + N + " Elements");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target X");
        int X = sc.nextInt();

        int count = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] == X) {
                count++;
            }
        }

        System.out.println("Total occurrences of " + X + " in the array: " + count);
    }

    /*
    Q3 - Given an array arr[] of size N-1 with integers in the range of [1, N], the task is to find the
    missing number from the first N integers. There are no duplicates in the list.
     */
    private static void q3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array:");
        int N = sc.nextInt();
        int[] arr = new int[N - 1];

        System.out.println("Enter " + (N - 1) + " Elements");
        for (int i = 0; i < N - 1; i++) {
            arr[i] = sc.nextInt();
        }

        int missingNumber = findMissingNumber(N, arr);
        System.out.println("Missing number: " + missingNumber);
    }

    private static int findMissingNumber(int N, int[] arr) {
        
        // array be like start from 1 and its last element will be size of array
        //so if N = 10 then arr = {1,2,3,4,5,6,7,8,9,10}
        // but in  given array one element is missing we want to find that

        int totalSum = N * (N + 1) / 2;
        // 10 * (10+1) / 2
        // 10 * 11 / 2
        // 110 / 2   ==     55
        // 1+2+3+4+5+6+7+8+9+10 == 55

        int sum = 0;
        // now sum given array
        for (int i = 0; i < N - 1; i++) {
            sum += arr[i];
        }

        // subtract given array sum from original totalSum
        return totalSum - sum;
    }


}
