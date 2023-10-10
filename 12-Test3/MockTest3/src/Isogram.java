public class Isogram {
    public static boolean isogram(String slowo){
        char[] znaki = slowo.toCharArray();
        for(char znak: znaki){
            int counter = 0;
            for(char znak2: znaki){
                if(znak ==znak2){
                    counter++;
                }
                if (counter>1){
                    return false;
                }
            }
        }return true;
    }
    public static void main(String[] args) {
        System.out.println(Isogram.isogram("red sun"));
        System.out.println(Isogram.isogram("blue water"));
        System.out.println(Isogram.isogram("BLUE water"));
        System.out.println(Isogram.isogram("my blue water"));
    }
}
