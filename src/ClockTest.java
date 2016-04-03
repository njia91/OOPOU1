import org.junit.Test;

/**
 * Created by dv15man on 2016-04-03.
 * Test suite for Clock.class
 */
public class ClockTest {

    @Test
    public void shouldCreateClock() throws Exception {
        new Clock();
    }

    @Test
    public void shouldCreateClockAndSetTime() throws Exception {
        Clock c = new Clock(0,24);

        if (!(c.getTime().equals("00:24"))){
            throw new IllegalStateException("Clock shows inaccurate time!") ;
        }
    }

    @Test
    public void shouldSetTime() throws Exception {
        Clock c = new Clock();
        c.setTime(10,10);

        if (!(c.getTime().equals("10:10"))){
            throw new IllegalStateException("Clock shows inaccurate time!") ;
        }
    }

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
