import java.security.InvalidParameterException;

/**
 * Created by dv15man on 2016-03-29.
 *
 * Class for simulation a Clock.
 */
public class Clock {


    private NumberDisplay hour;
    private NumberDisplay minute;
    private String displayString;


    /**
     * Constructor for creating a clock
     * Setting hour and minute to zero
     */
    public Clock(){
        hour = new NumberDisplay(0,24);
        minute = new NumberDisplay(0,60);
        this.hour.setValue(0);
        this.minute.setValue(0);
    }

    /**
     * Constructer allows user to select time for hour and minute
     * @param hour integer for hour
     * @param minute integer for minute
     * @throws IllegalArgumentException if invalid time is set.
     *
     */
    public Clock(int hour, int minute) throws IllegalArgumentException{

            this.hour.setValue(hour);
            this.minute.setValue(minute);
    }

    /**
     * timeTick calls method increment that increases minute counter.
     * If minute did a wrap around increase hour with one..
     */
    public void timeTick(){
        minute.increment();
        if (minute.didWrapAround()){
            hour.increment();
        }

    }

    /**
     * Allows user to select time
     * @param hour integer value
     * @param minute integer value
     * @throws IllegalArgumentException if invalid time is set.
     */
    public void setTime(int hour, int minute) throws IllegalArgumentException{

        this.hour.setValue(hour);
        this.minute.setValue(minute);
    }

    /**
     * Returns the value of the clock as a string
     * @return String that represents the clock
     */
    public String getTime(){

        updateDisplay();
        return displayString;
    }

    /**
     * Internal method that update  displayString.
     */
    private void updateDisplay(){
        //Merges the string from hour and minute together.
        this.displayString = (hour.getDisplayValue() +
                ":" + minute.getDisplayValue());
    }


}
