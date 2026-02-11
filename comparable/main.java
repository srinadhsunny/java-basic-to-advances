import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main{
    public static void main(String[] args){
        ArrayList<Employee> e = new ArrayList<>();
        e.add(new Employee(1,"Sunny"));
        e.add(new Employee(8, "Srinadh"));
        e.add(new Employee(6, "budige"));
          
        Collections.sort(e);
        for(Employee e1 : e){
            System.out.println(e1.getname() +" "+ e1.getid());
        }
}
}
