/**
 * Created by dv15man on 2016-03-30.
 */
public class Alarm extends Clock {


    private boolean alarmSet = false;
    private String displayAlarm;


    /**
     * Allows the user to set the alarm on or of.
     * True if the alarm should be turned on, False for off.
     * @param alarmSet True for on, false for off.
     */
    public void setAlarm(boolean alarmSet){

        this.alarmSet = alarmSet;
    }

    /**
     * This method sets the alarm time for the clock
     *
     * @param hour  integer for hour
     * @param minute integer for minute
     */
    public void setAlarmTime(int hour, int minute){
        NumberDisplay alarmHour = new NumberDisplay(0,24);
        NumberDisplay alarmMinute = new NumberDisplay(0,60);

        alarmHour.setValue(hour);
        alarmMinute.setValue(minute);

        this.displayAlarm = (alarmHour.getDisplayValue() +
                ":" + alarmMinute.getDisplayValue());


    }

    /**
     * timeTick calls method increment that increases minute with one.
     * If minute did a wrap around increase hour with one..
     *
     * If the time is the same as alarm time the class will print out ALARM.
     */
    public void timeTick(){

        super.timeTick();

        if (checkAlarm()) {
            System.out.println("ALARM!");
        }
    }

    /**
     * Method check if the alarm should go off
     * @return True if alarm should go off, false otherwise.
     */
    private boolean checkAlarm(){

        return (displayAlarm).equals(getTime());
    }





}
