import java.util.*;
import java.util.function.Function;
public class Function1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Function<Integer,Integer> f = i->i*i;
        Function<String,Integer> f1= s->s.length();
        System.out.println("enter the number you wana square it ");
        int n = sc.nextInt();
        System.out.println("the square of "+ n + " is"+ f.apply(n));
        sc.nextLine();
        System.out.println("enter the  String you wana know the length ");
        String s=sc.nextLine();

        System.out.println("thelength is  "+ f1.apply(s));

    }
}
