public class Alphabet {
    public static boolean isAlphabet(String t){
        char[] charArray = t.toCharArray();
        int tempLetter=0;
        for(char letter: charArray){
            if((int)letter>tempLetter){
                tempLetter=letter;
            }else {
                return false;
            }
        }
        return true;
    }
}
