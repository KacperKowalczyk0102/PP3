public class Words {
    String[] arr;
    Words(String[] arr){
        this.arr = arr;
    }
    public boolean m(){
        for(String słowo: arr){
            int counter = 0;
            for(String słowo2: arr){
                if(słowo==słowo2){
                    counter++;
                }
                if(counter>1){
                    return true;
                }
            }
        }return false;
    }
}
