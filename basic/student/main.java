import java.util.Scanner;
public class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        student s2 = new student();
        System.out.println(s2.getname()+ " "+s2.getrollno()+" "+s2.getstandard()+" "+s2.getsec());
        student s1 = new student("sunny",12);
        System.out.println(s1.getname()+" "+s1.getrollno()+" "+s1.getstandard()+" "+s1.getsec());
        
        student s3= new student("srinadh",20,14,"B");
        System.out.println(s3.getname()+" "+s3.getrollno()+" "+s3.getsec()+" "+s3.getstandard());
    }
}
