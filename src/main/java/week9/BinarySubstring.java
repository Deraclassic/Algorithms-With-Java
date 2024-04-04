package week9;

public class BinarySubstring {
    //Task
//        Given a string, s, we define a substring, s', of s to be a string that occurs in s
//        (i.e., a string matching some contiguous block of characters in s).
//        Complete the count_binary_substrings function. It has one parameter: a string, s, consisting of only 0s and 1s. The function
//        must return an integer denoting the total number of substrings of s satisfying both of the following two conditions:
//        The 0s and 1s are grouped consecutively (e.g., 01, 10,0011, 1100, 000111, etc.).
//        The number of 0s in the substring is equal to the number of 1s in the substring
//        Specification
//        Challenge.countBinarySubstrings(s)
//        Parameters
//        s: String - a string consisting of only 0s and 1s.
//
//        Return Value
//        Integer - denoting the total number of substrings of s satisfying the conditions.
//
//        Constraints
//        5 ≤ s.length ≤ 5 × 100
//        String s consists of 0s and 1s only
//        Examples
//        s	Return Value
//        Example 1	"00110"	3
//        Example 2	"10101"	4
//        Example 3	"10001"	2
//        Explanation for example 1 ("00110")
//        There are three substrings having equal numbers of consecutively grouped 0s and 1s:
//
//        "0011", which is a substring of the characters from s0 to s3 (inclusive).
//        "01", which is a substring of the characters from s1 to s2 (inclusive).
//        "10", which is a substring of the characters from s3 to s4 (inclusive).
//        Thus, we return 3 as our answer.
//
//        Explanation for example 2 ("10101")
//        There are four substrings having equal numbers of consecutively grouped 0s and 1s:
//
//        "10", which is a substring of the characters from s0 to s1 (inclusive).
//        "01", which is a substring of the characters from s1 to s2 (inclusive).
//        "10", which is a substring of the characters from s2 to s3 (inclusive).
//        "01", which is a substring of the characters from s3 to s4 (inclusive).
//        Thus, we return 4 as our answer.
//
//        Explanation for example 3 ("10001")
//        There are two substrings having equal numbers of consecutively grouped 0s and 1s:
//
//        "10", which is a substring of the characters from s0 to s1 (inclusive).
//        "01", which is a substring of the characters from s3 to s4 (inclusive).
//        Thus, we return 2 as our answer.
//
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Nested;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//@DisplayName("countBinarySubstrings")
//public class CountBinarySubstringsTest {
//    @Nested
//    @DisplayName("sample tests")
//    class SampleTests {
//
//        @Test
//        @DisplayName("returns correct counts for smaller strings")
//        public void returnsCorrectCountsForSmallerStrings() {
//            assertEquals(3, Challenge.countBinarySubstrings("00110"));
//            assertEquals(4, Challenge.countBinarySubstrings("10101"));
//            assertEquals(2, Challenge.countBinarySubstrings("10001"));
//            assertEquals(6, Challenge.countBinarySubstrings("00110011"));
//        }
//    }
//}

    public static void main(String[] args) {
        // Test the method with example inputs
        System.out.println(countBinarySubstrings("00110")); // Should print 3
        System.out.println(countBinarySubstrings("10101")); // Should print 4
        System.out.println(countBinarySubstrings("10001")); // Should print 2
        System.out.println(countBinarySubstrings("00110011")); // Should print 6
    }

    public static int countBinarySubstrings(String s) {
        int previousLength = 0, currentLength = 1, count = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                currentLength++;
            } else {
                previousLength = currentLength;
                currentLength = 1;
            }
            if (previousLength >= currentLength) {
                count++;
            }
        }
        return count;
    }
}
