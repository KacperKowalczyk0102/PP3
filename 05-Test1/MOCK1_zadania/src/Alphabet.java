import java.lang.reflect.Array;
import java.util.Arrays;

public class Alphabet {
    public static boolean isAlphabet(String t){
        char[] charArray = t.toCharArray();
        int templetter = 0;
        for(char letter : charArray){
            if((int) letter>templetter){
                 templetter=letter;
            }else {
                return false;
            }
        }return true;
    }
}
