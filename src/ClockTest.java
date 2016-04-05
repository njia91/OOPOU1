import org.junit.Test;

/**
 * Created by dv15man on
 * Test suite for Clock.class
 */
public class ClockTest {

    /**
     * Test that a Clock can be created.
     * @throws Exception
     */
    @Test
    public void shouldCreateClock() throws Exception {
        new Clock();
    }

    /**
     * Test that the user can create a clock and set the time.
     * Testing getTime() function.
     * @throws Exception
     */
    @Test
    public void shouldCreateClockAndSetTime() throws Exception {
        Clock c = new Clock(0,24);

        if (!(c.getTime().equals("00:24"))){
            throw new IllegalStateException("Clock shows inaccurate time!") ;
        }
    }

    /**
     * Test that the user can set the time with setTime() and
     * that getTime() returns the correct time.
     * @throws Exception
     */
    @Test
    public void shouldSetTime() throws Exception {
        Clock c = new Clock();
        c.setTime(10,10);

        if (!(c.getTime().equals("10:10"))){
            throw new IllegalStateException("Clock shows inaccurate time!") ;
        }
    }

    /**
     * Test that the Clock can tick correctly and that the hour
     * digit wraps around.
     * @throws Exception
     */
    @Test
    public void shouldTickAndGetCorrectTime() throws Exception {
        Clock c = new Clock();
        c.setTime(10,59);
        c.timeTick();
        if (!(c.getTime().equals("11:00"))){
            throw new IllegalStateException("Clock does not wrap around");
        }
        c.timeTick();
        if (!(c.getTime().equals("11:01"))){
            throw new IllegalStateException("Clock does not wrap around");
        }


    }




}
