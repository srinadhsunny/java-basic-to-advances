import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Treemapp{
    public static void main(String[] args) {
        TreeMap<Integer,String> t = new TreeMap<Integer,String>();
        t.put(1, "a");
        t.put(3, "c");
        t.put(5, "e");
        t.put(2, "b");
        System.out.println(t);//prints in an ascending orrder by defaullt
        Set s = t.entrySet();//converted in to set 
        Iterator i = s.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
            
        }

    }
}
