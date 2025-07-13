import java.io.FileWriter;
import java.io.IOException;

public class write {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("Student.txt");
        fw.write("alfjahf;jahlfkjahflkajfhlkajhflkjahf");
        fw.close();
    }
}
