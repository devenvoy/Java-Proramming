package LeetCode;


/**
 * User Given a string and an index, return string length 2 starting at the given index.
 * If the index is too big or too small to define string length 2, use the first two chars.
 * The string length will be at least 2.
 * <p>
 * twoChar("java", 0) → "ja" <p>
 ** twoChar("java", 2) → "va" <p>
 ** twoChar("java", 3) → "ja"</p>
 *
 */
public class TwoChar {

    public static String twoChar(String str, int index) {
        // Check if the index is within the valid range
        if (index >= 0 && index + 1 < str.length()) {
            return str.substring(index, index + 2);
        } else {
            // If the index is too big or too small, use the first 2 chars
            return str.substring(0, 2);
        }
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(twoChar("java", 0));  // Output: "ja"
        System.out.println(twoChar("java", 2));  // Output: "va"
        System.out.println(twoChar("java", 3));  // Output: "ja"
    }
}
