import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Hashset{
    public static void main(String[] args) {
        Set<Integer> value1 = new HashSet<>();
        value1.addAll(Arrays.asList(new Integer[]{1,2,3,4,5}));
        Set<Integer> value2 = new HashSet<>();
        value2.addAll(Arrays.asList(new Integer[]{1,2,4,5,7,8,9}));
        //intersection of value 1 and value 2
        Set<Integer> intersection = new HashSet<>(value1);
        System.out.println("intersection");
        intersection.retainAll(value2);
        System.out.println(intersection);
        //union set
        Set<Integer> union = new HashSet<>(value1);
        System.out.println("union");
        union.addAll(value2);
        System.out.println(union);
        //differnces 1 value 1- value 2
        Set<Integer> diff1 = new HashSet<>(value1);
        diff1.removeAll(value2);
        System.out.println("differneces 1"+ diff1);
        //differences  2
        Set<Integer> diff2 = new HashSet<>(value1);
        diff2.removeAll(value2);
        System.out.println("diff2 "+ diff2);


 

    }
}
