package Clg_Journal;

public class Q04 {
    public static void main(String[] args) {

        Q04 obj = new Q04();
        obj.area(12);
        obj.area(10, 20);
        obj.area(4.7F);

    }

    public void area(int side) {
        System.out.println("Area of Square " + (side * side));
    }

    public void area(float radius) {
        System.out.println("Area of Circle  " + (Math.PI * radius * radius));
    }

    public void area(int length, int width) {
        System.out.println("Area of Rectangle " + (length * width));
    }

}
