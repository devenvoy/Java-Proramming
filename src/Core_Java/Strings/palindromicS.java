package Core_Java.Strings;

import java.util.Scanner;

public class palindromicS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        int count = 0;

        for(int i =0 ;i< str.length();i++){
            for (int j = i+1;j<=str.length();j++){
                if(ispalindrome(str.substring(i, j))){
                    System.out.print(str.substring(i,j)+" ");
                    count++;
                }
            }
        }
        System.out.println("\nThe Number of palindromic string is "+ count);

    }

    public static boolean ispalindrome(String s){
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
