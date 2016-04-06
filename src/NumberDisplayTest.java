import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by dv15man
 *
 * This test suite tests for NumberDisplay.class
 */
public class NumberDisplayTest {

    /**
     * Test that an object of NumberDisplay can be created
     * with correct arguments
     * @throws Exception
     */
    @Test
    public void shouldCreateNumberDisplay() throws Exception{
        new NumberDisplay(0,1);
    }

    /**
     * Test that an objevt of NumberDisplay cannot be created
     * with incorrect arguments.
     * @throws Exception
     */
    @Test(expected = IllegalArgumentException.class)
    public void shouldNotCreateNumberDisplay() throws Exception{
        new NumberDisplay(1,0);
    }

    /**
     * Test that a value can be inputted in NumberDisplay with
     * method setValue().
     * @throws Exception
     */
    @Test
    public void shouldSetCorrectValue1() throws Exception{
        NumberDisplay display = new NumberDisplay(0,12);

        display.setValue(6);
    }

    /**
     * Test that a value can be inputted in NumberDisplay with
     * method setValue().
     * @throws Exception
     */
    @Test
    public void shouldSetCorrectValue2() throws Exception{
        NumberDisplay display = new NumberDisplay(0,12);

        display.setValue(12);
    }
    /**
     * Test that a value can be inputted in NumberDisplay with
     * method setValue().
     * @throws Exception
     */
    @Test
    public void shouldSetCorrectValue3() throws Exception{
        NumberDisplay display = new NumberDisplay(0,12);

        display.setValue(1);
    }
    /**
     * Test that an incorrect value can not be inputted in NumberDisplay with
     * method setValue().
     * @throws Exception
     */
    @Test( expected = IllegalArgumentException.class)
    public void shouldNotSetOverMaxValue() throws Exception{
        NumberDisplay display = new NumberDisplay(0,12);

        display.setValue(13);
    }
    /**
     * Test that an incorrect value can not be inputted in NumberDisplay with
     * method setValue().
     * @throws Exception
     */
    @Test( expected = IllegalArgumentException.class)
    public void shouldNotSetBelowMaxValue() throws Exception{
        NumberDisplay display = new NumberDisplay(0,12);

        display.setValue(-1);
    }

    /**
     * Test that a value can be inputted with setValue() and then
     * getValue() returns the same value.
     * @throws Exception
     */
    @Test
    public void shouldGetCorrectDigit() throws Exception{
        NumberDisplay display = new NumberDisplay(0,12);

        display.setValue(5);

        assertEquals(display.getValue(),5);

    }

    /**
     * Test that a value can be inputted with setValue() and then
     * getValue() returns the same value. This test should fail though.
     * @throws Exception
     */
    @Test(expected = IllegalStateException.class)
    public void shouldNotGetCorrectDigit() throws Exception {
        NumberDisplay display = new NumberDisplay(0, 12);

        display.setValue(5);


        if (display.getValue() != 7) {
            throw new IllegalStateException("Returns wrong value");
        }
    }

    /**
     * Test that a value can be inputted with setValue() and then
     * getValue() returns the same value. This test should fail though.
     * @throws Exception
     */
    @Test
    public void shouldGetDisplayValue() throws Exception{
        NumberDisplay display = new NumberDisplay(0,12);

        display.setValue(5);
        if (!(display.getDisplayValue()).equals("05")){
            throw new IllegalStateException("Returns wrong String");
        }
    }

    /**
     * Test that NumberDisplay formats a correct string, and
     * pads it with zeroes.
     * @throws Exception
     */
    @Test
    public void shouldGetDubbleZero() throws Exception{
        NumberDisplay display = new NumberDisplay(0,12);

        display.setValue(0);
        if (!(display.getDisplayValue()).equals("00")){
            throw new IllegalStateException("Returns wrong String");
        }
    }

    /**
     * Test that method increment() works correct and that
     * the values of currentDigit wraps around when exceeding
     * maxLimit.
     * @throws Exception
     */
    @Test
    public void shouldTickOneSecondAndWrapAround() throws Exception{
        NumberDisplay display = new NumberDisplay(0,12);
        display.setValue(0);

        for (int i=0; i<=100; i++){
            if(display.getValue() != i %12){
                throw new IllegalStateException("Returns wrong String");
            }
            display.increment();
        }

    }

    /**
     * Sets maxLimit to 100 and calls increment 80 times.
     * The value should not wrap around.
     * @throws Exception
     */
    @Test
    public void shouldNotWrapAround() throws Exception{
        NumberDisplay display = new NumberDisplay(0,100);
        display.setValue(1);

        for (int i=0; i<=80; i++){
            if(display.didWrapAround()){
                throw new IllegalStateException("Returns wrong String");
            }
            display.increment();
        }

    }




}
