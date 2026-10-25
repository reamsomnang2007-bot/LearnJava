import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class testWriteFile {
    public static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in)){
            String filePath;
            String textContent;
            System.out.print("Enter the file : ");
            filePath = scanner.nextLine();
            System.out.print("Enter the text you want to write : ");
            textContent = scanner.nextLine();
            filePath = filePath + ".txt";
            try(FileWriter writer = new FileWriter(filePath)){
                writer.write(textContent);
                System.out.println("The file has been written!");
            }
            catch(FileNotFoundException e){
                System.out.println("Could not locate file location!");
            }
            catch(IOException e){
                System.out.println("Could not write file!");
            }
        }

    }
}
