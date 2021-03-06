
package kata3;
import java.io.*;
import java.util.*;

public class MailReader {
    public static ArrayList<String> readDomains(String filename){
        ArrayList<String> list = new ArrayList<>();
        try{
            BufferedReader reader = new BufferedReader(new FileReader(new File(filename)));
            while(true){
                String mail = reader.readLine();
                if(mail==null) break;
                if(!mail.contains("@"))continue;
                list.add(mail.split("@")[1].toLowerCase());
            }
        }
        catch(FileNotFoundException ex){
            
        }
        catch(IOException ex){
            
        }
        return list;
    }
    
}
