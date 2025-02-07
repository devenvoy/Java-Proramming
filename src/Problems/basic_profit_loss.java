package Problems;

import java.util.Scanner;

public class basic_profit_loss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float sp, cp, loss, profit;
        System.out.print("Enter the Cost Price : ");
        cp = sc.nextFloat();
        System.out.print("Enter the Selling Price : ");
        sp = sc.nextFloat();

        sc.close();
        if (sp < cp) {
            loss = cp - sp;
            System.out.print("The loss is : " + loss);
        } else if (cp < sp) {
            profit = sp - cp;
            System.out.print("The profit is : " + profit);
        } else {
            System.out.print("No Profit No Loss");
        }
    }

}
