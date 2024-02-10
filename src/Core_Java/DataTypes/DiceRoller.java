package Core_Java.DataTypes;

import java.util.Random;

public class DiceRoller {

    // Global Scope / Class Scope
    Random random = new Random();
    int number = 0;
    DiceRoller() {
        // Local Scope
        int num2 = 10;
        roll();
    }

    void roll() {
        // local Scope - can't use outside roll method
        int temp = 0;
        number = random.nextInt(6) + 1;
        System.out.println(number);
    }
}
