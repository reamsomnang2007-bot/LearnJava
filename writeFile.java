import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class writeFile {
    public static void main(String[] args){

        // How to write file using java (4 popular option)

        // FileWriter = Good for small or medium-sized text files
        // BufferedWriter = Better performance for large amounts of text
        // PrintWriter = Better for structured data, like reports or logs
        // FileOutputStream = Best for binary files (e.g, images, audio, files)


        String filePath = "test.txt";
        String textContent = """
                Topic: "Should freedom of speech have limits?"
                - freedom of speech should have limits
                - freedom of speech should not have limits
                """;
        try(FileWriter writer = new FileWriter(filePath)){
            writer.write(textContent);
            System.out.println("Files has been written");

        }
        catch(FileNotFoundException e){
            System.out.println("Could not locate file location");
        }
        catch(IOException e){
            System.out.println("Could not write file");
        }
    }
}
