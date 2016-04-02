/**
 * Created by dv15man on 2016-03-29.
 */
public class OU1 {
    public static void main(String[] args) {

        //Clock time = new Clock(0,0);
        Alarm alarm = new Alarm();


        alarm.setAlarm(true);

        alarm.setTime(13,50);
        alarm.setAlarmTime(14,00);



        for(int i = 0; i <50000; i++){
            alarm.timeTick();
            System.out.println(alarm.getTime());
            //System.out.println("alarm");

            try {
                Thread.sleep(1000);
            } catch(Exception e){
                System.out.println(e);
            }

        }

    }


}
