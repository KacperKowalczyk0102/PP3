public class MyArrays {
    public static int even(int[] array){
        int sumEven = 0;
        for(int arr: array){
            if(arr%2==0){
                sumEven++;
            }
        }
        return sumEven;
    }
    public static int positiveOdd(int[] array){
        int sum = 0;
        for(int arr: array){
            if(arr%2!=0 && arr>0){
                sum++;
            }
        }
        return sum;
    }
}
