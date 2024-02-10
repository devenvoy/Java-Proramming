package PW_Skills;

import java.util.Scanner;

public class Assignment3 extends AnswerSheet {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        AnswerSheet sh1 = new Assignment3();
        sh1.display();

    }

    //    Q1 - Write a program to add 8 to the number x and then divide it by 3. Now, the modulus of the quotient
    //    is taken with 5 and then multiply the resultant value by 5. Display the final result.
    @Override
    void Q1Answer() {
        int x = sc.nextInt();
        x += 8;
        x /= 3;
        x %= 5;
        x *= 5;
        System.out.println(x);
    }

    //    Q2 - Swap two numbers without the use of third variable.
    @Override
    void Q2Answer() {
        int x = 5;
        int y = 10;
        System.out.println("x Value before swap " + x);
        System.out.println("y Value before swap " + y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("x Value before swap " + x);
        System.out.println("y Value before swap " + y);
    }

    //    Q3 - Write a program to calculate the sum of the digits of a 3-digit number.
    @Override
    void Q3Answer() {
        int num = sc.nextInt();
        int sum = 0;
        while (num != 0) {
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }
        System.out.println("Sum = " + sum);
    }

    //    Q4 - Assign values of variables 'a' and 'b' as 55 and 70 respectively and then check if:
    //    i) both the conditions 'a < 50' and 'a < b' are true.
    //    ii) at least one of the conditions 'a < 50' or 'a < b' is true.
    @Override
    void Q4Answer() {
        int a = 50;
        int b = 70;
        System.out.println(a > 50 && a < b);
        System.out.println(a > 50 || a < b);
    }

    //    Q5 - Find the total number of bits needed to be flipped to convert x to y.
    @Override
    public void Q5Answer() {

    }
}
