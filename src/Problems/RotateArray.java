package Problems;

import static Problems.ReverseArray.printArray;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 3;
        int[] ans = rotateArr(arr, k);
//        printArray(ans);
        rotateArrInplace(arr, k);
        printArray(arr);

    }

    private static void rotateArrInplace(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - k);
        reverse(arr, 0, n - 1);

    }

    private static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    private static int[] rotateArr(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j = 0;
        for (int i = n - k; i < n; i++) {
            ans[j++] = arr[i];
        }

        for (int i = 0; i < n - k; i++) {
            ans[j++] = arr[i];
        }

        return ans;
    }
}
