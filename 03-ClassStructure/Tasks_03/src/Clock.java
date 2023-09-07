public class Clock {
    int hour;
    int minute;

    Clock(){
        this.hour=0;
        this.minute=0;
    }
    Clock(int hour,int minute){
        this.hour = hour;
        this.minute = minute;
        if(hour<0){
            this.hour= 0;
        }else if(hour>23){
            this.hour = 23;
        }
        if(minute<0){
            this.minute=0;
        }else if(minute>59){
            this.minute=59;
        }
    }
    void setCloc(int hour, int minute){
        this.hour = hour;
        this.minute = minute;
    }
    void setClock(){
        this.hour = 0;
        this.minute = 0;
    }
    void displayTime(){
        String hHour = Integer.toString(this.hour);
        String mMinute = Integer.toString(this.minute);
        if(this.hour<10){
            hHour = "0"+ Integer.toString(this.hour);
        }
        if(this.minute<10){
            mMinute = "0" + Integer.toString(this.minute);
        }
        System.out.println("Godzina: " + hHour + ":" + mMinute);
    }
    void addOneMinute(){
        this.minute+=1;
        if(this.minute>59){
            this.minute = 0;
            this.hour+=1;
            if(this.hour>23){
                this.hour=0;
            }
        }
    }

    public static void main(String[] args) {
        Clock c1 = new Clock(12,47);
        c1.displayTime();
        Clock c2 = new Clock(9,3);
        c2.displayTime();
        Clock c3 = new Clock(23,58);
        c3.displayTime();
        c3.addOneMinute();
        c3.displayTime();
        c3.addOneMinute();
        c3.displayTime();
    }
}
