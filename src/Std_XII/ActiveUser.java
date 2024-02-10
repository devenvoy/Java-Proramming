package Std_XII;

public class ActiveUser {

    public static void main(String[]s)
    {
        boolean active=true;
        double balance=1000;

        check(active,balance);

    }

    // nested
    static void check(boolean aa ,double balance){

        if (aa == true) {

            if(balance>1000){
                System.out.println("userhave"+balance+" balance");
            }else {
                System.out.println("no money");
            }
        }else{
            System.out.println("no active");
        }

    }


}
