import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
public class musicPlayer {
    static void main(){

        String filePath = "your-phone-linging-yo-phone-lingin-funny-asian-ringtones-128-made-with-v-62126.wav";
        File file = new File(filePath);

        try(Scanner scanner = new Scanner(System.in);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String response = "";
            while(!response.equals("Q")){

                System.out.println("-----<[ MUSIC PLAYER ]>-----");
                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");
                System.out.println("----------------------------");
                System.out.print("Enter your choice : ");
                response = scanner.next().toUpperCase();

                switch(response){
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> {
                        clip.close();
                        System.out.println("Thank you for using. Good bye!");
                    }
                    default -> System.out.println("Invalid choice. Please try again!");
                }
            }

        }
        catch(FileNotFoundException e){
            System.out.println("Could not found locate file!");
        }
        catch(IOException e){
            System.out.println("Something went wrong!");
        }
        catch(UnsupportedAudioFileException e){
            System.out.println("Audio file unsupported!");
        }
        catch(LineUnavailableException e){
            System.out.println("Line Unvailable!");
        }


    }
    
}
