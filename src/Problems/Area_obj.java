package Problems;

import java.util.Scanner;

public class Area_obj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(":: Area of shape ::");
        System.out.println();
        System.out.println("1.Circle");
        System.out.println("2.Rectangle");
        System.out.println("3.Triangle");
        System.out.println("4.Exit");
        System.out.print("Enter your choice here:");
        int ch = sc.nextInt();
        if (ch == 1) {
            System.out.println("Enter radius : ");
            double r = sc.nextDouble();
            double area = 3.14 * r * r;
            System.out.println("Area : " + area);

        } else if (ch == 2) {
            System.out.println("Enter length : ");
            double l1 = sc.nextDouble();
            System.out.println("Enter breadth : ");
            double l2 = sc.nextDouble();
            double area = l1 * l2;
            System.out.println("Area : " + area);

        } else if (ch == 3) {
            System.out.println("Enter Base : ");
            double b = sc.nextDouble();
            System.out.println("Enter Height : ");
            double h = sc.nextDouble();
            double area = b * h / 2;
            System.out.println("Area : " + area);
        } else {
            System.out.println("Exiting . . .");
            System.out.println("Come Again ..");
        }
    }
}
