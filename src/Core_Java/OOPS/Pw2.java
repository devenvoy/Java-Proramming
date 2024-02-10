/*
*Write a program to print the area of a rectangle by creating a class named 'Area' taking the values
of its length and breadth as parameters of its constructor and having a method named 'returnArea'
which returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.
*/
package Core_Java.OOPS;

import java.util.Scanner;

class Area {
    int length;
    int breadth;

    public Area(int l, int b) {
        length = l;
        breadth = b;
    }

    public int getArea() {
        return length * breadth;
    }
}

public class Pw2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l, b;
        System.out.print("Enter length:");
        l = sc.nextInt();
        System.out.print("Enter Breadth:");
        b = sc.nextInt();
        Area a = new Area(l, b);
        System.out.println("Area :" + a.getArea());
    }
}
