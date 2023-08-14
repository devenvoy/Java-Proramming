package Std_XII;

// Introduction to Inheritance
// With Baseclass And Subclass
// use of Super
class Classroom extends Room{

    /* Here Classroom is Subclass
    *  And Room is Baseclass */

    int nBenches , nSeatsBench;
    Classroom(){};

    Classroom(float l , float w , float h , byte n, int nB , int nSB){
        // super keyword used to access member from Base class
        // calling Base class constructor
        super(l,w,h,n);
        nBenches = nB;
        nSeatsBench = nSB;
    }

    void show(){
        super.display();
        System.out.println("Benches: "+nBenches);
        System.out.println("Seats per Bench: "+nSeatsBench);
        System.out.println("Total Seats in class: "+getSeats());
    }

    int getSeats(){
        return  nBenches * nSeatsBench;
    }
}
public class U8_15 {
    public static void main(String[] args) {

        Classroom cr1 = new Classroom(30 ,20 ,12 , (byte) 3, 21 , 3);
        cr1.show();
        System.out.println("Area of ClassRoom 1 is :"+cr1.area()+" Sqft.\n\n");

        Classroom cr2 = new Classroom(30 ,30 ,10 , (byte) 4, 20 , 4);
        cr2.show();
        System.out.println("Area of ClassRoom 2 is :"+cr2.area()+" Sqft.");


    }
}
