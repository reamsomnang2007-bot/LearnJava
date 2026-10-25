import java.io.FileWriter;
import java.io.IOException;
public class testFile{
    public static void main(String[] args){
        String filePath = "text.txt";
        String textContent = """
            Hello World
            Welcome to Java Course
            Today We're going to talk about How to write file in java
        """;
        
        try(FileWriter writer = new FileWriter(filePath)) {
            writer.write(textContent);
            System.out.println("File has been written!");
            
        } 
        catch (IOException e) {
            System.out.println("Could not write file!");
        }

    }
}