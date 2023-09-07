public class Room {
    int number;
    int beds;
    boolean occupied;
    String guestName;

    Room(int number){
        this.number = number;
        this.beds+=2;
    }
    Room(int number, int beds){
        this.number = number;
        this.beds = beds;
    }
    void checkin(String guestName){
        this.guestName = guestName;
       this.occupied = true;
    }
    void checkout(){
        this.occupied = false;
    }
    boolean isOccupied(){
        return this.occupied;

    }
    void displayStatus(){
        System.out.print("Room Number : " + this.number);
        System.out.print(", Number of beds : " + this.beds);
        System.out.print(", is Occupied? " + this.occupied);
        System.out.println(", Guest name : " + this.guestName);
    }

    public static void main(String[] args) {
        Room r1 = new Room(1);
        r1.checkin("Kacper");
        r1.displayStatus();
    }
}
