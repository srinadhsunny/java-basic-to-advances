import java.util.Scanner;
public class reversenum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the number ");
        int num = sc.nextInt();
        int revnum=0;
        while (num>0) {
             revnum= 10*revnum+(num%10);
             num/=10;
            
        }
        System.out.println("reverse of number is "+ revnum);
        
    }
}
