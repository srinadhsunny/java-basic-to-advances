class parent {
    public void displayMethod(){
        System.out.println("super classs is executed");
    }
}
 class subclass extends parent {
    public void displayMethod(){
        super.displayMethod();//executes display method from super 
        System.out.println("subClasss is executed");
    }
}
public class superclass{
    public static void main(String[] args) {
        subclass s =new subclass();
        s.displayMethod();
    }
    
}
