package week3_Algo;
////Candidate Instructions
////        Write a function that takes in a string and returns its longest substring
////        without duplicate characters.
////
////        You can assume that there will only be one longest substring without duplication.
////
////        Sample Input
////        string = "clementisacap"
////
////        Sample Output
////        "mentisac"
////        As you can see from the input above, the longest string we can take from the word
////        that does not contain any duplicate characters is mentisac
////
////
//
////Test cases
////import org.junit.Test;
////import static org.junit.Assert.*;
////
////public class ProgramTests {
////    @Test
////    public void TestCase1() {
////        assertEquals("mentisac", Program.longestSubstringWithoutDuplication("clementisacap"));
////    }
////
////    @Test
////    public void TestCase2() {
////        assertEquals("a", Program.longestSubstringWithoutDuplication("a"));
////    }
////
////    @Test
////    public void TestCase3() {
////        assertEquals("abc", Program.longestSubstringWithoutDuplication("abc"));
////    }
////
////    @Test
////    public void TestCase4() {
////        assertEquals("abc", Program.longestSubstringWithoutDuplication("abcb"));
////    }
////
////    @Test
////    public void TestCase5() {
////        assertEquals("abcdef", Program.longestSubstringWithoutDuplication("abcdeabcdefc"));
////    }
////
////    @Test
////    public void TestCase6() {
////        assertEquals("cdea", Program.longestSubstringWithoutDuplication("abccdeaabbcddef"));
////    }
////
////    @Test
////    public void TestCase7() {
////        assertEquals("bac", Program.longestSubstringWithoutDuplication("abacacacaaabacaaaeaaafa"));
////    }
////
////    @Test
////    public void TestCase8() {
////        assertEquals("dabcef", Program.longestSubstringWithoutDuplication("abcdabcef"));
////    }
////
////    @Test
////    public void TestCase9() {
////        assertEquals("cbde", Program.longestSubstringWithoutDuplication("abcbde"));
////    }
////
////    @Test
////    public void TestCase10() {
////        assertEquals("vsindecago", Program.longestSubstringWithoutDuplication("decadevsindecagonarelit"));
////    }
////}

public class LongestUniqueCharactersInAString {
    public static void main(String[] args) {
        // test your cases here
        System.out.println(longestSubstringWithoutDuplication("clementisacap"));
    }
    //TODO later

    public static String longestSubstringWithoutDuplication(String str) {
        // Do your magic here
        //TODO later
        String newStr = null;
        for(int i = 0; i<str.length(); i++){
            for(int j = i+1; j<str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    return "";
                } else {
                    newStr += str.charAt(i);
                }
            }
        }
        return newStr;
    }
}
