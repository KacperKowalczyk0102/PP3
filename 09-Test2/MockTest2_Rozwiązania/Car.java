public class Car extends Vehicle{
    int maxSpeed;
    Car(int seats, int maxSpeed){
        super(seats);
        this.maxSpeed = maxSpeed;
    }
    public int[] spec(){
        return new int[]{getSeats(),this.maxSpeed};
    }
}