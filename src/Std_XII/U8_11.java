package Std_XII;


// TODO Use of visibility modifier in java
// todo -> default
// todo -> public
// todo -> protected
// todo -> private

class Rectangle {

    private double length, width;

    Rectangle() {};  // user defined default constructor
    Rectangle(double x, double y) {
        length = x;
        width = y;
    }

    double area(){ return  length * width; }

    void display(){
        System.out.println("Rectangle with length = "+length+" width = "+width);
    }

    // this class variables are private, so we can't access outside the class,
    // so We need to use method like this to get length, width values
    double getLength(){ return length;}
    double getWidth(){ return width;}

    // Like get, we also need to set value
    // so to that we need to make a set methods for length, width
    void setLength(double l){ length = l;}
    void setWidth(double w){ width = w; }

}

public class U8_11 {
    public static void main(String[] args) {

        Rectangle rect1;
        rect1 = new Rectangle();

        Rectangle rect2 = new Rectangle(10 , 15);

        rect1.display();
        rect2.display();

        System.out.println("Area of rectangle with length = "+rect2.getLength() +
                            ", Width = "+ rect2.getWidth() +
                            " is "+ rect2.area());
    }
}
