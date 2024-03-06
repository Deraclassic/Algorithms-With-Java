package hash_map_examples;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {
        //write a Java program to associate the specifies value with the specified key in a HashMap
        HashMap<Integer, Character> alphabets = new HashMap<>();
        HashMap<Integer, Character> alpha = new HashMap<>();
        //HashMap<Integer, Character> cloning = new HashMap<>();


        alphabets.put(1, 'a');
        alphabets.put(2, 'b');
        alphabets.put(3, 'c');
        alphabets.put(4, 'd');
        alphabets.put(5, 'e');

        alpha.putAll(alphabets);
        //cloning = (HashMap)alphabets.clone();
        //System.out.println(cloning);

        //alphabets.put(4, 'z');
        //System.out.println(alphabets);

        //alpha.clear();

        //System.out.println(alphabets.isEmpty());
        //System.out.println(alpha);
        //System.out.println(cloning);

//        for(Map.Entry <Integer, Character> letter : alphabets.entrySet()){
//            System.out.println(letter.getValue());
//            System.out.println(letter.getKey());
//            System.out.println(alphabets.get(2));
//            System.out.println("key: " + letter.getKey() + "value: " + letter.getValue());
//            System.out.println(alphabets.size());
        //}

       // System.out.println(alphabets.containsKey(2));
       // System.out.println(alphabets.containsValue('c'));

//        HashSet<Character> charas = new HashSet<>();
//        Set charas = (Set) alphabets.values();
        Set set = alphabets.keySet();
        Set set2 = alphabets.entrySet();
        System.out.println(set);
        System.out.println(set2);
        System.out.println(alphabets.values());
    }
}
