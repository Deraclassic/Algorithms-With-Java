package week1_strings;

public class Xs_and_Os {
//    Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case insensitive. The string can contain any char.
//
//    Examples input/output:
//
//    XO("ooxx") => true
//    XO("xooxx") => false
//    XO("ooxXm") => true
//    XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
//    XO("zzoo") => false
     public static boolean getXO (String str) {

         int countX = 0;
         int countO = 0;
         str = str.toLowerCase();
         for(int i = 0; i < str.length(); i++){
             if(str.charAt(i) == 'x' || str.charAt(i)== 'X'){
                 countX++;
             }
             if(str.charAt(i)== 'o' || str.charAt(i) =='O'){
                 countO++;
             }
         }
         if(countO == countX){
             return true;
         }
         return false;
     }

    public static void main(String[] args) {
        System.out.println(getXO("ooXxoxgo"));
    }
}