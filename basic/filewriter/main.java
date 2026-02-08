// If you want to add to the existing text instead of deleting it, use: new FileWriter("fystFile", true);
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.lang.classfile.BufWriter;

public class main{
    public static void main(String[] args) {
        try(FileWriter fw = new FileWriter("fystFile");
         BufferedWriter bw = new BufferedWriter(fw)){
            bw.write(99);
            bw.newLine();//changes to new line
            bw.write("hlo this is srinadh writing this file using a buffered writer ");

        } catch (Exception e) {
            System.out.println("file not created");
        }

    }
}
