import org.junit.Test;

/**
 * Created by dv15man
 */
public class AlarmTest {


    @Test
    public void alarmTimeShouldBeCorrect() throws Exception{
        Alarm aClock = new Alarm();

        aClock.setTime(10,10);

        aClock.setAlarmTime(10,9);

        if (!(aClock.getAlarmTime()).equals("10:09")){
            throw new IllegalStateException("Wrong Alarm Time.");
        }
    }


    @Test
    public void alarmTimeShouldNotBeCorrect() throws Exception{
        Alarm aClock = new Alarm();

        aClock.setTime(10,10);

        aClock.setAlarmTime(10,9);

        if ((aClock.getAlarmTime()).equals("10:9")){
            throw new IllegalStateException("Wrong Alarm Time.");
        }
    }


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

        aClock.setAlarm(true);

        aClock.setTime(10,10);
        aClock.setAlarmTime(10,11);
        aClock.timeTick();
    }
}
