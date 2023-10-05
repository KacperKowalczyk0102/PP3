public class MyArrays {
    public static int even(int[] array) {
        int sum = 0;
        for (int element : array) {
            if (element % 2 == 0) {
                sum++;
            }
        }
        return sum;
    }

    public static int odd(int[] array){
        int sumOdd = 0;
        for(int element: array){
            if(element>0 && element%2!=0){
                sumOdd+=1;
            }
        }return sumOdd;
    }

    public static void main(String[] args) {
        int[] a1 = {2, -6, 5, 8};
        int[] a2 = {3,2,-5,4,1,-7};
        System.out.println(even(a1));
        System.out.println(odd(a2));
    }
}
