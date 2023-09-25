import java.lang.reflect.Array;
import java.util.Arrays;

public class MyArrays {
    public static int odd(int[] array) {
        int sumOdd = 0;
        for (int a : array) {
            if (a > 0 && a % 2 != 0) {
                sumOdd++;
            }

        }
        return sumOdd;
    }


    public static int above(int[] array) {
        int srednia = 0;
        int sum = 0;
        for (int arr : array) {
            sum += arr;
        }

        srednia = sum/array.length;

        int sumAbove = 0;
        for (int a : array) {
            if (a > srednia) {
                sumAbove += a;
            }
        }
        return sumAbove;
    }

    public static void main(String[] args) {
        int[] array1 = {3, 2, -5, 4, 1, -7};
        int[] array2 = {5, 2, 7, 4, 2,};
        System.out.println(MyArrays.odd(array1));
        System.out.println(MyArrays.above(array2));
    }
}
