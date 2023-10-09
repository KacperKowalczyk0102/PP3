public class Filename {
    String name;
    Filename(String name){
        this.name = name;
    }

    public String m1(){
        char[] array = name.toCharArray();
        int lastIndex = name.lastIndexOf(".");
            if(lastIndex>0){
                return name.substring(0,lastIndex);

            }else {
                return name;
            }
        }

    public String m2() {
        char[] array = name.toCharArray();
        int lastIndex = name.lastIndexOf(".");

            if (lastIndex > 0) {
                return name.substring(lastIndex);

            } else {
                return "";
            }
        }
    }

