public class Numbers {
    int n1;
    int n2;
    int n3;
    int n4;
    int n5;
    Numbers(int n1, int n2, int n3, int n4, int n5){
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        this.n5 = n5;
    }
    public boolean other(){
        int[] array = {n1,n2,n3,n4,n5};
        for(int liczba : array){
            int suma = 0;
            for(int liczba2: array){
                if(liczba==liczba2){
                    suma++;
                }
            }
            if(suma>1){
                return false;
            }
        }return true;
    }
    public static void main(String[] args) {
        Numbers n = new Numbers(1, 2, 2, 4, 5);
        Numbers n2 = new Numbers(1, 2, 3, 4, 5);
        System.out.println(n.other());
        System.out.println(n2.other());
    }
}

