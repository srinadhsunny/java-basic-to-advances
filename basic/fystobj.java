import java.util.Scanner;
class caluculator {
    public int add(int n1,int n2){
        return n1+n2;
    }
}
public class fystobj{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1 ");
        int n1=sc.nextInt();
        System.out.println("enter num 2");
        int n2 = sc.nextInt();
        caluculator calc= new caluculator();
        int result =calc.add(n1,n2);
        System.out.println("addition of two numbers is "+ result );

    }
}
