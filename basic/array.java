import java.util.Scanner;
public class array{
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of an array");
    int n=sc.nextInt();
    int[] myary = new int[n];
    System.out.println("enter the elements in  an array");
    for(int i=0;i<n;i++){
        myary[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
        System.out.print(myary[i]+ " ");
    }
   }
}
