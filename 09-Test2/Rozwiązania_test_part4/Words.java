import java.util.*;

public class Words{
    String[] words;
    Words(String[] words){
        this.words = words;
    }
    public boolean m(){
        HashSet<String> słowa = new HashSet<String>();
        for(String word: words){
            słowa.add(word);
        }
        return słowa.size()>words.length; 
    }
}