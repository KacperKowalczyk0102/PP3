public class Task23 {
    public static class Room {
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
        public String toString(){
            return "Room Number : " + this.number +
                    ", Number of beds : " + this.beds+
                    ", is Occupied? " + this.occupied+
                    ", Guest name : " + this.guestName;     }
        static void displayRoomsReports(Room[] rooms){
            for(Room room: rooms){
                System.out.println(room.toString());
            }
            System.out.println("");
        }

        static void displayRoomsReportWithBeds(Room[] rooms, int spec_numbers_of_beds){
            for(Room room:rooms){
                if(room.beds==spec_numbers_of_beds){
                    System.out.println(room.toString());
                }
            }
            System.out.println("");
        }
        static void displayNumOfBeds(Room[] rooms){

            for(Room room : rooms){
                if(room.occupied){
                    room.beds--;
                    System.out.println("Num of Beds from room number "+ room.number+ " is: "+ room.beds);
                }
            }

        }
        static void displayRoomsReportOccupied(Room[] rooms){
            int num_of_free_rooms = 0;
            int num_of_occupied_rooms = 0;

            for(Room room:rooms){
                if(room.occupied){num_of_occupied_rooms++;}
                else {num_of_free_rooms++;}
            }
            System.out.println("Number of free rooms: "+ num_of_free_rooms);
            System.out.println("Number of occupied rooms: "+ num_of_occupied_rooms);
        }

        public static void main(String[] args) {
            Room r1 = new Room(1);
            Room r2 = new Room(2);
            Room r3 = new Room(3);
            Room r4 = new Room(4, 3);
            Room r5 = new Room(5, 3);
            Room r6 = new Room(6, 1);

            r3.checkin("Michał");

            r6.checkin("Kinga");
            System.out.println(r6.toString());

            Room[] rooms = {r1,r2,r3,r4,r5,r6};
            displayRoomsReports(rooms);
            displayRoomsReportWithBeds(rooms,3);
            displayRoomsReportOccupied(rooms);
            displayNumOfBeds(rooms);
        }
    }

}
