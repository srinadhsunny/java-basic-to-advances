import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class data{
    String name;
    int id;
    float percentage;
    public data(String name,int id,float percentage){
        this.name=name;
        this.id=id;
        this.percentage=percentage;
    }
}
public class Streams1 {

    public static void main(String[] args) {
        List<data> Studentdata = new ArrayList<data>();
        Studentdata.add(new data("sunny", 1,56.5f));
        Studentdata.add(new data("Sri", 2, 45.5f));
        Studentdata.add(new data("Srinadh", 3, 60.4f));
        Studentdata.add(new data("Srinadhsunny", 4, 30.6f));
        List<Float> filterd= Studentdata.stream()
        .filter(p->p.percentage>50)
            .map(p->p.percentage)
            .collect(Collectors.toList());
            System.out.println(filterd);
        List<Integer> idfilter = Studentdata.stream()
        .filter(n->n.id>2)
        .map(n->n.id)
        .collect(Collectors.toList());
        System.out.println(idfilter);

    
    }
}
