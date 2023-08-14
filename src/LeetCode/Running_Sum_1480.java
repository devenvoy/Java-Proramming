package LeetCode;

import java.util.Arrays;
import java.util.Scanner;

public class Running_Sum_1480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // number of element input
        System.out.print("How many number you want to add:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        // take all element input
        System.out.println("Enter each elements one by one:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        // you can print array using this method
        // otherwise it will print garbage value
        System.out.println(Arrays.toString(runningSum(nums)));
    }

    public static int[] runningSum(int[] nums) {
        // it will start from 1 index, so it can add 0 index value in it.
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}
