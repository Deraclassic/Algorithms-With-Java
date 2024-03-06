package week3_Algo;

import java.util.HashMap;
//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
//
//
//
//Example 1:
//
//Input: nums = [1,2,3,1]
//Output: true
//Example 2:
//
//Input: nums = [1,2,3,4]
//Output: false
//Example 3:
//
//Input: nums = [1,1,1,3,3,4,3,2,4,2]
//Output: true

class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        //Using HashSet
//        HashSet<Integer> number = new HashSet<>();
//        for(int i = 0; i<nums.length; i++){
//            number.add(nums[i]);
//        }
//        if(nums.length == number.size()){
//            return false;
//        } else {
//            return true;
//        }
//    }

        //Using HashMap

        HashMap<Integer, Integer> numbers = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numbers.containsKey(nums[i])) {
                return true;
            } else {
                numbers.put(nums[i], i);
            }
        }
        return false;
    }
}
