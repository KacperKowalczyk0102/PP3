import java.util.Arrays;

public class Filename {
    String filename;
    char[] array;


    Filename(String filename){
        this.filename = filename;

    }


    public String m1(){
        int lastDotIndex = filename.lastIndexOf(".");
        if(lastDotIndex>=0){
            return filename.substring(0,lastDotIndex);
        }else{
            return filename;
        }

    }
    public String m2(){
        int lastDotIndex = filename.lastIndexOf(".");
        if(lastDotIndex>=0){
            return filename.substring(lastDotIndex);
        }else{
            return "";
        }
    }
}
