package Std_XII;

// String Objects
public class U9_16 {
    public static void main(String[] args) {
        String str1 = "I Like Java";
        String str2 = "I Like Java";
        String str3 = new String("I Love India");
        String str4 = new String(str3);

        System.out.println("str1 == str2: "+(str1 == str2));
        System.out.println("str3 == str4: "+(str3 == str4));

        System.out.println("str1: "+str1);
        System.out.println("str2: "+str2);
        System.out.println("str3: "+str3);
        System.out.println("str4: "+str4);

        str1 = "india is great";
        str2 = "INDIA is great";
        System.out.println();
        System.out.println("str1: "+str1);
        System.out.println("str2: "+str2);

        // using String class methods to compare strings
        System.out.println("str1.equals(str2): "+(str1.equals(str2)));
        System.out.println("str1.equalsIgnoreCase(str2): "+(str1.equalsIgnoreCase(str2)));
        System.out.println("str1.compareTo(str2): "+(str1.compareTo(str2)));
        System.out.println("str1.compareToIgnoreCase(str2): "+(str1.compareToIgnoreCase(str2)));

    }
}
