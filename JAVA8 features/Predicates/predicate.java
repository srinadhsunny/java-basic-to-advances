import java.util.*;
import java.util.function.Predicate;
public class predicate{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an int to check");
        int n = sc.nextInt();
        sc.nextLine();
        Predicate <Integer> gt = (num)->(n>10);
        System.out.println(gt.test(n));
        System.out.println("enter the String to check");
        String s = sc.nextLine();
        Predicate<String> scheck = Predicate.isEqual("Prepinsta");
        System.out.println(scheck.test(s));
    }
}
