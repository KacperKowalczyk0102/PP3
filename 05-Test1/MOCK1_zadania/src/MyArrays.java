public class MyArrays {
    public static int even(int[] array){
        int sum1 = 0;
        for(int i : array) {
            if (i % 2 == 0) {
                sum1++;
            }
        }
        return sum1;
    }
    public static int positivaOdd(int[] array){
        int sum2 = 0;
        for(int i : array){
            if(i>0 && i%2!=0){
                sum2++;
            }
        }
        return sum2;
    }

    public static void main(String[] args) {
        System.out.println(MyArrays.even(new int[]{2,-6,5,8}));
        System.out.println(positivaOdd(new int[]{3,2,-5,4,1,-7}));
    }
}
