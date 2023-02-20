// С помощью Java создать файл file.txt, и записать в него слово TEST 100 раз.

// import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
// import java.io.Writer;

public class EX2
{
    public static void main(String[] args)
    {
        try(FileWriter file = new FileWriter("file.txt", false))
        {
            StringBuilder temp = new StringBuilder();
            for(int i = 0; i < 100; i++)
            {
                temp.append("TEST ");
            }
            String test = temp.toString();
            file.write(test);
            file.flush();
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        } 
    }
}
