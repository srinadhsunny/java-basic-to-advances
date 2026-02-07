// The Main Class:
// Create objects for both and call their methods.
public class main {

    public static void main(String[] args) {
        Manager m = new Manager("manish", 20000.0);
        m.calculateTotalSalary();
        Developer d = new Developer("danush", 20000.0);
        d.calculateTotalSalary();
    }
}
