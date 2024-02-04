package LeetCode;

import java.util.Stack;

public class Valid_Parantheses {


    public static void main(String[] args) {
        System.out.println(isValid("))"));
    }

    public static boolean isValid(String s) {

        String opening = "({[";

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (opening.indexOf(ch) != -1) {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) return false;
                char temp = stack.pop();
                if (getVal(ch) != temp) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static char getVal(char ch) {
        return switch (ch) {
            case ')' -> '(';
            case ']' -> '[';
            case '}' -> '{';
            default -> ' ';
        };
    }
}

