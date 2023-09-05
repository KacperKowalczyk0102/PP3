public class Counter {
    int counter = 0;


    void increaseByOne(){
        counter+=1;
    }
    void decreaseByOne(){
        counter-=1;
    }
    void increaseByTen(){
        counter+=10;
    }
    void decreaseByTen(){
        counter-=10;
    }
    void reset(){
        counter = 0;
    }


    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        counter1.increaseByTen();
        counter1.increaseByTen();
        counter1.increaseByOne();
        counter1.increaseByOne();
        counter1.increaseByOne();
        System.out.println("Counter 1: " + counter1.counter);
        counter2.decreaseByTen();
        counter2.decreaseByTen();
        counter2.decreaseByTen();
        counter2.decreaseByTen();
        counter2.decreaseByTen();
        counter2.increaseByOne();
        counter2.increaseByOne();
        counter2.increaseByOne();
        System.out.println("Counter 2: "+ counter2.counter);
    }
}
