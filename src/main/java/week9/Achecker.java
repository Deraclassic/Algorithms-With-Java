package week9;

public class Achecker {
    public static void main(String[] args) {
        System.out.println(Achecker("baabaaababa"));
    }

    public static boolean Achecker(String word){

        int num = 0;

        for (int i = 0; i < word.length(); i++){
            if(word.charAt(i) == 'a' ){
                num = i + 1;
                if(word.charAt(i) == word.charAt(num)){
                    return true;
                } else {
                    return false;
                }

            }
        }

        return false;
    }
}
