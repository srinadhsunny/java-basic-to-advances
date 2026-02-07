// Abstract Class Employee:
// private String name and private double baseSalary.
// A Constructor to initialize them.
// A method void showDetails() to print the name and base.
// An abstract method void calculateTotalSalary().
public abstract class Employee {
    private String name;
    private double baseSalary;
    public Employee(String name,double baseSalary){
        this.name=name;
        this.baseSalary=baseSalary;;
    }
    public void showDetails(String name,double baseSalary){
        System.out.println(name+ baseSalary);

    }
    public abstract void calculateTotalSalary();
    public double getbase(){
        return this.baseSalary;
    }
    public String getname(){
        return this.name;
    }

    
}
