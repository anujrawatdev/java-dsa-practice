package Hasing;
import java.util.HashSet;

public class FirstLetterToAppear {
    public static void main(String[] args) {
        String str = "abccbaacz";

        HashSet<Character> box= new HashSet<>();
        char result = ' ';

        for(int i =0 ; i< str.length(); i++){
            if(box.contains(str.charAt(i))){
               result = str.charAt(i);
            }
            box.add(str.charAt(i));
        }
        System.out.println(result);
    }

}
