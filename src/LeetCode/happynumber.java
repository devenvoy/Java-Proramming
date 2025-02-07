package LeetCode;

import java.util.Scanner;

public class happynumber {
    public static void main(String[] args) {
        happynumber obj = new happynumber();
        Scanner sc = new Scanner(System.in);

        // get number input
        System.out.println("Enter number :");
        int n = sc.nextInt();
        sc.close();
        if (obj.isHappyNumber(n)) {
            System.out.println(n + " is Happy Number.");
        } else {
            System.out.println(n + " is not Happy Number.");
        }
    }

    boolean isHappyNumber(int n) {
        happynumber obj = new happynumber();
        int temp = n;
        if (temp == 7)
            return true;
        while (temp > 9) {
            temp = obj.sumSqDigit(temp);
        }
        return temp == 1;
    }

    int sumSqDigit(int n) {
        int sum = 0;
        while (n != 0) {
            sum += (n % 10);
            n /= 10;
        }
        return sum;
    }
}
