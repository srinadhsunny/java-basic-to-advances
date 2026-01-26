import java.util.Scanner;
public class armstrong{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the number");
        int num=sc.nextInt();
        int a=num;
        int result =0;
        while(a>0){
            result =result+(a%10)*(a%10)*(a%10);
            a/=10;
        }
        System.out.println(result==num);
        
    }
}
