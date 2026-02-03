// Step 1: The Base Class (Hero.java)
// Field: String name.

// Constructor: To set the name.

// Method: public void usePower().

// Print: "Hero [name] uses a generic ability."
public class Hero{
    private String name;
    public Hero(String name ){
        this.name=name;
    }
    public void setname(String name){
        this.name =name;
    }
    public String getname(){
        return this.name;
    }
    public void usePower(){
        System.out.println("Hero"+ this.name+"uses a generic power");
    }


}
