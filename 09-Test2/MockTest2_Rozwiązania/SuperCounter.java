public class SuperCounter extends Counter
{
    SuperCounter(int counter){
        super(counter);
    }

    public void addN(int n){
        for(int i=0; i<n;i++){
            add1();
        }
    }

}