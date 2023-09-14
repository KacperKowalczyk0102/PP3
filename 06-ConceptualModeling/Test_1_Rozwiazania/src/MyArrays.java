public class MyArrays {
    public static int odd(int[]array){
        int sumOdd = 0;
        for(int arr: array){
            if (arr>0 && arr%2!=0){
                sumOdd++;
            }
        }
        return sumOdd;
    }
    public static int above(int[]array){
        int sum = 0;
        double artmetic=0;
        for(float arr: array){
            sum+=arr;
        }
        artmetic = sum/array.length;
        int finalSum = 0;
        for(float arr: array){
            if(arr>artmetic){
                finalSum+=arr;
            }
        }
        return finalSum;
    }

    public static void main(String[] args) {
        int[] array1 = {3, 2, -5, 4, 1, -7};
        int[] array2 = {5, 2, 7, 4, 2};
        System.out.println(MyArrays.odd(array1));
        System.out.println(MyArrays.above(array2));
    }

}
