package PW_Skills;

public class ArrayAssign extends AnswerSheet {

    public static void main(String[] args) {

        AnswerSheet sh1 = new ArrayAssign();
        sh1.display();
        Q6Answer();

    }

    //    Q1. Given an array of integers {2, 6, -5, -1, 0, 4, -9},
    //    print only the positive values present in the array.
    @Override
    void Q1Answer() {
        int[] arr = {2, 6, -5, -1, 0, 4, -9};

        for (int index : arr) {
            if (index > 0) {
                System.out.println(index);
            }
        }
        System.out.println();
    }

    /*
    Q2. Convert the list of Strings {“ab”, “bc”, “cd”, “de”, “ef”, “fg”, “gh”} into an array of strings and print all
    strings stored on odd indices of the array.
     */

    @Override
    void Q2Answer() {
        String[] arr = {"ab", "bc", "cd", "de", "ef", "fg", "gh"};

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(arr[i]);
        }
        System.out.println();
    }

    /*
    Q3. Traverse over the elements of the array {1,2,3,4,5,6,7,8} using for each loop and print all even
elements.
     */
    @Override
    void Q3Answer() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
        System.out.println();
    }

    /*
    Q4. Calculate the minimum element in the array {2, -3, 5, 8, 1, 0, -4} using standard library method
for calculating the minimum element.
     */
    @Override
    void Q4Answer() {

        int[] arr = {2, -3, 5, 8, 1, 0, -4};
        int min = 0;
        for (int i = 1; i < arr.length; i++) {
            min = Math.min(arr[i], arr[i - 1]);
        }
        System.out.println("Minimum value is " + min);
        System.out.println();

    }

    /*
    Q5. Find the first peak element in the array {1, 1, 3, 4, 2, 3, 5, 7, 0}
    Peak element is the one that is greater than its immediate left neighbor and its immediate right neighbor.
    Leftmost and rightmost element cannot be a peak element.
     */
    @Override
    void Q5Answer() {

        int[] arr = {1, 1, 3, 4, 2, 3, 5, 7, 0};

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                System.out.println(arr[i]);
                break;
            }
        }

        System.out.println();
    }

    // Q6. Search the given element x in the array, if present than return its index else return -1
    static void Q6Answer() {

        // linear search
        // first occurrence search
        int[] arr = {1, 4, 5, 8, 99, 2};

        int target = 8;
        int ans = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                ans = i;
                System.out.println("index of target " + target + " -> " + ans);
                break;
            }
        }
        if (ans == -1) {
            System.out.println("Not Found " + target + " -> " + ans);
        }

        System.out.println();
    }


}
