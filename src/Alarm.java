/**
 * Created by dv15man.
 *
 * Alarm inherits form class Clock.
 * This class is used to simulate an alarm clock.
 * Allows the user to turn on/off alarm and set an alarm time.
 */
public class Alarm extends Clock {


    private boolean alarmSet = false;
    private Clock alarmTime = new Clock();


    /**
     * Constructor for creating a clock
     * Setting hour and minute to zero
     */
    public Alarm(){
     super();
    }

    /**
     * Constructor allows user to select time for hour and minute
     * @param hour integer for hour
     * @param minute integer for minute
     */
    public Alarm(int hour, int minute) {
            super(hour, minute);

    }

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
