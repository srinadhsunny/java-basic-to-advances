import java.util.Scanner;
public class n_th_table{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number for which youu want to print the table");
        int n=sc.nextInt();
        printtable(n);

    }
    public static void printtable(int n){
        for(int i=00;i<=10;i++){
            System.out.println(n+ " x " +i+" = "+ n*i );
        }
    }

}
