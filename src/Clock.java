/**
 * Created by dv15man on 2016-03-29.
 *
 * Class for simulation a Clock.
 */
public class Clock {


    private NumberDisplay hour = new NumberDisplay(0,24);
    private NumberDisplay minute = new NumberDisplay(0,60);
    private String displayString = "00:00";


    /**
     * Constructor for creating a clock
     * Setting hour and minute to zero
     */
    public Clock(){

        this.hour.setValue(0);
        this.minute.setValue(0);
        }

    /**
     * Constructer allows user to select time for hour and minute
     * @param hour integer for hour
     * @param minute integer for minute
     */
    public Clock(int hour, int minute){

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
     */
    public void setTime(int hour, int minute){

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
     * Internal method that updates the displayString.
     */
    private void updateDisplay(){

        this.displayString = (hour.getDisplayValue() +
                ":" + minute.getDisplayValue());
    }


}
