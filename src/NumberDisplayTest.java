import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by dv15man
 */
public class NumberDisplayTest {

    @Test
    public void shouldCreateNumberDisplay() throws Exception{
        new NumberDisplay(0,1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldNotCreateNumberDisplay() throws Exception{
        new NumberDisplay(1,0);
    }

    @Test
    public void shouldSetCorrectValue1() throws Exception{
        NumberDisplay display = new NumberDisplay(0,12);

        display.setValue(6);
    }

    @Test
    public void shouldSetCorrectValue2() throws Exception{
        NumberDisplay display = new NumberDisplay(0,12);

        display.setValue(12);
    }

    @Test
    public void shouldSetCorrectValue3() throws Exception{
        NumberDisplay display = new NumberDisplay(0,12);

        display.setValue(1);
    }

    @Test( expected = IllegalArgumentException.class)
    public void shouldNotSetOverMaxValue() throws Exception{
        NumberDisplay display = new NumberDisplay(0,12);

        display.setValue(13);
    }

    @Test( expected = IllegalArgumentException.class)
    public void shouldNotSetBelowMaxValue() throws Exception{
        NumberDisplay display = new NumberDisplay(0,12);

        display.setValue(-1);
    }

    @Test
    public void shouldGetCorrectDigit() throws Exception{
        NumberDisplay display = new NumberDisplay(0,12);

        display.setValue(5);

        assertEquals(display.getValue(),5);

    }

    @Test(expected = IllegalStateException.class)
    public void shouldNotGetCorrectDigit() throws Exception {
        NumberDisplay display = new NumberDisplay(0, 12);

        display.setValue(5);

        if (display.getValue() != 7) {
            throw new IllegalStateException("Returns wrong value");
        }
    }

    @Test
    public void shouldGetDisplayValue() throws Exception{
        NumberDisplay display = new NumberDisplay(0,12);

        display.setValue(5);
        System.out.println(display.getDisplayValue());
        if (!(display.getDisplayValue()).equals("05")){
            throw new IllegalStateException("Returns wrong String");
        }
    }

    @Test
    public void shouldGetDubbleZero() throws Exception{
        NumberDisplay display = new NumberDisplay(0,12);

        display.setValue(0);
        System.out.println(display.getDisplayValue());
        if (!(display.getDisplayValue()).equals("00")){
            throw new IllegalStateException("Returns wrong String");
        }
    }


    @Test
    public void shouldTickOneSecondAndWrapAround() throws Exception{
        NumberDisplay display = new NumberDisplay(0,12);
        display.setValue(0);

        for (int i=0; i<=24; i++){
            System.out.println(display.getValue());
            if(display.getValue() != i %12){
                throw new IllegalStateException("Returns wrong String");
            }
            display.increment();
        }

    }



}
