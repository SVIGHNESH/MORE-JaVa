import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Read {
    public static void main(String[] args) throws FileNotFoundException,IOException{
        FileReader fr = new FileReader("input.txt");
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while(( line = br.readLine()) != null){
            System.out.println(line);
        }
        br.close();
        

    }
}
