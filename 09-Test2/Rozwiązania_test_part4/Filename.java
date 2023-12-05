public class Filename{
    String nazwa;
    Filename(String nazwa){
        this.nazwa = nazwa;
    }

    public String m1(){
        int lastIndex = nazwa.lastIndexOf(".");
         if(lastIndex>0){
            return nazwa.substring(0,lastIndex);
         }else{
            return nazwa;
         }

    }
    public String m2(){
        int lastIndex = nazwa.lastIndexOf(".");
         if(lastIndex>0){
            return nazwa.substring(lastIndex);
         }else{
            return "";
         }
    }
}