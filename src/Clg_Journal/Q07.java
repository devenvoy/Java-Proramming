package Clg_Journal;

public class Q07 {
    public static void main(String[] args) {
        String str = "SDJ International College";
        int len = str.length();
        System.out.println("Length of "+str+" : "+len);
        String str2 = str.replace('e','E');
        System.out.println("New String : "+str2);
        System.out.println("String in Uppercase : "+str.toUpperCase());
        System.out.println("String in Lowercase : "+str.toLowerCase());
        System.out.println("String in Capitalized : "+str.charAt(0));
        System.out.println("String in reverse : "+ new StringBuilder(str).reverse());
    }
}
