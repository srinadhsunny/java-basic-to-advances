// import java.util.Scanner;
public class Audi implements Icar {
    // Scanner sc = new Scanner(System.in);
    boolean engine;
    String fuel;
    public Audi(boolean engine,String fuel){
        this.engine=true;
        this.fuel=fuel;
    }

    @Override
    public void Engine() {
        if (engine==true){
        System.out.println("this is the audi engine and is on" );
        }else {
            System.out.println("this is the audi engine and is off" );
        }
        
    }

    @Override
    public void Fuel() {
        // TODO Auto-generated method stub
        System.out.println("the fuel type is "+ fuel);
        
    }

    @Override
    public void Rating() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void Tyres() {
        // TODO Auto-generated method stub
        
    }

    
}
