package OldPaperAns;

public class MyStringDemo {
    public static void main(String[] args) {

        MyString str = new MyString("devansh amdavadwala");

        System.out.println(str.reversed());
        System.out.println(str.toToggleCase());
        System.out.println(str.toSentenceCase());
        try {
            System.out.println(str.extractFromLast(10));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
