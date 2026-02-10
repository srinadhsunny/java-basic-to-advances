import java.util.Scanner;;
interface testLeapp {
    public boolean test(int n);
}
public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year ");
        int n = sc.nextInt();
        testLeap t = (year)->{
            if((year%400==0)||(year%4==0)&&(year%100!=0)){
                return true;
            }else{
                return false;
            }
        };
        if (t.test(n)) {
            System.out.println("its a leapyear");
        } else {
            System.out.println("its not a leap year");
        }
        
    }
}
