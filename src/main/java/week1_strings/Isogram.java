package week1_strings;

import java.util.HashSet;
import java.util.Set;

public class Isogram {
//    An isogram is a word that has no repeating letters, consecutive or non-consecutive. Implement a function that determines whether a string that contains only letters is an isogram. Assume the empty string is an isogram. Ignore letter case.
//
//    Example: (Input --> Output)
//
//            "Dermatoglyphics" --> true "aba" --> false "moOse" --> false (ignore letter case)
//
//    isIsogram "Dermatoglyphics" = true
//    isIsogram "moose" = false
//    isIsogram "aba" = false

//    public static boolean  isIsogram(String str) {
//        str = str.toLowerCase();
//        if(str.isEmpty()){
//            return true;
//        }
//        for(int i = 0; i<str.length(); i++){
//            for(int j = i+1; j<str.length(); j++){
//                if(str.charAt(i)==str.charAt(j)) return false;
//            }
//        }
//     return true;
//    }


    public static boolean isIsogram(String str) {
        str = str.toLowerCase();
        Set<Character> chars = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            boolean added = chars.add(c);

            if (!added) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Is 'Dermatoglyphics' an isogram? " + isIsogram("Dermatoglyphics")); // Expected: true
        System.out.println("Is 'moose' an isogram? " + isIsogram("moose")); // Expected: false
        System.out.println("Is 'aba' an isogram? " + isIsogram("aba")); // Expected: false
    }
}


//    public static void main(String[] args) {
//        System.out.println(isIsogram("joom"));
//    }


