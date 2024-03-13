package week6;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;

public class OceanViewBuilding {
    //In this problem, we are given an array heights that represents the heights of buildings in a line, with the
    // ocean situated to the right of the last building. The goal is to find out which buildings have an unobstructed
    // view of the ocean. A building has an ocean view if all buildings to its right are shorter than it. We need to
    // return a list of the indices of the buildings that can see the ocean. The list of indices should be sorted in
    // increasing order and needs to be 0-indexed, which means the first building in the line has an index of 0.

      public int[] findBuildings(int[] heights) {
        ArrayList<Integer> newArr = new ArrayList<>();
        int tallestBuilding = 0;
        for (int i = heights.length-1; i>=0; i--){
          if (heights[i] > tallestBuilding){
            newArr.add(i);
            tallestBuilding = heights[i];
          }
        }
        Collections.reverse(newArr);
        int[] viewArr = new int [newArr.size()];
        for (int i = 0; i <newArr.size(); i++){
          viewArr[i] = newArr.get(i);
        }
        return viewArr;
    }
}
