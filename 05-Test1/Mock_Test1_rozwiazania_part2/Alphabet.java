public class Alphabet {
    public static boolean isAlphabet(String t){
     int lastIndex = t.lastIndexOf(0);
     char[] arr = t.toCharArray();
     for(char znak: arr){
        if((int)znak>lastIndex){
           lastIndex=znak;  
          }else{
            return false;
          }  
        }return true;
    
     }
    public static void main(String[] args) {
        System.out.println(Alphabet.isAlphabet("abxgsw"));
        System.out.println(Alphabet.isAlphabet("abcd"));
        

    }
    }
