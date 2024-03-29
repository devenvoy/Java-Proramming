package Std_XII;

// Concept: Polymorphism
// in class Function Overloading

class PrintLine {

    static void printline() {
        for (int i = 0; i < 40; i++) {
            System.out.print('=');
        }
        System.out.println();
    }

    static void printline(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print('#');
        }
        System.out.println();
    }

    static void printline(char ch ,int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(ch);
        }
        System.out.println();
    }

}

public class U8_6 {
    public static void main(String[] args) {
        PrintLine.printline();
        PrintLine.printline(30);
        PrintLine.printline('+',20);
    }
}
