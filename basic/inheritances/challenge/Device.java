// Step 1: Create the Grandparent (Device)
// Create a class Device with:

// Fields: brand and powerType (e.g., Battery or Plug-in).

// Method: basicFunction() that prints "Device is turning on."
public class Device{
    private String brand;
    private String powerType;
    public  Device(String brand,String power){
        this.brand = brand;
        this.powerType=power;

    }
    public String getbrand(){
        return this.brand;
    }
    public void setbrand(String brand){
        this.brand=brand;
    }
    public String getpowerType(){
        return this.powerType;
    }
    public void setpowerType(String powerType){
        this.powerType=powerType;
    }
    public void basicFunction(){
        System.out.println("Device is running");
    }
    
}
