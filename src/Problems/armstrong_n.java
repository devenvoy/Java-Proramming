package Problems;

import java.util.Scanner;

public class armstrong_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        n = sc.nextInt();
        int num = 1;
        while (num <= n) {// runs loop from 1 to n times
            int count = 0;
            int i = num;
            while (i > 0) { // counting digits of each number
                count++;
                i /= 10;
            }
            int val = num; // store value of current num in a temporary variable to calculate sum
            // of its digits
            int sum = 0;
            while (val > 0) { // break the number digit by digit untill it reach 0
                int digit = val % 10;
                sum += Math.pow(digit, count); // add cube of digit to the sum
                val /= 10;
                if (sum > val) { // if sum has exceeded our current number, there is no way for it
                    // to be an Armstrong number
                    continue;
                }
            }
            if (sum == num) { // this is an armstrong number
                System.out.println(num);
            }
            num++;
        }
    }
}
