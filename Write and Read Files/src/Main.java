import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        // How to write a file using Java (4 popular options)

        // FileWriter = Good for small or medium-sized text files
        // BufferedWriter = Better performance for large amounts of text
        // PrintWriter = Best for structured data, like reports or logs
        // FileOutputStream = Best for binary files (e.g., images, audio files)

        // First write file at Module
        try (FileWriter writer =new FileWriter("text.txt")){

            writer.write("I Love Pizza\nAnd i love meet");
            System.out.println("Write Successfully");
        }
        catch (IOException e)
        {
            System.out.println("Error can't write it");
        }
        finally { // Not important
            System.out.println();
        }
        // Second write at Desktop

        String path="C:\\Users\\DELL\\Desktop\\Read&Write\\text.txt";
        String text="I Love Pizza\nI love play Football\nI love Dodo\nThanks";

        try (FileWriter writer=new FileWriter(path)){

            writer.write(text);
            System.out.println("Write Successfully");
        }
        catch (IOException e)
        {
            System.out.println("Error can't write it");
        }

        System.out.println();

        // Wrong Path
        try (FileWriter writer=new FileWriter("C:\\Users\\DELL\\Deskto\\Read&Write\\text.txt")){

            writer.write(text);
            System.out.println("Write Successfully");
        }
        catch (IOException e)
        {
            System.out.println("Error can't write it");
        }

        System.out.println();

        // If u need to write a multiple line like a poem ... u can use triple cute
        String path2="C:\\Users\\DELL\\Desktop\\Read&Write\\text2.txt";
        String text2= """
        I Love Pizza
        I love play Football
        I love DodoThanks
        I love people
        ...
        """;

        try (FileWriter writer=new FileWriter(path2)){

            writer.write(text2);
            System.out.println("Write Successfully");
        }
        catch (IOException e)
        {
            System.out.println("Error can't write it");
        }

        System.out.println();
        /// //////////////////////////////////////////////////////////////////////////////////////////////////////////

        // How to read a file using Java (3 popular options)

        // BufferedReader + FileReader: Best for reading text files line-by-line
        // FileInputStream: Best for binary files (e.g., images, audio files)
        // RandomAccessFile: Best for read/write specific portions of a large file

        try (BufferedReader reader=new BufferedReader(new FileReader(path2))){

            String line;
            while ((line= reader.readLine())!=null)
            {
                System.out.println(line);
            }
        }
        catch (IOException e)
        {
            System.out.println("Can't find File");
        }


    }
}