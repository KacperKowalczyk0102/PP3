public class Car extends Vehicle{
    int maxSpeed;
    Car(int s,int maxSpeed){
        super(s);
        this.maxSpeed = maxSpeed;
    }
    public int[] spec(){
        return new int[]{getSeats(),this.maxSpeed};
    }
}
