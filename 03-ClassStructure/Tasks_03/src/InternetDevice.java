public class InternetDevice {
    String name;
    boolean connected = false;
    static int connectedDevices;

    InternetDevice(String name){
        this.name = name;
    }
    void Connect(){
        if(!this.connected){
            this.connected = true;
            InternetDevice.connectedDevices+=1;
        }
    }
    void Disconnect(){
        if(this.connected){
            this.connected = false;
            InternetDevice.connectedDevices-=1;
        }
    }
    boolean isConnected(){
        return this.connected;

    }
    void displayStatus(){
        System.out.println("Name: "+ this.name);
        System.out.println("Connection status: " + this.connected);
    }
    static void displayConnections(){
        System.out.println("Connected devices: "+ connectedDevices);
    }

    public static void main(String[] args) {
        InternetDevice d1 = new InternetDevice("Smartphone");
        InternetDevice d2 = new InternetDevice("Laptop");
        InternetDevice d3 = new InternetDevice("PC");
        InternetDevice d4 = new InternetDevice("Xbox");
        InternetDevice d5 = new InternetDevice("TV");
        d1.Connect();
        d2.Connect();
        d3.Connect();
        d1.displayStatus();
        d2.displayStatus();
        d3.displayStatus();
        d4.displayStatus();
        d5.displayStatus();
    }
}
