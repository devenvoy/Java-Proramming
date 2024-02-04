package LeetCode;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] str = {"dog", "racecar", "car"};
        System.out.println(longestCommonPrefix(str));
    }

    public static String longestCommonPrefix(String[] strs) {
        String res = strs[0];
        for (String str : strs) {
            res = common(res, str);
        }
        return res;
    }

    private static String common(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        int n = Math.min(s1.length(), s2.length());
        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                sb.append(s1.charAt(i));
            } else {
                break;
            }
        }
        return sb.toString();
    }
}
