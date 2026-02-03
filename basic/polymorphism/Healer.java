public class Healer extends Hero {
    public Healer(String name ){
        super(name);
    }
    public void usePower(){
        System.out.println("hero "+ getname()+"using the healing light");
    }
    
}
