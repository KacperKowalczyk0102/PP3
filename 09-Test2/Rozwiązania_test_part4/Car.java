public class Car extends Vehicle{
    private int speed;
    Car(int seats, int speed){
        super(seats);
        this.speed = speed;
    }
    
    public int[] spec(){
        return new int[]{getSeats(),getSpeed()};
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}