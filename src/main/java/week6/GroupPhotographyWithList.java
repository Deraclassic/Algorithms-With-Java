package week6;

import java.util.Collections;
import java.util.List;

public class GroupPhotographyWithList {
    //Challege
    //It's photo day at the local school, and you're the photographer assigned to take class photos. The class that you'll be photographing has an even number of students, and all these students are wearing red or blue shirts. In fact, exactly half of the class is wearing red shirts, and the other half is wearing blue shirts. You're responsible for arranging the students in two rows before taking the photo. Each row should contain the same number of the students and should adhere to the following guidelines:
    //
    //        All students wearing red shirts must be in the same row.
    //        All students wearing blue shirts must be in the same row.
    //        Each student in the back row must be strictly taller than the student directly in front of them in the front row.
    //        You're given two input arrays: one containing the heights of all the students with red shirts and another one containing the heights of all the students with blue shirts. These arrays will always have the same length, and each height will be a positive integer.
    //
    //        Write a function that returns whether or not a class photo that follows the stated guidelines can be taken.
    //
    //        Note: you can assume that each class has at least 2 students.
    //
    //        Sample Input
    //        redShirtHeights = [5, 8, 1, 3, 4]
    //        blueShirtHeights = [6, 9, 2, 4, 5]
    //        Sample Output
    //        true // Place all students with blue shirts in the back row.
    //
    //
    //
    //        Test cases
    //        import org.junit.Test;
    //        import static org.junit.Assert.*;
    //        import java.util.List;
    //        import java.util.Arrays;
    //public class ClassPhotosTests {
    //    @Test
    //    public void test1() {
    //        boolean expected0 = true;
    //        boolean actual0 = Challenge.classPhotos(Arrays.asList(6,9,2,4,5),Arrays.asList(5,8,1,3,4));
    //        assertEquals(expected0, actual0);
    //    }
    //    @Test
    //    public void test2() {
    //        boolean expected0 = true;
    //        boolean actual0 = Challenge.classPhotos(Arrays.asList(5,8,1,3,4),Arrays.asList(6,9,2,4,5));
    //        assertEquals(expected0, actual0);
    //    }
    //    @Test
    //    public void test3() {
    //        boolean expected0 = false;
    //        boolean actual0 = Challenge.classPhotos(Arrays.asList(5,8,1,3,4,9),Arrays.asList(6,9,2,4,5,1));
    //        assertEquals(expected0, actual0);
    //    }
    //    @Test
    //    public void test4() {
    //        boolean expected0 = false;
    //        boolean actual0 = Challenge.classPhotos(Arrays.asList(6),Arrays.asList(6));
    //        assertEquals(expected0, actual0);
    //    }
    //    @Test
    //    public void test5() {
    //        boolean expected0 = true;
    //        boolean actual0 = Challenge.classPhotos(Arrays.asList(125),Arrays.asList(126));
    //        assertEquals(expected0, actual0);
    //    }
    //}
    //
    //
    //
    //public class ClassPhoto {
    public static void main(String[] args) {

        List<Integer> redShirtHeights1 = List.of(5, 8, 1, 3, 4);
        List<Integer> blueShirtHeights1 = List.of(6, 9, 2, 4, 5);

        List<Integer> redShirtHeights2 = List.of(5, 8, 1, 3, 4, 9);
        List<Integer> blueShirtHeights2 = List.of(6, 9, 2, 4, 5, 1);

        List<Integer> redShirtHeights3 = List.of(6);
        List<Integer> blueShirtHeights3 = List.of(6);

        List<Integer> redShirtHeights4 = List.of(125);
        List<Integer> blueShirtHeights4 = List.of(126);

        // Running the tests
        System.out.println("Test 1: " + classPhotos(redShirtHeights1, blueShirtHeights1)); // Expected: true
        System.out.println("Test 2: " + classPhotos(redShirtHeights2, blueShirtHeights2)); // Expected: false
        System.out.println("Test 3: " + classPhotos(redShirtHeights3, blueShirtHeights3)); // Expected: false
        System.out.println("Test 4: " + classPhotos(redShirtHeights4, blueShirtHeights4)); // Expected: true
    }

    public static boolean classPhotos(List<Integer> redShirtHeights, List<Integer> blueShirtHeights) {

        Collections.sort(redShirtHeights);
        Collections.sort(blueShirtHeights);

        boolean redTaller = redShirtHeights.get(redShirtHeights.size() - 1) > blueShirtHeights.get(blueShirtHeights.size() - 1);

        List<Integer> backRow = redTaller ? redShirtHeights : blueShirtHeights;
        List<Integer> frontRow = redTaller ? blueShirtHeights : redShirtHeights;

        for (int i = 0; i < backRow.size(); i++) {
            if (backRow.get(i) <= frontRow.get(i)) {
                return false;
            }
        }
        return true;
    }
}