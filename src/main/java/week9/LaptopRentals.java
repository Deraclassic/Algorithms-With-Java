package week9;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class LaptopRentals {
    //You're given a list of time intervals during which students at a school need a laptop.
//        These time intervals are represented by pairs of integers [start, end], where 0 <= start < end.
//        However, start and end don't represent real times; therefore, they may be greater than 24.
//
//        No two students can use a laptop at the same time, but immediately after a student is done using a laptop,
//        another student can use that same laptop. For example, if one student rents a laptop during the time interval [0, 2], another student can rent the same laptop during any time interval starting with 2.
//
//        Write a function that returns the minimum number of laptops that the school needs
//        to rent such that all students will always have access to a laptop when they need one.
//
//        Challenge.laptopRentals(times)
//        Parameters
//        times: List<Integer[]> - A 2D array containing the times the student would require a laptop.
//
//        Return Value
//        Integer - Minimum number of laptops the school needs to rent.
//
//        Examples
//        times	Return Value
//        [[0,2],[1,4],[4,6],[0,4],[7,8],[9,11],[3,10]]	3
//        [[0,4],[2,3],[2,3],[2,3]]	4
//        [[1,5],[5,6],[6,7],[7,9]]	1
//
//import org.junit.Test;
//import static org.junit.Assert.*;
//import java.util.List;
//import java.util.Arrays;
//public class LaptopRentalsTests {
//    @Test
//    public void example1() {
//        Integer expected0 = 3;
//        Integer actual0 = Challenge.laptopRentals(Arrays.asList(Arrays.asList(0,2),Arrays.asList(1,4),Arrays.asList(4,6),Arrays.asList(0,4),Arrays.asList(7,8),Arrays.asList(9,11),Arrays.asList(3,10)));
//        assertEquals(expected0, actual0);
//    }
//    @Test
//    public void example2() {
//        Integer expected0 = 4;
//        Integer actual0 = Challenge.laptopRentals(Arrays.asList(Arrays.asList(0,4),Arrays.asList(2,3),Arrays.asList(2,3),Arrays.asList(2,3)));
//        assertEquals(expected0, actual0);
//    }
//    @Test
//    public void example3() {
//        Integer expected0 = 1;
//        Integer actual0 = Challenge.laptopRentals(Arrays.asList(Arrays.asList(1,5),Arrays.asList(5,6),Arrays.asList(6,7),Arrays.asList(7,9)));
//        assertEquals(expected0, actual0);
//    }
//    @Test
//    public void example4() {
//        Integer expected0 = 1;
//        Integer actual0 = Challenge.laptopRentals(Arrays.asList(Arrays.asList(0,4)));
//        assertEquals(expected0, actual0);
//    }
//    @Test
//    public void example5() {
//        Integer expected0 = 0;
//        Integer actual0 = Challenge.laptopRentals(Arrays.asList(Arrays.asList()));
//        assertEquals(expected0, actual0);
//    }
//}

    public static void main(String[] args) {
        // Test the method with example inputs
        System.out.println(laptopRentals(Arrays.asList(Arrays.asList(0,2), Arrays.asList(1,4), Arrays.asList(4,6), Arrays.asList(0,4), Arrays.asList(7,8), Arrays.asList(9,11), Arrays.asList(3,10)))); // Should print 3
        System.out.println(laptopRentals(Arrays.asList(Arrays.asList(0,4), Arrays.asList(2,3), Arrays.asList(2,3), Arrays.asList(2,3)))); // Should print 4
        System.out.println(laptopRentals(Arrays.asList(Arrays.asList(1,5), Arrays.asList(5,6), Arrays.asList(6,7), Arrays.asList(7,9)))); // Should print 1
        System.out.println(laptopRentals(Arrays.asList(Arrays.asList(0,4)))); // Should print 1
        System.out.println(laptopRentals(Arrays.asList())); // Should print 0
    }


    public static Integer laptopRentals(List<List<Integer>> times) {
        if (times.isEmpty()) return 0;
        times.sort(Comparator.comparingInt(a -> a.get(0)));
        PriorityQueue<Integer> endTimes = new PriorityQueue<>();

        for (List<Integer> time : times) {
            if (!endTimes.isEmpty() && time.get(0) >= endTimes.peek()) {
                endTimes.poll();
            }
            endTimes.add(time.get(1));
        }
        return endTimes.size();
    }

}
