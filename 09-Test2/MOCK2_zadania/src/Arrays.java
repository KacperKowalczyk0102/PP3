public class Arrays {
    public static boolean arr(int[]arr, int []arr2){

        int sum1 = 0;
        for(int para : arr){
           if(para>10 && para<100){
               sum1++;
           }
        }
        int sum2 = 0;
        for(int para2 : arr2){
            if(para2>10 && para2<100){
                sum2++;
            }
        }
        if(sum1 ==sum2){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {15,8,2,37,49,117};
        int[] arr2 = {9,6,7,12,48,4,6,90,5};
        int[] arr3 = {9,6,7,12,48,4,6,90,20};

        System.out.println(Arrays.arr(arr1,arr2));
        System.out.println(Arrays.arr(arr1,arr3));
    }
}
