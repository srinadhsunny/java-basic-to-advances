import java.util.Iterator;
import java.util.TreeSet;

public class Treesett{
    public static void main(String[] args) {
        TreeSet<String> t = new TreeSet<>();
        t.add("apple");
        t.add("zebra");
        t.add("cat");
        t.add("pineapple");
        t.add("banana");
        System.out.println(t);//prints in an order [A-z-a-z]
        Iterator i = t.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
