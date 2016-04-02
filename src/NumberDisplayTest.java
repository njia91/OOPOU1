import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by dv15man on 2016-03-30.
 */
public class NumberDisplayTest {

    @Test
    public void shouldCreateNumberDisplay() throws Exception{
        new NumberDisplay(0,1);
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
    public void shouldNotGetCorrectDigit() throws Exception{
        NumberDisplay display = new NumberDisplay(0,12);

        display.setValue(5);

       if (display.getValue() != 7){
           throw new IllegalStateException("Returns wrong value");
       }


    }



}
