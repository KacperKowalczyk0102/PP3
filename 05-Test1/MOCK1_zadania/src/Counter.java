public class Counter {
    int counter = 0;

    public void increase(){
        this.counter++;
    }
    public void decline(){
        this.counter--;
    }
    public void increase(int n){
        this.counter +=n;
    }
    public void decline(int n){
        this.counter-=n;
    }
    public void value(){
        System.out.println(this.counter);
    }

    public static void main(String[] args) {
        Counter c = new Counter();
        c.value();
        c.increase();
        c.increase();
        c.decline();
        c.increase(5);
        c.decline(2);
        c.value();

    }

}
