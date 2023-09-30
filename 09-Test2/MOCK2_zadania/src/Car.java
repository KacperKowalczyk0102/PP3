import java.util.Arrays;

public class Car extends Vehicle{
    private int maxSpeed;

    Car(int seats, int maxSpeed){
        super(seats);
        this.maxSpeed = maxSpeed;
    }
    public int[] spec(){
        int[] arrarySpec = {getSeats(),this.maxSpeed};
    return arrarySpec;
    }
    public String toString(){
        return Arrays.toString(spec());
    }

    public static void main(String[] args){
        Car car1 = new Car(2,200);
        System.out.println(car1.spec()[1]);
        System.out.println(car1.spec()[0]);
        System.out.println(car1.toString());

    }
}
