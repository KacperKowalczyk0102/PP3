import java.util.Arrays;

public class Competition {
    private int finalGrade;

    Competition(int[] oceny){
       int sum = 0;
       for(int i : oceny){
           sum+=i;
       }
        sum-= findMax(oceny);
        sum-= findMin(oceny);
        finalGrade=sum;

    }

    public int findMin(int[] oceny){
        int max = 1;
        for(int a : oceny){
            if(a>max){
                max=a;
            }
        }return max;
    }
    public int findMax(int[] oceny){
        int min = 5;
        for(int a : oceny){
            if(a<min){
                min=a;
            }
        }return min;

    }
    public int m() {
        return finalGrade;
    }


        public static void main(String[] args) {
        int[] oceny = {4,5,3,3,5,2,2,4};
        Competition c1 = new Competition(oceny);
        System.out.println(c1.m());
    }
}
