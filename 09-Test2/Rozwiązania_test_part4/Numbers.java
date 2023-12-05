public class Numbers{
    public static boolean m(int[] numbers){
        int dodatnie = 0;
        int ujemne = 0;
        
        for(int number: numbers){
            if(number>0){
                dodatnie+=number;
            }else if(number<0){
                ujemne+=Math.abs(number);
            }
        }
        return dodatnie>ujemne;
    }
}