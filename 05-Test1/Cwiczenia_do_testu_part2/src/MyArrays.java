public class MyArrays {
    public static int odd(int[] array){
        int sum = 0;
        for(int element: array){
            if(element>0 && element%2!=0){
                sum++;
            }
        }return sum;
    }
    public static int above(int[] array){
        int sumWartości = 0;
        int sumElementów = 0;
        for(int element: array) {
            sumWartości+=element;
        }
        double srednia = sumWartości/array.length;
        int finalSUm=0;
        for(int element: array) {
            if (element>srednia){
                finalSUm+=element;
            }
        }
        return finalSUm;
    }
    public static void main(String[] args) {
        int[] array1 = {3, 2, -5, 4, 1, -7};
        int[] array2 = {5, 2, 7, 4, 2,};
        System.out.println(MyArrays.odd(array1));
        System.out.println(MyArrays.above(array2));
    }

}
