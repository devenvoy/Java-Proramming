package OldPaperAns;

public class MyString {

   private final String str;

    MyString(String s) {
        this.str = s;
    }

    public String reversed() {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public String toToggleCase() {
        try {
            return str.charAt(0) + "".toLowerCase() + str.substring(1).toUpperCase();
        } catch (NullPointerException e) {
            System.out.println("String Can't be Null");
        }
        return "";
    }

    public String toSentenceCase() {

        try {
            return (str.charAt(0) + "").toUpperCase() + str.substring(1).toLowerCase();
        } catch (NullPointerException e) {
            System.out.println("String Can't be null");
        }
        return "";
    }

    public String extractFromLast(int n) throws Exception {
        if (str.length() - n < 0) {
            throw new Exception("Invalid index");
        }
        return str.substring(str.length() - n);
    }

}