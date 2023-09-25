public class Numbers {
    public boolean m(int[] numbers){
        int sumD = 0;
        int sumU = 0;
        for(int a: numbers){
            if(a>0){
                sumD+=a;
            }else if(a<0){
                sumU+=Math.abs(a);
            }
        }
        return sumD>sumU;
    }

    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        int[] n1 = {9,3,4,-2,-8};
        int[] n2 = {9,0,2,-7,4,-9,1,-5};
        System.out.println(numbers.m(n1));
        System.out.println(numbers.m(n2));
    }
}
