package Problems;

import java.util.Scanner;

public class has_nextint_eg {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int sum = 0;
        while (scn.hasNextInt()) { // check if input exists or not
            int num = scn.nextInt();
            if (num >= 0) { // if input is positive or zero add it to the current sum
                sum += num;
            } else {
                sum = -1;// input is negative so change sum to -1 and break out of the loop
                break;
            }
        }
        scn.close();
        System.out.print(sum);
    }

}
