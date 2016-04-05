import org.junit.Test;

/**
 * Created by dv15man
 * Test suite for Alarm.class
 */
public class AlarmTest {

    /**
     * Sets alarm time with setAlarmTime and
     * getAlarmTime returns the current alarm time.
     * Should be the same.
     * @throws Exception
     */
    @Test
    public void alarmTimeShouldBeCorrect() throws Exception{
        Alarm aClock = new Alarm();

        aClock.setTime(10,10);

        aClock.setAlarmTime(10,9);

        if (!(aClock.getAlarmTime()).equals("10:09")){
            throw new IllegalStateException("Wrong Alarm Time.");
        }
    }

    /**
     * The sets the alarm time with SetAlarmTime and
     * getAlarmTime returns the current alarmTime.
     * Should not be the same, compares with wrong value.
     * Negative test.
     * @throws Exception
     */
    @Test
    public void alarmTimeShouldNotBeCorrect() throws Exception{
        Alarm aClock = new Alarm();

        aClock.setTime(10,10);

        aClock.setAlarmTime(10,9);

        if ((aClock.getAlarmTime()).equals("10:9")){
            throw new IllegalStateException("Wrong Alarm Time.");
        }
    }

    /**
     * This test sets an alarm time and then uses timeTick to the
     * alarmTime. The alarm should not go off, because the alarm is off.
     * @throws Exception
     */
    @Test
    public void alarmShouldBeOff() throws Exception{
        Alarm aClock = new Alarm();

        System.out.println("Test: Should not print \"ALARM!\"");

        aClock.setTime(10,10);
        aClock.setAlarmTime(10,9);

        aClock.timeTick();

        System.out.println("Test is over.");

    }

    /**
     * This test turns the alarm on, sets an alarm time and
     * ticks passed the alarm time. The alarm should go off.
     * @throws Exception
     */
    @Test
    public void alarmShouldBeOn() throws Exception{

        System.out.println("Test: Should print \"ALARM!\"");
        Alarm aClock = new Alarm();

        aClock.setAlarm(true);

        aClock.setTime(10,10);
        aClock.setAlarmTime(10,11);
        aClock.timeTick();

        System.out.println("Test is over.");
    }
}
