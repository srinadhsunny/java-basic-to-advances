import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class flmp {

    public static void main(String[] args) {
        List<Integer> a1 = Arrays.asList(1,2,3);
        List<Integer> a2 = Arrays.asList(4,5,6);
        List<Integer> a3 = Arrays.asList(7,8,9);
        List<List<Integer>> a = Arrays.asList(a1,a2,a3);

        List<Integer> l = a.stream()
        .flatMap(x ->x.stream())
        .collect(Collectors.toList());
        System.out.println(l);

        
    }
}
