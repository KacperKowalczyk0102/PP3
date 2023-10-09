public class Competition {
    private int[] oceny;
    private int ostatecznyWynik;
    Competition(int[] oceny){
        this.oceny = oceny;
        int sumaOcen = 0;
        for (int ocena: oceny){
            if(ocena>=1 && ocena<=5){
                sumaOcen+=ocena;
            }
        }
        sumaOcen-=minimum();
        sumaOcen-=maximum();
        ostatecznyWynik = sumaOcen;

    }

    public int m(){
        return ostatecznyWynik;
    }
    public int minimum(){
        int minimum = 5;
        for(int min: oceny){
            if(min<minimum){
                minimum=min;
            }
        }return minimum;
    }

    public int maximum(){
        int maximum = 1;
        for(int max : oceny){
            if (max>maximum){
                maximum=max;
            }
        }return maximum;
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
