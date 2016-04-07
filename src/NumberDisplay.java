import java.security.InvalidParameterException;

/**
 * Created by dv15man on 2016-03-29.
 *
 * Class for simulation a Number display.
 */
public class NumberDisplay {

    private int minLimit;
    private int maxLimit;
    private int currentDigit;



    /**
     * Constructs a NumberDisplay and sets the
     * min and max value for the display
     * @param  minLimit -  Minimum value
     * @param maxLimit - Maximum value
     * @throws IllegalArgumentException if invalid argument
     * */
    public NumberDisplay(int minLimit, int maxLimit){

        if (minLimit < maxLimit) {
            this.minLimit = minLimit;
            this.maxLimit = maxLimit;
        }
        //If parameter value is not within the limit.
        else {
            throw new IllegalArgumentException("minLimit is larget than maxLimit");
        }

    }

    /**
     * Returns the current value of the display
     *
     * @return value of currentDigit
     */
    public int getValue(){

        return currentDigit;
    }

    /**
     * Changes the currentDigit to the input value
     * Controls that the value is within limits.
     *
     * @param newValue new value for the display
     * @throws InvalidParameterException if invalid parameters.
     */
    public  void setValue(int newValue) throws InvalidParameterException{

        if (newValue>=minLimit && newValue<=maxLimit){
            currentDigit = newValue;
        }
        else{
            throw new InvalidParameterException("newValue is not valid.");
        }
    }

    /**
     * Converts the currentDigits to a string
     *
     * @return the formatted string
     */
    public String getDisplayValue(){

        int nrOfDigits = (int)(Math.log10(maxLimit)+1);
        String formatted = String.valueOf(currentDigit);
        //Padd the string with zeroes.
       while(formatted.length()< nrOfDigits){
           formatted = ("0" + formatted);
       }
        return formatted;
    }

    /**
     * Add one value to currentDigit.
     * Uses mod maxLimit to know when to flip value to minLimit.
     */
    public void increment(){
        currentDigit++;

        if((currentDigit % maxLimit == 0)){
            currentDigit = minLimit;
        }
    }

    /**
     * Returns true if last call of increment changes the
     * value of currentDigit to minLimit.
     * In other words, did a wrap around.
     * @return true if currentDigit is == minLimit.
     *
     */
    public boolean didWrapAround(){

        return currentDigit == minLimit;
    }

}
