package LeetCode;

import java.util.HashMap;

public class RomanToInt {

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);

        int sum = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if ((i + 1) < n && hashMap.get(ch) < hashMap.get(s.charAt(i + 1))) {
                sum -= hashMap.get(ch);
            } else {
                sum += hashMap.get(ch);
            }
        }

        return sum;
    }
}
