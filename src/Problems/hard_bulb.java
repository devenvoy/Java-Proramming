package Problems;/*
You are given n number of bulbs. They are all switched off. A weird fluctuation in voltage hits the circuit n times.
In the 1st fluctuation all bulbs are toggled,
in the 2nd fluctuation every 2nd bulb is toggled,
in the 3rd fluctuation every 3rd bulb is toggled and so on.
You've to find which bulbs will be switched on after n fluctuations.
Take as input a number n, representing the number of bulbs.
Print all the bulbs that will be on after the nth fluctuation in voltage.
 * 
 */

import java.util.*;

public class hard_bulb {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 1; i * i <= n; i++) {
            System.out.print(i * i + " ");
            // only those bulbs will remain on which are perfect
            // squares as perfect squares have odd number of divisors due to their square
            // root being the extra one, whereas rest have even number of divisors
        }
    }
}

/*
 * Imagine you have a row of light bulbs, all initially switched off. There are
 * a total of n bulbs.
 * 
 * Now, a series of fluctuations in voltage occurs n times. During each
 * fluctuation, something interesting happens to the bulbs:
 * 
 * In the first fluctuation, all the bulbs are toggled (if a bulb was off, it is
 * turned on, and if it was on, it is turned off).
 * In the second fluctuation, every second bulb is toggled.
 * In the third fluctuation, every third bulb is toggled.
 * This pattern continues until the nth fluctuation, where every nth bulb is
 * toggled.
 * After these n fluctuations, you need to determine which bulbs will be
 * switched on.
 * 
 * To do this, we can approach the problem by considering the concept of perfect
 * squares.
 * 
 * For example, let's take n = 10:
 * 
 * In the first fluctuation, all bulbs are toggled: [1, 2, 3, 4, 5, 6, 7, 8, 9,
 * 10] -> [ON, ON, ON, ON, ON, ON, ON, ON, ON, ON]
 * In the second fluctuation, every second bulb is toggled: [ON, OFF, ON, OFF,
 * ON, OFF, ON, OFF, ON, OFF]
 * In the third fluctuation, every third bulb is toggled: [ON, OFF, OFF, OFF,
 * ON, ON, ON, OFF, OFF, OFF]
 * In the fourth fluctuation, every fourth bulb is toggled: [ON, OFF, OFF, ON,
 * ON, ON, ON, ON, OFF, OFF]
 * In the fifth fluctuation, every fifth bulb is toggled: [ON, OFF, OFF, ON,
 * OFF, ON, ON, ON, OFF, ON]
 * In the sixth fluctuation, every sixth bulb is toggled: [ON, OFF, OFF, ON,
 * OFF, OFF, ON, ON, OFF, ON]
 * In the seventh fluctuation, every seventh bulb is toggled: [ON, OFF, OFF, ON,
 * OFF, OFF, OFF, ON, OFF, ON]
 * In the eighth fluctuation, every eighth bulb is toggled: [ON, OFF, OFF, ON,
 * OFF, OFF, OFF, OFF, OFF, ON]
 * In the ninth fluctuation, every ninth bulb is toggled: [ON, OFF, OFF, ON,
 * OFF, OFF, OFF, OFF, ON, ON]
 * In the tenth fluctuation, every tenth bulb is toggled: [ON, OFF, OFF, ON,
 * OFF, OFF, OFF, OFF, ON, OFF]
 * After the tenth fluctuation, the bulbs that are switched on are 1, 4, and 9.
 * Notice that these numbers are perfect squares.
 * 
 * Therefore, the solution is that after the nth fluctuation, the bulbs that
 * will be
 * switched on are exactly the perfect square numbers up to n.
 */