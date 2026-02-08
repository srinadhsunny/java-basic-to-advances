import java.io.FileReader;
import java.io.IOException;

public class main{
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("C:\\Users\\bsrin\\OneDrive\\Desktop\\java\\interfaces\\sample.txt")){
        int i;
        while ((i=fr.read())!=-1) {
            System.out.print((char)i);
        }}
        catch(IOException e){
            System.out.println("file not found");

        }
    }
}
