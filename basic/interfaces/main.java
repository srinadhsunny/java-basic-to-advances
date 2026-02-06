public class main {
    public static void main(String[] args) {
        Icar myCar;//interface instances is created 
        myCar  = new Audi(true, "petrol");//myCar instances is used to assign the differnet cars(classes) to it 
        myCar.Engine();
        myCar.Fuel();
        myCar= new Benz(false, "Desil");//class(car) is changed to Benz
        myCar.Engine();
        myCar.Fuel();
    }
}
