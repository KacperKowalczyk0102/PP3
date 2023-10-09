public class Numbers {
    public static boolean m(int[] numbers){
        int dodatnie = 0;
        int ujemne = 0;
        for(int liczby: numbers){
            if(liczby>0){
                dodatnie+=liczby;
            }else if(liczby<0){
                ujemne+=Math.abs(liczby);
            }
        }return dodatnie>ujemne;
    }
}
