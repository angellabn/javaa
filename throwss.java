import java.io.FileReader;
import java.io.FileNotFoundException;

public class throwss {

    static void readFile() throws FileNotFoundException{
      
        FileReader fr= new FileReader("sample.txt");
        System.out.println("file opened successfully");
    }
    public static void main(String[] args) {
        

        try{
            readFile();

        }catch(FileNotFoundException e){
            System.out.println("file not found");

        }
    }
}
