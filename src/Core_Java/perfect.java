package Core_Java;

import java.util.Scanner;

// Check if inputted number is perfect or not

public class perfect {

    static int[] factor = new int[30];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        perfect_num(num);
    }
    public static void perfect_num(int num) {
        int j = 0, fact, fsum = 0;

        for (int i = 1; i <= num; i++) {
            fact = num / i;
            if (num % i == 0) {
                factor[j++] = fact;
                fsum += factor[j - 1];
            }
        }
        fsum -= num;
        isperfect(fsum, num);
    }
    public static void isperfect(int sum, int num) {
        if (sum == num) {
            System.out.println(num + " is Perfect Number.");
        } else if (sum > num) {
            System.out.println(num + " is Abundant Number.");
        } else {
            System.out.println(num + " is Deficient Number.");
        }
    }
}