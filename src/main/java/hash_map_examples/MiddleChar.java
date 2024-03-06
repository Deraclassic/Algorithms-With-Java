package hash_map_examples;

public class MiddleChar {
    public static String getMiddle(String word) {
        //Code goes here!
        int num = 0;
        int num2 = 0;
        String mid = "";
        if (word.length() == 1){
            return word;
        }
        if (word.length() % 2 != 0){
            num = word.length()/2;
            mid =String.valueOf(word.charAt(num));
            return mid;
        } else {
            num = word.length()/2 -1;
            num2 = word.length()/2;
            mid = String.valueOf(word.charAt(num)) + String.valueOf(word.charAt(num2));
        }
        return mid;
    }

    public static void main(String[] args) {
        System.out.println(getMiddle("test"));
    }
}
