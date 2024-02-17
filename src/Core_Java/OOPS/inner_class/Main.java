package Core_Java.OOPS.inner_class;

/*
Inner Class-
A Class inside another class.
useful if a class should be limited in scope
usually private, but not necessary
helps group classes that belongs together
extremely useful for listeners for specific events
precursor for anonymous inner classes
 */
public class Main {
    public static void main(String[] args) {
        Outside out = new Outside();
        Outside.Inside ins = out.new Inside();
        System.out.println(out.x + ins.y);
        ins.greeting();
    }
}
