package Std_XII;

public class U7_11 {
    public static void main(String[] args) {

        int x = 10;

        blk1:    // label for this block // optional
        {
            int y = 50;
            System.out.println("Inside block 1: ");
            System.out.println("x: "+x);
            System.out.println("y: "+y);
        }

        blk2:
        {
            int y  = 20;
            x = 30;
            System.out.println("Inside block 2: ");
            System.out.println("x: "+x);
            System.out.println("y: "+y);
        }

        System.out.println("Outside the block x is "+x);
    }
}
