import java.util.Scanner;
public class prime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to check");
        int n=sc.nextInt();
        boolean res=true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                res=false;
                break;
            }
    }
    System.out.println(res);

    }
}
