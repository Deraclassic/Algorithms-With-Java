package week2;

import java.util.ArrayList;
import java.util.List;

public class SplitInteger {
    //Task
    //        In this challenge, you will write a function to divide an integer into a number of even parts,
    //        which will be returned in a result array. Summing the integers in this result array will
    //        produce the original number.
    //        For example, given number = 10 and parts = 2, splitInteger(10, 2)
    //        should return an array of integers with length equal to parts: [5, 5].
    //        Not all numbers will offer a clean division. In this case,
    //        we should split the number as closely as possible to even,
    //        with the smaller numbers in the front of the array. For example,
    //        splitInteger(11, 3) → [3, 4, 4]
    //        There is no reason to test for edge cases; the input to your
    //        function will always be valid for this challenge. Please see the below specification
    //        for the exact constraints on the input:
    //        Challenge.splitInteger(num, parts)
    //        Divides an integer into an even number of parts.
    //        Parameters
    //        num: Integer - The integer number that should be split into equal parts
    //        parts: Integer - The number of parts that the integer should be split into
    //        Return Value
    //        List<Integer> - An array of part values which sum to num.
    //        The parts will be ordered from smallest to largest.
    //        Constraints
    //        0 < num ≤ 100
    //        0 < parts ≤ num
    //        Examples
    //        num parts   Return Value
    //        Completely even parts   10  5   [2,2,2,2,2]
    //        Divided as closely as possible into even parts with the smallest parts grouped at the front of the result
    //TEST CASE
    //import java.util.ArrayList;
    //import java.util.Arrays;
    //import org.junit.jupiter.api.DisplayName;
    //import org.junit.jupiter.api.Nested;
    //import org.junit.jupiter.api.Test;
    //import static org.junit.jupiter.api.Assertions.assertEquals;
    //@DisplayName("splitInteger")
    //public class SplitIntegerTest {
    //    @Nested
    //    @DisplayName("sample tests")
    //    class SampleTests {
    //        @Test
    //        @DisplayName("basic cases")
    //        public void basicCases() {
    //            assertEquals(new ArrayList<Integer>(Arrays.asList(10)), Challenge.splitInteger(10, 1));
    //            assertEquals(new ArrayList<Integer>(Arrays.asList(1, 1)), Challenge.splitInteger(2, 2));
    //            assertEquals(new ArrayList<Integer>(Arrays.asList(4, 4, 4, 4, 4)), Challenge.splitInteger(20, 5));
    //        }
    //    }
    //}
    //   public static List<Integer> splitInteger(int num, int parts) {
    //     // do your magic here
    //     // don't forget to retun a List
    //    }



    public static List<Integer> splitInteger(int num, int parts) {
        List<Integer> result = new ArrayList<>();

        int baseValue = num / parts;
        int remainder = num % parts;

        for (int i = 0; i < parts; i++) {
            if (i < remainder) {
                result.add(baseValue + 1);
            } else {
                result.add(baseValue);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(splitInteger(12,2));
    }

}
