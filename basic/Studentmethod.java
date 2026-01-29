import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;
public class Studentmethod{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the student name ");
        String sname=sc.nextLine();
        System.out.println("enter the student marks");
        int smarks=sc.nextInt();
        char grade =getgrade(sname,smarks);
        System.out.println("student name is " +sname +" and the student got "+ smarks+" marks "+"with grade "+ grade);

    }
    public static char getgrade(String sname,int smarks) {
       // char grade;
        if(smarks>=90 &&smarks<=100){
            return 'o';
        }else if(smarks>=80 &&smarks<90){
            return 'A';
        }
        else if(smarks>=70 &&smarks<80){
            return 'B';
        }
        else if(smarks>=60 &&smarks<70){
            return 'c';
        }
        return 'f';
    }
}
