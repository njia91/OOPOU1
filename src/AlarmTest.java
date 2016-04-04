import org.junit.Test;

/**
 * Created by dv15man on 2016-04-03.
 */
public class AlarmTest {

    @Test
    public void alarmShouldBeOff() throws Exception{
        Alarm aClock = new Alarm();

        System.out.println("Should not print \"ALARM!\"");

        aClock.setTime(10,10);
        aClock.setAlarmTime(10,9);

        aClock.timeTick();

    }

    @Test
    public void alarmShouldBeOn() throws Exception{

        System.out.println("Should print \"ALARM!\"");
        Alarm aClock = new Alarm();

        aClock.turnOnAlarm();

        aClock.setTime(10,10);
        aClock.setAlarmTime(10,11);
        aClock.timeTick();
    }
}
