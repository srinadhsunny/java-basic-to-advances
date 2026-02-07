// Child Class Developer:
// Calculates total as: baseSalary + 10000. (The fixed bonus).
public class Developer extends Employee{
    public Developer(String name,double baseSalary){
        super(name, baseSalary);
    }
    public void calculateTotalSalary(){
        double salary = super.getbase()+10000;
        System.out.println("total salary of developer "+super.getname()+" is "+ salary);
    }
}
