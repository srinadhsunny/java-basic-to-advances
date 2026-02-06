public class Benz implements Icar {
    private boolean engine;
    private String fuel;
    public Benz(boolean engine,String fuel){
        this.engine = engine;
        this.fuel= fuel;
    }
    public void Engine(){
        if (engine) {
            System.out.println("this is engine of Benz and is on");
        } else {
            System.out.println("this is engine of Benz and the engine is off");
        }
    }
    public void Fuel(){
        System.out.println("the fuel type is " + fuel);
    }
    public void Rating(){

    }
    public void Tyres(){

    }

    
}
