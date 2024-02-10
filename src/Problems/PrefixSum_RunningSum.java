package Problems;

import java.util.Scanner;

public class PrefixSum_RunningSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*
Given an array of integers of size n. Answer q queries where you need to print the sum
of values in a given range of indices from I to r (both included).
Note:The values ofl and r in queries follow I-based indexing.
 */

        System.out.println("Enter size of Array");
        int n = sc.nextInt();
        System.out.println("Enter Elements: ");
        int[] arr = new int[n+1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        // Prefix sum array
        int[] ans = RunnigSum(arr);

        System.out.println("Enter number of queries: ");
        int q = sc.nextInt();

        while (q-- > 0) {
            System.out.println("Enter Range ");
            int l = sc.nextInt();
            int r = sc.nextInt();
            System.out.println("Sum :" + (ans[r] - ans[l - 1]));
        }

/*
Check if we can partition the array into two arrays with an equal sum.
More formally, check that the prefix sum of a part of the array is equal to the suffix
sum of the rest of the array.
*/

    }

    private static int[] RunnigSum(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            arr[i] += arr[i - 1];
        }
        return arr;
    }


}
