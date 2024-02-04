package javabasic;

import static javabasic.ReverseArray.*;

public class Sort_0_1 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 1, 0, 1};
        int[] ans = sortZeroAndOne(arr);
        printArray(ans);
        System.out.println();
        sortZeroAndOneInplace(arr);
        printArray(arr);

        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println();
        sortOddAndEven(arr2);
        printArray(arr2);

        int[] arr3 = {-10, -5, -4, 1, 2, 9};
        System.out.println();
        int[] ans2 = sortAbsSquare(arr3);
        printArray(ans2);
    }

    private static int[] sortAbsSquare(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        int[] ans = new int[n];
        int k = 0;
        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k++] = arr[left] * arr[left];
                left++;
            } else {
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }
        reverseArrayInplace(ans);
        return ans;
    }

    private static void sortOddAndEven(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if ((arr[left] % 2) == 1 && (arr[right] % 2) == 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }

            if (arr[left] % 2 == 0) {
                left++;
            }
            if (arr[right] % 2 == 1) {
                right--;
            }
        }
    }

    private static void sortZeroAndOneInplace(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (arr[i] == 1 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }

            if (arr[i] == 0) {
                i++;
            }

            if (arr[j] == 1) {
                j--;
            }

        }
    }

    private static int[] sortZeroAndOne(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int count = 0;
        for (int j : arr) {
            if (j == 0) {
                count++;
            }
        }

        for (int i = 0; i < n; i++) {
            if (i < count) {
                ans[i] = 0;
            } else {
                ans[i] = 1;
            }
        }

        return ans;
    }

}
