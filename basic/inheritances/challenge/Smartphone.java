// Step 2: Create the Parent (Smartphone)
// Extend Device and add:

// Fields: operatingSystem (e.g., Android/iOS).

// Method: Override basicFunction() to call
//  super.basicFunction() and then print "Loading home screen..."
public class Smartphone extends Device{
    private String os;
    public Smartphone(String brand ,String powerType,String os){
        super(brand, powerType);
        this.os=os;
    }
    public String getOs() {
        return os;
    }
    public void setOs(String os) {
        this.os = os;
    }
    public void basicFunction(){
        super.basicFunction();
        System.out.println("Loading home Screen");
    }

    
}
