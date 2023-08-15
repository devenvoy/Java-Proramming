package Std_XII;

import java.util.*;

// Calendar class and its field constant
public class U9_22 {
    public static void main(String[] args) {

        System.out.println("Current Date & time " + new Date());
        Calendar calendar1 = new GregorianCalendar();
        display(calendar1);

    }

    private static void display(Calendar calendar) {
        System.out.println("\nYear:\t" + calendar.get(Calendar.YEAR));
        // Month start with zero so need to +1
        System.out.println("Month:\t" + (calendar.get(Calendar.MONTH)+1));
        System.out.println("Date:\t" + calendar.get(Calendar.DATE));
        System.out.print("Hour (12 Hour):\t" + calendar.get(Calendar.HOUR));

        // AM == 0 And PM == 1
        if (calendar.get(Calendar.AM_PM) == 1) {
            System.out.println("p.m.");
        } else {
            System.out.println("a.m.");
        }


        System.out.println("Hour (24 Hour):\t" + calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minute:\t" + calendar.get(Calendar.MINUTE));
        System.out.println("Second:\t" + calendar.get(Calendar.SECOND));
        System.out.print("Day of Week: ");
        switch (calendar.get(Calendar.DAY_OF_WEEK)) {
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");
            default -> System.out.println("Error!!..");
        }

    }
}
