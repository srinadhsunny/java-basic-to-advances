import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class challenge1 {

    public static void main(String[] args) {
        try(
            BufferedReader br  = new BufferedReader(new FileReader("C:\\Users\\bsrin\\OneDrive\\Desktop\\java\\interfaces\\sample.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("fystfile"))) {
            String Line;
            while ((Line=br.readLine())!=null) {
                Line =Line.toUpperCase();
                bw.write(Line);
                bw.newLine();
            }

            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
