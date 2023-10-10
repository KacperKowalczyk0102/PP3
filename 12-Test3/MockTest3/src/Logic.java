public class Logic {
    boolean[] array;
    Logic(boolean[] array){
        this.array = array;
    }
    public int opposite(){
        int counter = 0;
        for(int i=0;i<array.length-2;i++){
            if(array[i]==array[i+2]&array[i]!=array[i+1]){
                counter++;


            }
        }return counter;
    }
    public static void main(String[] args) {
        // Example usage
        Logic logic1 = new Logic(new boolean[]{true, false, false});
        System.out.println(logic1.opposite());  // Output: 0

        Logic logic2 = new Logic(new boolean[]{true, false, true, false});
        System.out.println(logic2.opposite());  // Output: 2

        Logic logic3 = new Logic(new boolean[]{true, false, true, true, false, true, false, true, false});
        System.out.println(logic3.opposite());  // Output: 5
    }
}
