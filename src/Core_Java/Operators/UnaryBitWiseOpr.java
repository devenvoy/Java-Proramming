package Core_Java.Operators;

public class UnaryBitWiseOpr {
    public static void main(String[] args) {
        int number = -10;
        System.out.print("The Decimal Number is ");
        System.out.println(number);

        System.out.print("The Integer to binary of number is: ");
        System.out.println(Integer.toBinaryString(number));

        int invertedNumber = ~number;
        System.out.print("The Inverted Number is: ");
        System.out.println(invertedNumber);

        System.out.print("Binary of Inverted number is: ");
        System.out.println(Integer.toBinaryString(invertedNumber));

        System.out.println("\nBit Wise shift operator ");
        System.out.println("---------------------------");
        int number1 = -8, number2 = 2, result;

        result = number1 >> number2;
        System.out.print("Right Shift bitwise operator: ");
        System.out.println(result);

        result = number1 >>> number2;
        System.out.print("Right shift zero fill bitwise operator: ");
        System.out.println(result);

        result = number1 << number2;
        System.out.print("Left shift bitwise operator: ");
        System.out.println(result);

    }
}
