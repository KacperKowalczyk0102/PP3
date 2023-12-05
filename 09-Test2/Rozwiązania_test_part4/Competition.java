import java.util.Arrays;

public class Competition{
    private int sum = 0;
    
    Competition(int[] oceny){
    Arrays.sort(oceny);
    int[] ocenyNowe = Arrays.copyOfRange(oceny, 1, oceny.length-1);
    for(int ocena: ocenyNowe){
        sum+=ocena;
    }
    }
    public int m(){
        return sum;
    }
    public static void main(String[] args) {
        int[] oceny = {4,5,3,3,5,2,2,4};
    Competition com = new Competition(oceny);
        System.out.println(com.m());
    }
    
}