public class Arrays {
    public static boolean arr(int[] arr1, int[] arr2){
        int sum = 0;
        for(int liczba: arr1){
            if(liczba>=10 &&liczba <100){
                sum++;
            }
        }
        int sum2 = 0;
        for(int liczba: arr2){
            if(liczba>=10&&liczba<100){
                sum2++;
            }
        }
        return sum==sum2;
    }
    public static void main(String[] args) {
        int[] arr1 = {15,8,2,37,49,117};
        int[] arr2 = {9,6,7,12,48,4,6,90,5};
        int[] arr3 = {9,6,7,12,48,4,6,90,20};

        System.out.println(Arrays.arr(arr1,arr2));
        System.out.println(Arrays.arr(arr1,arr3));
    }
}
