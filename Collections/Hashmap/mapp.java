import java.util.HashMap;
import java.util.Map;

public class mapp{
    public static void main(String[] args) {
        Map<String,String> m = new HashMap<>(); 
        m.put("Satish", "hod Ece");
        m.put("chakrapani", "ss");
        m.put("satanarayana", "eca");
        printmap(m);
        m.remove("satish");
        printmap(m);
        System.out.println("_____");
        m.replace("chakrapani", "hod Ece");
        printmap(m);
        System.out.println("_______");
        m.replace("Satish", "dean");
        printmap(m);

    }
    public static void printmap(Map<String,String> m){
        for(String key:m.keySet()){
            System.out.println(key+ "--"+m.get(key));
        }
    }
}s
