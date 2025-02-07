package Core_Java.Strings;

import java.util.Scanner;

public class numberSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 15;
        System.out.printf("%x",number);
        System.out.printf("\n%o",number);
        System.out.println();

        System.out.println("binary to decimal :");
        System.out.print("Enter number:");
        int bin_num = sc.nextInt();
        System.out.println("Ans:"+Binarytodecimal(bin_num));

        System.out.println("Decimal to binary :");
        System.out.print("Enter number:");
        int dec_num = sc.nextInt();
        System.out.println("Ans:" + Decimaltobinary(dec_num));
        sc.close();
    }
    public static int Binarytodecimal(int n){
        int ans = 0;
        int paw = 1; // power of 2

        while(n > 0){
            int rem = n % 10;
            ans += (rem * paw);
            n /= 10;
            paw *= 2;
        }
        return ans;
    }

    public static int Decimaltobinary(int n){
        int ans = 0;
        int pew = 1; // power of 10
        while (n > 0){
            int parity = n % 2;
            ans += (parity*pew);
            pew *= 10;
            n /= 2;
        }
        return ans;
    }
}
