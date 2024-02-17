package Core_Java.generics_dataType;

public class Main {
    public static void main(String[] args) {
        // generics - enable types(classes and interfaces) to be parameters when defining: classes , interface and methods a benefits is to eliminate the need to create multiple versions of methods or classes for various data type.
        // use 1 version for all references data type

        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] dblArray = {5.5, 4.4, 6.6, 9.9, 3.3};
        Character[] charArray = {'a', 'b', 'c', 'd', 'e'};
        String[] stringArray = {"AB", "CD", "HG"};

        display(intArray);
        display(dblArray);
        display(charArray);
        display(stringArray);

        System.out.println(getFirst(intArray));
        System.out.println(getFirst(dblArray));
        System.out.println(getFirst(charArray));
        System.out.println(getFirst(stringArray));

        // Generic class objects
        MyGenericClass<Integer> myInt = new MyGenericClass<>(1);
        MyGenericClass<Double> myDouble = new MyGenericClass<>(55.87);
        MyGenericClass<Character> myChar = new MyGenericClass<>('@');
        MyGenericClass<String> myString = new MyGenericClass<>("Dev");

        System.out.println();
        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue());

    }

    // generic return type method
    private static <Thing> Thing getFirst(Thing[] array) {
        return array[0];
    }

    // generic method for accept all datatype
    // <T>
    private static <T> void display(T[] array) {
        for (T arr : array) {
            System.out.print(arr + " ");
        }
        System.out.println();
    }
}
