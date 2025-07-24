package day4;

import java.util.Timer;
import java.util.TimerTask;
abstract class HourlyAlarm {
    private Timer timer;

    public HourlyAlarm() {
        timer = new Timer();
    }
 public abstract void onAlarm();

 
    public void startAlarm() {
        TimerTask task = new TimerTask() {
            public void run() {
                onAlarm();
            }
        };

        long delay = 0;
        long interval = 60 * 60 * 1000; 
        System.out.println("⏰ Alarm started. It will ring every hour.");
        timer.scheduleAtFixedRate(task, delay, interval);
    }

    
    public void stopAlarm() {
        if (timer != null) {
            timer.cancel();
            System.out.println("🛑 Alarm stopped.");
        }
    }
}



class MyHourlyAlarm extends HourlyAlarm {
    @Override
    public void onAlarm() {
        System.out.println("⏰ Hourly Alarm: It's time! --> " + java.time.LocalTime.now());


    }
}
public class AlarmScheduler {
    public static void main(String[] args) {
        HourlyAlarm alarm = new MyHourlyAlarm();
        alarm.startAlarm();

       
        try {
            Thread.sleep(3 * 60 * 60 * 1000); // Let it run for 3 hours
            alarm.stopAlarm();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
