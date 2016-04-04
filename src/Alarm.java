/**
 * Created by dv15man on 2016-03-30.
 */
public class Alarm extends Clock {


    private boolean alarmSet = false;
    private Clock alarmTime = new Clock();



    /**
     * Allows the user to turn on or off alarm
     * @param alarmSet True for on, false for off
     */
    public void setAlarm (boolean alarmSet){

        this.alarmSet = alarmSet;
    }


    /**
     * This method sets the alarm time for the clock
     *
     * @param hour  integer for hour
     * @param minute integer for minute
     */
    public void setAlarmTime(int hour, int minute){

        alarmTime.setTime(hour, minute);


    }

    /**
     * Allows the user to check the alarm time
     * @return String of the alarm time.
     */
    public String getAlarmTime(){
        return alarmTime.getTime();
    }

    /**
     * timeTick calls method increment that increases minute with one.
     * If minute did a wrap around increase hour with one..
     *
     * If the time is the same as alarm time the class will print out ALARM.
     */
    @Override
    public void timeTick(){

        super.timeTick();

        if (checkAlarm() && this.alarmSet) {
            System.out.println("ALARM!");
        }
    }

    /**
     * Method check if the alarm should go off
     * @return True if alarm should go off, false otherwise.
     */
    private boolean checkAlarm(){

        return (alarmTime.getTime()).equals(getTime());
    }






}
