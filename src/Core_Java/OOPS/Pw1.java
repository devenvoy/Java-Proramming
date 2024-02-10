/*
Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign
the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.
*/
package Core_Java.OOPS;
class Triangle {
    int a, b, c;
    public Double getArea(){
        double s = (a+b+c)/2.0;
        return  Math.pow((s*(s-a)*(s-b)*(s-c)),.5);
    }
    public Double getPerimeter(){
        return (a+b+c)/2.0;
    }
}

public class Pw1 {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.a = 2;
        t.b = 5;
        t.c = 6;
        System.out.println("Area :"+t.getArea());
        System.out.println("Perimeter :"+t.getPerimeter());
    }
}
