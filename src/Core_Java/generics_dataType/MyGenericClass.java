package Core_Java.generics_dataType;

// <T>  /  <Thing> - so now this class is generic data type
public class MyGenericClass<T> {
    T x;

    MyGenericClass(T x) {
        this.x = x;
    }

    public T getValue() {
        return x;
    }

}
