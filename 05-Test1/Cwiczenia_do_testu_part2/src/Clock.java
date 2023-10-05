public class Clock {
    private int hour;
    private int minute;

    Clock(int hour, int minute){
        this.hour=hour;
        this.minute = minute;
        if(hour<0){
            this.hour = 0;
        } else if (hour>23) {this.hour=23;

        }
        if(minute<0){
            this.minute=0;
        } else if (minute>59) {this.minute=59;

        }
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }
    public void addMinute(){
        this.minute+=1;
        if (this.minute>59){
            this.minute=0;
            this.hour+=1;
            if(this.hour>23){
                this.hour=0;
            }
        }

    }

}
