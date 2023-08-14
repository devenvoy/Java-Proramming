package Std_XII;

/**
 * Constructor Introduction
 * Room is extended because it already defined before in U8_1
 * in this we created another that has Constructor
 * to initialize an object when created
 */
class Room_construct extends Room {
    static int totWindows;

    // we can define multiple constructor like polymorphism
    Room_construct(float l, float w , float h , byte n){
        length = l;
        width = w;
        height = h;
        nWindows = n;
        totWindows+=n;
    }
    // length, width, height, nWindows are defined in Room
    Room_construct(float l, float w) {
        length = l;
        width = w;
        height = 10;
        nWindows = 1;
        totWindows++;
    }
}

public class U8_7 {
    public static void main(String[] args) {
        Room_construct r1 = new Room_construct(16 , 12.5F);
        Room_construct r2 = new Room_construct(20 , 14,12,(byte) 2);

        r1.display();
        r2.display();
        System.out.println("Total number of windows: "+ Room_construct.totWindows);
    }
}
