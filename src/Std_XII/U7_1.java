package Std_XII;

public class U7_1 {

    public static void main(String[] args) {
        /*
                Declare variables
         */
        double balance;
        double rate;
        double duration;
        double cost;


        // computation
        balance = 170;
        rate = 1.02;
        duration = 37;
        cost = duration * rate;   // compute the cost
        balance = balance - cost; // update balance amount


        // Display results
        System.out.print("Call Duration: "+duration);
        System.out.println(" Seconds");
        System.out.println("Balance: "+balance + "Rs");

    }// end of main
}// end of class

