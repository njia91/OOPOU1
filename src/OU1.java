/**
 * Created by dv15man
 *
 * This is a simple test program that illustrates that tests class Alarm.
 * If Alarm works so should Clock, since Alarm inherits from Clock.
 *
 */
public class OU1 {
    public static void main(String[] args) {
        //Create an object of class Alarm
        Alarm alarm = new Alarm();

        // Starts the Alarm
        alarm.setAlarm(true);
        //Sets the time
        alarm.setTime(13,50);
        //Sets the alarm time.
        alarm.setAlarmTime(13,55);

        System.out.println("Alarm should go of at" + alarm.getAlarmTime());
        //Will iterate passed the alarm. Alarm should go off
        for(int i = 0; i <10; i++){
            alarm.timeTick();
            System.out.println(alarm.getTime());
            }


        System.out.println("Alarm should not go off at 14:05");
        alarm.setAlarm(false);
        alarm.setAlarmTime(14,5);
        for(int i = 0; i <5; i++){
            alarm.timeTick();
            System.out.println(alarm.getTime());
        }
    }

}
