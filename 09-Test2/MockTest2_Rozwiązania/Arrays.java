public class Arrays{
    public boolean arr(int[] arr1, int[] arr2){
        int counter1 = 0;
        for(int liczba: arr1){
            if(liczba>9 && liczba<100){
                counter1++;
            }
        }
        int counter2 = 0;
        for(int liczba: arr2){
            if(liczba>9 && liczba<100){
                counter2++;
            }
        }
        return counter1 == counter2;
    }
}