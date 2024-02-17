package Clg_Journal;

public class Q01 {
    public static void main(String[] args) {
        int sum = 0;
        int l = args.length;
        for (String arg : args) {
            sum += Integer.parseInt(arg);
        }
        System.out.println("Sum Of All nums : " + sum);
    }
}
// 2 33 4 5 7 0 9 8