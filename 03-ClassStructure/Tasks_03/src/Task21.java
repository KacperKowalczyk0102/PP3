public class Task21 {
    public static class Clock{
        int hour;
        int minute;
        int alarmHour;
        int alarmMinute;



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
        void setAlarm(int hour, int minute){
            this.alarmHour = hour;
            this.alarmMinute = minute;
        }
        void runAlarm(){
            System.out.println("beep-beep-beep-beep!!");
        }
        void setClock(int hour, int minute){
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
            if(this.hour==this.alarmHour && this.minute==this.alarmMinute){
                runAlarm();
                }

        }

        public static void main(String[] args) {
            Clock c = new Clock();
            c.setAlarm(12,41);
            c.setClock(12,40);
            c.displayTime();
            c.addOneMinute();
            c.displayTime();

        }
    }

}
