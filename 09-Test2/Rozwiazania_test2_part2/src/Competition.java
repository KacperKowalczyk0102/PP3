public class Competition {
    private int finalGrade;
    Competition(int[] oceny){
        int sum = 0;
        for(int i : oceny){
            if(i>=1 && i<=5){
                sum+=i;
            }
        }
        sum-= findMax(oceny);
        sum-= findMin(oceny);
        finalGrade=sum;
    }
    public int m() {
        return finalGrade;
    }
    public int findMin(int [] oceny){
        int min = 5;
        for(int ocena: oceny){
            if(ocena<min){
                min = ocena;
            }
        }return min;
    }
    public int findMax(int [] oceny){
        int max = 1;
        for(int ocena: oceny){
            if (ocena>max){
                max = ocena;
            }
        }return max;
    }

    public static void main(String[] args) {
        int[] o1 = {4,5,3,3,5,2,2,4};
        int[] o2 = {1,3,2,4};
        Competition c1 = new Competition(o1);
        Competition c2 = new Competition(o2);
        System.out.println(c1.m());
        System.out.println(c2.m());
    }
}
