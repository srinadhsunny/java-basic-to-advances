// If the total bill is more than Rs 1000, apply a 10% discount.

// If it is more than Rs 5000, apply a 25% discount.

// Print the final bill amount.
import java.util.Scanner;
public class price{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the price");
        int price = sc.nextInt();
        if(1000<price&&price<5000){
            double bill=price-((10*price)/100);
            System.out.println("final bill is "+bill);
        }else if(5000<price){
            double bill=price-((25*price)/100);
            System.out.println("final bill is "+ bill);
        }
    }
}
