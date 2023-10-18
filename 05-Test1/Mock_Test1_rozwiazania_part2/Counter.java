public class Counter {
    int counter = 0;
    Counter(int counter){
        this.counter = counter;
    }
    public void increase(){
        counter++;
    }
    public void decrease(){
        counter--;
    }
    public void increase(int n){
        counter+=n;
    }
    public void decrease(int n){
        counter+=n;
    }
    
}
