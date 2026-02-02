public class car extends auto{
     private String  stearingwheel;
     private int seatingcap;
     public car(String color, String power, int milage, int yearOfManufactor, String stearingwheel, int seatingcap) {
        super(color, power, milage, yearOfManufactor);//super() -bcz these come from parent 
        this.stearingwheel = stearingwheel;
        this.seatingcap = seatingcap;
     }
     public String getStearingwheel() {
         return stearingwheel;
     }
     public void setStearingwheel(String stearingwheel) {
         this.stearingwheel = stearingwheel;
     }
     public int getSeatingcap() {
         return seatingcap;
     }
     public void setSeatingcap(int seatingcap) {
         this.seatingcap = seatingcap;
     }
     public void movement(){
        super.movement();//movement method is extendded from parent with super keyword
        System.out.println("car moves");
        
     }
     public void carmovement(){
        // super.movement();
        System.out.println("car is moving");
     }
     
}
