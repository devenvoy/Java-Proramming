package javabasic;

import java.util.Scanner;

public class Target_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array Size");
        int N = sc.nextInt();

        System.out.println("Enter " + N + " Elements");
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Target sum");
        int target = sc.nextInt();


        // print the pairs that sum == target
//        pairsOfTwo(arr, target);

        //  print the triplets that sum == target
        pairsOfThree(arr, target);
    }

    private static void pairsOfThree(int[] arr, int target) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        ans++;
                        System.out.println("{ " + arr[i] + " , " + arr[j] + " , " + arr[k] + " }");
                    }
                }
            }
        }
        System.out.println(ans + " Triplets");
    }

    private static void pairsOfTwo(int[] arr, int target) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    ans++;
                    System.out.println("{ " + arr[i] + " , " + arr[j] + " }");
                }
            }
        }
        System.out.println(ans + " Pairs");
    }
}
