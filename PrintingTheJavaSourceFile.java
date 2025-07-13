import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PrintingTheJavaSourceFile {
    public static void main(String[] args) throws FileNotFoundException,IOException {
        FileReader fr = new FileReader("Read.java");
        BufferedReader br = new BufferedReader(fr);
        String file = "";

        System.out.println("The Source File Content of the Read.java is :");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        while ((file = br.readLine()) != null) {
                System.out.println(file);            
        }

        br.close();




    }
}
