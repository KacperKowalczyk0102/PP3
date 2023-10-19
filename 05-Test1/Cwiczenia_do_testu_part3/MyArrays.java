public class MyArrays {
    public static int odd(int[] array){
        int sum = 0;
        for(int arr: array){
            if(arr>0&&arr%2!=0){
                sum++;
            }
        }
        return sum;
    }
    public static int above(int[] array){
        int sumValues = 0;
        int sumNumbers = 0;
        for(int arr: array){
           sumNumbers++; 
           sumValues+=arr;
        }
        int mean = sumValues/sumNumbers;
        int finalSum = 0;
        for(int arr: array){
            if(arr>mean){
                finalSum+=arr;
            }
        }
        return finalSum;
    }
    public static void main(String[] args) {
        int[] array = {3,2,-5,4,1,-7};
        int[] array2 ={5,2,7,4,2};
        System.out.println(MyArrays.odd(array));
        System.out.println(MyArrays.above(array2));
    }
}
