package week6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OceanView {
    public static void main(String[] args) {
        int[] buildings = {3,5,4,4,3,1,3,2};
        String direction = "EAST";
        String direction2 = "WEST";
        ArrayList<Integer> result = findBuildings(buildings, direction);
        ArrayList<Integer> result2 = findBuildings(buildings, direction2);
        System.out.println(result);
        System.out.println(result2);
    }
    public static ArrayList<Integer> findBuildings(int[] heightsOfBuildings, String direction){
        //write your code here;
//        ArrayList<Integer> result = new ArrayList<>();
//        if(direction.equals("EAST")){
//            int maxSeen = 0;
//            for(int i = heightsOfBuildings.length -1; i >= 0; i--){
//                if(heightsOfBuildings[i] > maxSeen){
//                    result.add(i);
//                    maxSeen = heightsOfBuildings[i];
//                }
//            }
//        } else if (direction.equals("WEST")) {
//            int maxSeen = 0;
//            for (int i = 0; i< heightsOfBuildings.length; i++){
//                if (heightsOfBuildings[i] > maxSeen){
//                    result.add(i);
//                    maxSeen = heightsOfBuildings[i];
//                }
//            }
//        }
//        Collections.sort(result);
//        return result;

//        ArrayList<Integer> newArr = new ArrayList<>();
//        int tallestBuilding = 0;
//        if(direction.equalsIgnoreCase("West")){
//            for(int i = 0; i < heightsOfBuildings.length; i++){
//                if (heightsOfBuildings[i] > tallestBuilding){
//                    newArr.add(i);
//                    tallestBuilding = heightsOfBuildings[i];
//                }
//            }
//        } else if (direction.equalsIgnoreCase("East")) {
//            for (int i = heightsOfBuildings.length-1; i >= 0; i--){
//                if (heightsOfBuildings[i] > tallestBuilding){
//                    newArr.addFirst(i);
//                    tallestBuilding = heightsOfBuildings[i];
//                }
//            }
//
//        }
//        return newArr;
        ArrayList<Integer> newArr = new ArrayList<>();
        int tallestBuilding = 0;
        if(direction.equalsIgnoreCase("West")){
            for (int i = 0; i < heightsOfBuildings.length; i++){
                if (heightsOfBuildings[i] > tallestBuilding){
                    newArr.add(i);
                    tallestBuilding = heightsOfBuildings[i];
                }
            }
        } else if (direction.equalsIgnoreCase("East")) {
            for (int i = heightsOfBuildings.length-1; i >=0; i --){
                if (heightsOfBuildings[i] > tallestBuilding){
                    newArr.addFirst(i);
                    tallestBuilding = heightsOfBuildings[i];
                }
            }
        }
        return newArr;
    }
}
