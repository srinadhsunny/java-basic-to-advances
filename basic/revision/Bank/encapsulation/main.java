public class main {

    public static void main(String[] args) {
        Vehicle[] den = new Vehicle[2];
        den[1]= new car();
        den[0]= new Bike();
        for(Vehicle v:den){
            v.startEngine();
        }
    }
}
