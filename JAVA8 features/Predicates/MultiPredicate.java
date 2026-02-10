//creating predicate to check a number is greater than 10 and less than 100
import java.util.*;
import java.util.function.Predicate;
public class MultiPredicate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number you wana check");
        int n = sc.nextInt();
        Predicate<Integer> gt_10= (num)->(num>10);
        Predicate<Integer> lt_100=(num)->(num<100);
        System.out.println(gt_10 .and (lt_100).test(n));//using two predicates at one 
        System.out.println(gt_10.negate().test(n));//rervse the output with the negate method
        
    }
}
