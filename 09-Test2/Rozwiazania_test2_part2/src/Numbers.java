public class Numbers {
    public static boolean m(int[] numbers){
        int sumPlus = 0;
        int sumMinus = 0;

        for(int i: numbers){
            if(i>0){
               sumPlus+=i;
            } else if (i<0) {
                sumMinus+=Math.abs(i);//sumowanie minusowych liczb

            }
        }return sumPlus>sumMinus;
    }

    public static void main(String[] args) {
        int[] n1 ={9,3,4,-2,-8};
        int[] n2 ={9,0,2,-7,4,-9,1,-5};
        System.out.println(Numbers.m(n1));
        System.out.println(Numbers.m(n2));
    }
}
