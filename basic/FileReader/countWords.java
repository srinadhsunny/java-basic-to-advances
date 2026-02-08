import java.io.BufferedReader;
import java.io.FileReader;

public class countWords {

    public static void main(String[] args) {
        int count=0;
        try (FileReader fr = new FileReader("C:\\Users\\bsrin\\OneDrive\\Desktop\\java\\interfaces\\sample.txt");
        BufferedReader br = new BufferedReader(fr);){
            String c;
            while ((c=br.readLine())!=null) {
                String[] str = c.split(" ");
                for(String s:str){
                    count++;
                }
            }
             System.out.println(count);
        } catch (Exception e) {
            System.out.println("file not found");
        }

    }
}
