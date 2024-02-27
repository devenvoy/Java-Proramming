package Clg_Journal;

public class Q13 {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt(args[0]);
            if (num < 0) {
                throw new NegativeNumberException("Negative Number");
            }
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
            System.out.println("Number can't be less than zero");
        }
    }
}

class NegativeNumberException extends Exception {

    public NegativeNumberException(String e) {
        super(e);
    }
}
