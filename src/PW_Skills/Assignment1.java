package PW_Skills;

public class Assignment1  extends AnswerSheet{

    public static void main(String[] args) {

        AnswerSheet sh1 = new Assignment1();
        sh1.display();

    }

    //    Q1 - Take 2 integer values in two variables x and y and print their product.
    @Override
    void Q1Answer() {
        int x = 2;
        int y = 4;
        System.out.println("Product of " + x + " and " + y + " = " + x * y);
    }

    // Q2 - Print the ASCII value of character ‘U.’
    @Override
    void Q2Answer() {
        int x = 'U';
        System.out.println("Ascii value of U = " + x);
    }

    //    Q3 - Write a Java program to take the length and breadth of a rectangle and print its area.
    @Override
     void Q3Answer() {
        int length = 6;
        int breadth = 5;
        System.out.println("Length of Rectangle " + length);
        System.out.println("Breadth of Rectangle " + breadth);
        int area = length * breadth;
        System.out.println("Area of Rectangle " + area);
    }

    //    Q4 - Write a Java program to calculate the cube of a number.
    @Override
    void Q4Answer() {
        int num = 3;
        int cube = num * num * num;
        System.out.println("Cube of " + num + " = " + cube);
    }

    //    Q5 - Write a Java program to swap two numbers with the help of a third variable.
    @Override
    void Q5Answer() {
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
