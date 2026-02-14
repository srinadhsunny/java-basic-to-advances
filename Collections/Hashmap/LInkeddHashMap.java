import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class LInkedHashMap{
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> lk = new LinkedHashMap<Integer,String>();
        lk.put(1, "a");
        lk.put(2,"b");
        lk.put(3, "c");
        System.out.println(lk);//order of insertion is matched 
        Set lks= lk.entrySet();//map is converted in a set using entryset
        Iterator i = lks.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
