package Std_XII;

public class U7_4 {
    public static void main(String[] args) {

        // declare variable
        double principal;
        double rate;
        double duration;
        double maturity;
        double interest;

        // computation

        principal = 17000;
        rate = 9.50;
        duration = 3;   // years
        interest = principal * duration * (rate/100);
        maturity = principal + interest;

        System.out.println("Principal amount: "+principal+"Rs.");
        System.out.println("Deposit for duaration of "+duration+" years");
        System.out.println("Interest rate: "+rate+"%");
        System.out.println("Interest amount: "+interest+" Rs.");
        System.out.println("Maturity amount: "+maturity+" Rs.");
    }
}
