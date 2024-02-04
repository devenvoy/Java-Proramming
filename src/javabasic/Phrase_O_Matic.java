package javabasic;

public class Phrase_O_Matic {
    public static void main(String[] args) {

        String[] wordListOne = {"24/7", "multiTier", "30,000 foot", "B-to-B", "win-win", "frontend", "web-based", "pervasive", "smart", "six sigma", "critical-path", "dynamic" };

        String[] wordListTwo = {"empowered", "value-added", "oriented", "centric", "sticky", "distributed", "clustered", "targeted", "outside-the-box", "positioned", "focused", "leveraged", "shared", "cooperative", "aligned", "accelerated" };

        String[] wordListThree = {"process", "tipping-point", "solution", "architecture", "core cornpetency", "paradigrn", "mindshare", "vision", "space", "mission" };

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        // Math.random() = double number between 0 to 1;
        // so multiplying with oneLength it range will become between 0 to oneLength
        int rand1 = (int)(Math.random() * oneLength);
        int rand2 = (int)(Math.random() * twoLength);
        int rand3 = (int)(Math.random() * threeLength);

        String Phrase = wordListOne[rand1] +" "+ wordListTwo[rand2] +" "+ wordListThree[rand3];

        System.out.println("What we need is "+ Phrase);

    }
}
