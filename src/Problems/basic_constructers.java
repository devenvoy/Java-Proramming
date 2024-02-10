package Problems;

class algebra {

    // variable with the scope of this class
    // it can be used in any method or other purpose in this class only
    int a, b;

    // creating a parameterized v
    algebra(int x, int y) {
        System.out.println("Constructor of algebra class called ");
        a = x;
        b = y;
    }

    // these are methods which are using variable that has class scope
    // int is return type its next is method name to use for call method
    int add() {
        return a + b;
    }

    int sub() {
        return a - b;
    }

    int mul() {
        return a * b;
    }

    int div() {
        return a / b;
    }
}

public class basic_constructers {

    public static void main(String[] args) {
        // creating an object of algebra class
        // when creating an object constructor always calls
        // all class has its default constructor if it isn't defined
        algebra obj = new algebra(5, 7);

        System.out.println(obj.add());
        System.out.println(obj.sub());
        System.out.println(obj.mul());
        System.out.println(obj.div());

        algebra obj2 = new algebra(10, 7);
        System.out.println(obj2.add());
        System.out.println(obj2.sub());
        System.out.println(obj2.mul());
        System.out.println(obj2.div());

    }
}
