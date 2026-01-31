import java.util.Scanner;
public class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        grocerymart cust1 = new grocerymart();
        grocerymart manish = new grocerymart("manish",9640642079L,"hyd",100);
        cust1.setname("sunny");
        cust1.setadres("hyd");
        cust1.setphnno(987654321);
        cust1.setacountbal(500);
        System.out.println("enter the amount");
        int amt=sc.nextInt();

        cust1.shop(amt);
    }
}
