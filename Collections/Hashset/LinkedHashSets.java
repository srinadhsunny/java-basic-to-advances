import java.util.Iterator;
import java.util.LinkedHashSet;
public class LinkedHashSets{
    public static void main(String[] args) {
        LinkedHashSet<String> lks = new LinkedHashSet<String>();
        lks.add("hi");
        lks.add("helo");
        lks.add("we are ");
        lks.add("learning");
        lks.add("JAVA");
        Iterator i = lks.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
            //it maintain the order wwith use of doubly linked list for order so its slower than normal HashSet
            
        }
    
    }
}
