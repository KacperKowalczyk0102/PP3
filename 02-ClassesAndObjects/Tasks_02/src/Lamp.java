public class Lamp {
     Boolean isOn;

     Lamp(boolean isOn){
         this.isOn = isOn;
     }
     public void turnOn(){
         this.isOn = true;
     }
     public void turnOff(){
         this.isOn = false;
     }
    String status(){
         return (this.isOn ? "Lamp is switched ON " : " Lamp is switched OFF");

    }

    public static void main(String[] args) {
        Lamp lamp1 = new Lamp(true);
        Lamp lamp2 = new Lamp(false);
        System.out.println("Lamp 1");
        System.out.println(lamp1.status());
        lamp1.turnOff();
        System.out.println(lamp1.status());;
        System.out.println("Lamp 2");
        System.out.println(lamp2.status());
        lamp2.turnOn();
        System.out.println(lamp2.status());

    }
}
