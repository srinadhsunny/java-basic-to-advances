import java.lang.invoke.StringConcatFactory;
import java.security.PublicKey;

public class Employee implements Comparable<Employee>{
    private int id;
    private String name;
    
    public Employee(int id,String name){
        this.id= id;
        this.name=name;
    }
    @Override
    public int compareTo(Employee o) {
        return this.id-o.id;
    }
    public String getname(){
        return name;
    }
    public int getid(){
        return id;
    }
}
