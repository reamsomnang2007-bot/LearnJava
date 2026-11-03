import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class alarm_clock {
    public static void main(String[] args){

        // java alarm clock
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null;
        String filePath = "your-phone-linging-yo-phone-lingin-funny-asian-ringtones-128-made-with-v-62126.wav";

        while(alarmTime == null) {
            try {
                System.out.print("Enter an alarm time (HH:MMSS) : ");
                String inputTime = scanner.nextLine();

                alarmTime = LocalTime.parse(inputTime, formatter);
                System.out.println("Alarm set for : " + alarmTime);
            } catch (DateTimeParseException e) {
                System.out.println("Invalid format. Please use HH:MM:SS!");

            }
        }
        alarm alarmClock = new alarm(alarmTime, filePath, scanner);
        Thread alarmThread = new Thread(alarmClock);
        alarmThread.start();

    }
}
