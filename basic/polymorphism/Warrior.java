// Step 2: The Subclasses
// Create three separate classes that all extend Hero. Use a constructor
//  in each to pass a name (like "Thor" or "Doctor Strange") up to the parent.

// Warrior: Overrides usePower() to print: "[name] swings a sword!"

// Mage: Overrides usePower() to print: "[name] casts a fireball!"

// Healer: Overrides usePower() to print: "[name] uses healing light!"
public class Warrior extends Hero{
    public Warrior(String name){
        super(name);
    }

    public void usePower(){
        System.out.println("Hero  "+getname()+"uses swings a sword");
    }
    
}
