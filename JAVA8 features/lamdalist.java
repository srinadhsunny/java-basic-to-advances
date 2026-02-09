import java.util.ArrayList;

public class lamdalist{
    public static void main(String[] args) {
       ArrayList<String> items = new ArrayList<>();
       items.add("hi");
       items.add("hello");
       items.add("how are you");
       items.forEach(n->
        System.out.println(n)
       );
    }
}
