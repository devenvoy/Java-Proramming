package Core_Java.Strings;

public class stringfunctions {
    @SuppressWarnings("unused")
    public static void main(String[] args) {

        // length of string
        String str = "hello";
        int len = str.length();
        System.out.println(len);
        String s1 = "Hello World";
        System.out.println(s1.length());

        // Char or CharAt // give char on that index given as parameter
        char ch = str.charAt(3); // storing only one char , no other option to store char or input char
        System.out.println(str.charAt(3)); // direct method to output char from string

        // index of // give index of that char given as parameter
        System.out.println(s1.indexOf('e'));

        // compareTo //
        String gtr = "zello";
        System.out.println(str.compareTo(gtr));
        System.out.println(gtr.compareTo(str));
        System.out.println(str.compareTo("hello"));

        // 1 s1 > s2 : + positive value
        // 2 s1 = s2 : 0 zero value
        // 3 s1 < s2 : - Negative value

        // contains()
        // its return boolean value if
        // substring is available in string it return true else false
        String s2 = "Physics Wallah";
        System.out.println(s2.contains("lla"));

        // startsWith()
        // substring is available in string(starting) it return true else false
        System.out.println(s2.startsWith("Phy"));

        // endsWith()
        // substring is available in string(end) it return true else false
        System.out.println(s2.endsWith("llah"));

        /*
         * toLowecase(); -> convert whole string to lower case
         * toUppercase(); -> convert whole string to upper case
         * concat(); -> return concatenated string == string1 + string2
         */
        System.out.println(s2.toLowerCase());
        System.out.println(s2.toUpperCase());
        System.out.println(str.concat(s2));

        // Substring(i,j)
        // return substring startng at index i , till index j
        String s4 = "Devansh";
        System.out.println(s4.substring(0, 2));
        System.out.println(s4.substring(1));

    }
}
