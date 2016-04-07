/**
 * Created by dv15man
 *
 * This is a simple test program that illustrates that tests class Alarm.
 * If Alarm works so should Clock, since Alarm inherits from Clock.
 *
 */
public class OU1 {
    public static void main(String[] args) throws IllegalStateException {
        //Create an object of class Alarm
        Alarm alarm = new Alarm();

        // Starts the Alarm
        alarm.setAlarm(true);
        //Sets the time
        alarm.setTime(13,50);

        System.out.println("Test: Set time to 13:50. " +
                " Checks if object return correct time ");
        if (!(alarm.getTime()).equals("13:50")){
            System.err.println("Test Failed!");
        }
        System.out.println("Test OK");

        alarm.setAlarmTime(13,55);

        System.out.println("Test: set alarm time to 13:55. " +
                "Checks if object returns correct alarm time");
        if (!(alarm.getAlarmTime().equals("13:55"))){
            System.err.println("Returned wrong alarm time");
        }


        System.out.println("Alarm should go of at " + alarm.getAlarmTime());
        //Will iterate passed the alarm. Alarm should go off
        for(int i = 0; i <10; i++){
            alarm.timeTick();
            System.out.println(alarm.getTime());
            }

        //Turns off the alarm, and alarm should not go off.
        System.out.printf("Test: Turns off alarm and set alarm time to 14:05");
        System.out.println(". Alarm should not go off at 14:05");
        alarm.setAlarm(false);
        alarm.setAlarmTime(14,5);
        for(int i = 0; i <10; i++){
            alarm.timeTick();
            System.out.println(alarm.getTime());
        }
    }

}
