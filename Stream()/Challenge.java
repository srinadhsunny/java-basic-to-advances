import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Challenge {

    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("JAVA","sql","python");
        List<String> list3 = Arrays.asList("c++","c","mongo db");
        List<String> list2 = Arrays.asList("JAVA","Mongodb","csharp");
        List<List<String>> allList  =Arrays.asList(list1,list2,list3);
        List<String> updated = allList.stream()
        .flatMap(x->x.stream())
        .filter(s->s.length()>3 && Character.isUpperCase(s.charAt(0)))
        .distinct()
        .collect(Collectors.toList());
        System.out.println(updated);

       
    }
    
}
