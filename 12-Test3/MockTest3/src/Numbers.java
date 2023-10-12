public class Numbers implements Ok {
    int[] array;

    Numbers(int[] array){
        this.array = array;
    }

    @Override
    public boolean ok() {
        for(int i=0;i< array.length;i++){
            if((array[i]%2)!=(i%2)){
                return false;
            }
        }return true;
    }

    public static void main(String[] args) {
        int[] arr1 ={6,7,6,1,4};
        Numbers n = new Numbers(arr1);
        System.out.println(n.ok());
    }
}