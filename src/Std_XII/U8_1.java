package Std_XII;

class Room {

    float length, width, height;
    byte nWindows;

    Room(){};

    Room(float l, float w, float h, byte n){
        length = l;
        width = w;
        height = h;
        nWindows = n;
    }

    void setAttr(float l, float w, float h, byte n) {
        length = l;
        width = w;
        height = h;
        nWindows = n;
    }

    double area(){
        return length * width;
    }

    void display(){
        System.out.println("Length: "+length);
        System.out.println("Width : "+width);
        System.out.println("Heigth: "+height);
        System.out.println("Numbers of Windows: "+nWindows);
        System.out.println();
    }
}

public class U8_1 {
    public static void main(String[] args) {

        // first method to create an object
        Room r1;
        r1 = new Room();
        // second method to create an object
        Room r2 = new Room();

        // display the two room objects with initial default values
        r1.display();
        r2.display();

        // Assign values of attributes of objects
        r1.setAttr(18, 12.5F,10,(byte) 2);
        r2.setAttr(14, 11,10,(byte) 1);

        //Display updated content
        r1.display();
        r2.display();

        // Display area
        System.out.println("\nArea of room with length "+r1.length+" Width "+r1.width+" is "+r1.area());
        System.out.println("\nArea of room with length "+r2.length+" Width "+r2.width+" is "+r2.area());
    }
}
