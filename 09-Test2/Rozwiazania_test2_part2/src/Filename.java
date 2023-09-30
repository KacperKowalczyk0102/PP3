
public class Filename {
    private String fileName;
    Filename(String fileName){
        this.fileName = fileName;
    }
    public String m1(){
        int lastDotIdnex = fileName.lastIndexOf(".");
        if(lastDotIdnex>0){
            return fileName.substring(0,lastDotIdnex);
        }else{
            return fileName;
        }
    }
    public String m2(){
        int lastDotIdnex = fileName.lastIndexOf(".");
        if(lastDotIdnex>0){
            return fileName.substring(lastDotIdnex);
        }else{
            return "";
        }

    }

    public static void main(String[] args) {
        Filename f1 = new Filename("myprogram.c");
        Filename f2 = new Filename("data.csv");
        System.out.println(f1.m1());
        System.out.println(f1.m2());
        System.out.println(f2.m1());
        System.out.println(f2.m2());

    }
}
