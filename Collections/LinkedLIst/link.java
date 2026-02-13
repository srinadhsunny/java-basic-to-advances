import java.util.Iterator;
import java.util.LinkedList;

public class link{
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<String>();
        myList.add("Apple");
        myList.add("ball");
        myList.add("cat");
        myList.add("elephant");
        printlist(myList);
        myList.add(3,"Dog");//here we are adding the dog into the list but doesnt effect the compilation much bcz it just modify the pointer of previous.
        printlist(myList);

    }
    public static void printlist(LinkedList<String> lk){
        Iterator<String> I = lk.iterator();
        while (I.hasNext()) {
            System.out.println(I.next());
        }
        System.out.println("_____________________________");

    }
}
