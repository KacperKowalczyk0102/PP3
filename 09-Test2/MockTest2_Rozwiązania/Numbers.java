import java.util.*;
public class Numbers{
    private int[] liczby;
    Numbers(int n1,int n2,int n3,int n4,int n5){
        liczby = new int[]{n1,n2,n3,n4,n5};
    }
    public boolean diffenet(){
        HashSet<Integer> numbers = new HashSet<Integer>();
        for(int liczba: liczby){
            numbers.add(liczba);
        }
        return numbers.size()==liczby.length;

    }
    public static void main(String[] args) {
        Numbers num = new Numbers(1,2 , 3, 4, 5);
         Numbers num1 = new Numbers(1,2 , 2, 4, 5);
        System.out.println(num.diffenet());
        System.out.println(num1.diffenet());
    }
}