// Child Class Manager:
// Calculates total as: baseSalary + (baseSalary * 0.20). (That's the 20% bonus).
public class Manager extends Employee {
    public Manager(String name,double base){
        super(name, base);
    }
    public void calculateTotalSalary(){
        double salary=super.getbase()+super.getbase()*0.20;
        System.out.println("total salary of Manager"+super.getname()+" is "+salary );
    }
}
