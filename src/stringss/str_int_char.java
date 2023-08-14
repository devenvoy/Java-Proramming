package stringss;

import java.util.Scanner;

public class str_int_char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "abc";
        str = str + "def";  // str += "def"
        str += 'R';
        str += 10;
        System.out.println(str);
        System.out.println("abc"+10+20); // abc1020
        System.out.println(10+20+"abc");  //30abc
    }
}
