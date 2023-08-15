package Std_XII;

import java.util.Date;

// Using Date Class
public class U9_21 {
    public static void main(String[] args) {

        // store current date, time when initialized
        Date date1 = new Date();
        Date date2 = new Date();
        System.out.println("date1: Date & Time: "+date1);
        System.out.println("date2: Date & Time: "+date2);

        System.out.println("Elapsed time since jan 1 , 1970 is "
                            + date1.getTime() + " milliseconds");

        date1.setTime(date1.getTime() + 10000000);
        System.out.println("Date Time after 1 crore milliseconds \t"+date1.toString());

    }
}
