import java.util.Scanner;
public class pattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num u wana start from");
        int num =sc.nextInt();
        for(int i=0;i<num;i++){
            for(int j=num-i;j>0;j--){
                System.out.print( j +" ");
            }
            System.out.println();
        }
        
    }
}
