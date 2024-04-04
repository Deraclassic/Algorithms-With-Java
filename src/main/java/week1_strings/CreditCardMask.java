package week1_strings;

//Usually when you buy something, you're asked whether your credit card number, phone number or answer to your most secret question is still correct. However, since someone could look over your shoulder, you don't want that shown on your screen. Instead, we mask it.
//
//Your task is to write a function maskify, which changes all but the last four characters into '#'.
//
//Examples (input --> output):
//        "4556364607935616" --> "############5616"
//        "64607935616" -->      "#######5616"
//        "1" -->                "1"
//        "" -->                 ""
//
//// "What was the name of your first pet?"
//        "Skippy" --> "##ippy"
//        "Nananananananananananananananana Batman!" --> "#################

public class CreditCardMask {
    public static String maskify(String str) {
        if(str.length()<= 4){
            return str;
        }
        StringBuilder hide = new StringBuilder(str);
        for(int i = 0; i < str.length()-4; i++){
            hide.setCharAt(i,'*');
        }
        return hide.toString();
    }
    public static void main(String[] args) {
        System.out.println(maskify("th2n57h8jn4"));
    }

}


