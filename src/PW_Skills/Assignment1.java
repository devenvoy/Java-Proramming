package PW_Skills;

public class Assignment1 {

    public static void main(String[] args) {

        System.out.println("Answer 1 ==>");
        Q1Answer();
        System.out.println("\nAnswer 2 ==>");
        Q2Answer();
        System.out.println("\nAnswer 3 ==>");
        Q3Answer();
        System.out.println("\nAnswer 4 ==>");
        Q4Answer();
        System.out.println("\nAnswer 5 ==>");
        Q5Answer();
    }

    //    Q1 - Take 2 integer values in two variables x and y and print their product.
    static void Q1Answer() {
        int x = 2;
        int y = 4;
        System.out.println("Product of " + x + " and " + y + " = " + x * y);
    }

    // Q2 - Print the ASCII value of character ‘U.’
    static void Q2Answer() {
        int x = 'U';
        System.out.println("Ascii value of U = " + x);
    }

    //    Q3 - Write a Java program to take the length and breadth of a rectangle and print its area.
    static void Q3Answer() {
        int length = 6;
        int breadth = 5;
        System.out.println("Length of Rectangle " + length);
        System.out.println("Breadth of Rectangle " + breadth);
        int area = length * breadth;
        System.out.println("Area of Rectangle " + area);
    }

    //    Q4 - Write a Java program to calculate the cube of a number.
    static void Q4Answer() {
        int num = 3;
        int cube = num * num * num;
        System.out.println("Cube of " + num + " = " + cube);
    }

    //    Q5 - Write a Java program to swap two numbers with the help of a third variable.
    static void Q5Answer() {
        int x = 5;
        int y = 10;
        System.out.println("Value of x before swap " + x);
        System.out.println("Value of y before swap " + y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println("Value of x After swap " + x);
        System.out.println("Value of y After swap " + y);
    }
}
