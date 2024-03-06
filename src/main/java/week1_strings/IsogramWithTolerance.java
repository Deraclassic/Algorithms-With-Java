package week1_strings;

import java.util.HashMap;
import java.util.HashSet;

public class IsogramWithTolerance {
    //    In this challenge, your task is to write a function to identify
//    heterograms with k-tolernance. The signature is isogramWithTolerance(s: string, k: int) -> bool.
//
//    A heterogram is a string that contains no duplicate alphabetical
//    characters (regardless of case). "Subdermatoglyphic" is a 17-letter heterogram,
//        "dog" is a 3-letter heterogram, but "floss" isn't a heterogram because of the repeated "s".
//
//    A k-tolerant heterogram is a heterogram that allows k letters (in any case)
//    to be duplicated. So "abc" is a heterogram in the traditional sense (i.e. k=0),
//    and "abcc" isn't.
//    However, if we allow k=1 tolerance, then "abcc" is a 1-tolerant heterogram because the extra "c" can be ignored.
//            However, "abccdd" isn't 1-tolerant (it's 2-tolerant, though).
//
//    Note that tolerance applies to letters, not characters.
//            Under this definition, "abcccc" is still 1-tolerant; even though there are more than 2 repetitions of "c".
//    Similarly, "aaaabbbbcde" is 2-tolerant but not 3-tolerant.
    public static boolean isogramWithTolerance(String s, int k) {
        s = s.toLowerCase();
        HashSet<String> tolerance = new HashSet<>();
        if ((s.isEmpty() || s.length() == 1) && (k >= 0)) {
            return true;
        }
        if (s.length() == 2 && s.charAt(0) != s.charAt(1)) {
            return true;
        }
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j) && s.charAt(i) != ' ') {
                    String newStr = String.valueOf(s.charAt(i));
                    tolerance.add(newStr);
                }
            }
        }
        if (tolerance.size() > k) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isogramWithTolerance("bookshop",1));
        // test your cases here

    }
}
