import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Main{
    public static void main(String[] args) {
        String filePath = "reviewWriteFile.txt";
        String textContent = """
                Today I'm going to review 
                The lesson write and read file
                in Java full course for free
                """;
        try(FileWriter writer = new FileWriter(filePath)){
            System.out.println("Have been written file!");
            writer.write(textContent);
        }
        catch(FileNotFoundException e){
            System.out.println("Could not locate file");
        }
        catch(IOException e){
            System.out.println("Could not written file");
        }


    }
}