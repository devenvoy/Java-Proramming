package javabasic;

public class ReverseArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        System.out.println("Original array ");
        printArray(a);
        System.out.println("\nReversed array");
        printArray(reverseNewArray(a));
        System.out.println("\nReversed Array Inplace :");
        reverseArrayInplace(a);
        printArray(a);
    }

    public static void reverseArrayInplace(int[] a) {
        int i = 0;
        int j = a.length - 1;
        while (i < j) {
            int temp = a[i];
            a[i++] = a[j];
            a[j--] = temp;
        }
    }

    private static int[] reverseNewArray(int[] a) {
        int[] temp = new int[a.length];
        for (int j = 0, i = a.length - 1; i >= 0; i--) {
            temp[j++] = a[i];
        }
        return temp;
    }

    static void printArray(int[] a) {
        for (int j : a) {
            System.out.print(j + " ");
        }
    }

}
