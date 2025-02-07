package Core_Java;

import java.util.Scanner;

class Complex {
    int real;
    int imag;

    public Complex(int r, int i) {
        real = r;
        imag = i;
    }

    public static Complex Add(Complex a, Complex b) {
        return new Complex((a.real + b.real), (a.imag + b.imag));
    }

    public static Complex Diff(Complex a, Complex b) {
        return new Complex((a.real - b.real), (a.imag - b.imag));
    }

    public static Complex Product(Complex a, Complex b) {
        return new Complex((a.real * b.real) - (a.imag * b.imag), ((a.real * b.imag) + (a.imag * b.real)));
    }

    public void printcomplex() {
        if (real == 0 && imag != 0) {
            System.out.println(imag + "i");
        } else if (real != 0 && imag == 0) {
            System.out.println(real + "i");
        } else {
            System.out.println(real + "+" + imag + "i");
        }
    }
}

public class complex_algebra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter real part of complex number 1:");
        int real1 = sc.nextInt();
        System.out.println("Enter real part of complex number 1:");
        int comp1 = sc.nextInt();
        System.out.println("Enter real part of complex number 1:");
        int real2 = sc.nextInt();
        System.out.println("Enter real part of complex number 1:");
        int comp2 = sc.nextInt();
        sc.close();
        Complex c = new Complex(real1, comp1);
        Complex d = new Complex(real2, comp2);
        Complex e = Complex.Add(c, d);
        Complex f = Complex.Diff(c, d);
        Complex g = Complex.Product(c, d);
        e.printcomplex();
        f.printcomplex();
        g.printcomplex();
    }
}
