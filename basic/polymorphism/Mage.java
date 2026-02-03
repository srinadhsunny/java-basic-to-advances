public class Mage extends Hero{
    public Mage(String name){
        super(name);
    }

    public void usePower(){
        System.out.println("Hero  "+getname()+"casts a firewall");
    }
    
}
