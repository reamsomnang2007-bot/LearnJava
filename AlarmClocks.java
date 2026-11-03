import java.time.LocalTime;
public class AlarmClocks implements Runnable{

    private final LocalTime alarmTime;
    AlarmClocks(LocalTime alarmTime){
        this.alarmTime = alarmTime;
    }
    @Override
    public void run(){
        LocalTime now = LocalTime.now();
        System.out.println(now);
    }
}
