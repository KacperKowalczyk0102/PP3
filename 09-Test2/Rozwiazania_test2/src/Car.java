public class Car extends Vehicle {
    int speed;

    Car(int seats, int speed){
        super(seats);
        this.speed = speed;
    }
    public int[] spec(){
        return new int[]{getSeats(),this.speed};
    }
}
