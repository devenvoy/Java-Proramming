package Std_XII;

// Passing Object of the same class as a Parameter
class Rectangle2 extends Rectangle{

    Rectangle2() {};  // user defined default constructor
    Rectangle2(double x, double y) {
        setLength(x);
        setWidth(y);
    }

    boolean isLarge(Rectangle rect){
        return area() > rect.area();
    }
}
public class U8_12 {
    public static void main(String[] args) {
        Rectangle2 rect1 = new Rectangle2(8,20);
        Rectangle2 rect2 = new Rectangle2(10,15);

        rect1.display();
        System.out.println("Area of Rectangle 1 is "+ rect1.area());
        rect2.display();
        System.out.println("Area of Rectangle 2 is "+ rect2.area());

        if (rect1.isLarge(rect2)){
            System.out.println("\nArea of Rectangle 1 is Larger than Area of Rectangle 2");
        }


    }
}
