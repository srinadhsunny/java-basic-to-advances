// Step 3: Create the Child (HighEndPhone)
// Extend Smartphone and add:

// Field: cameraMegapixels.

// Method: Override basicFunction() again to call the parent version, 
// then print "Face ID unlocking..."
public class HighEndPhone extends Smartphone{
    private String cameraMegapixels;
    public HighEndPhone(String brand,String power,String os,String cam){
        super(brand, power, os);
        this.cameraMegapixels=cam;
    }
    public String getcamPixels(){
        return this.cameraMegapixels;
    }
    public void setcamPixels(String cam){
        this.cameraMegapixels=cam;
    }
    public void basicFunction(){
        super.basicFunction();
        System.out.println("Face id unlocking");
    }
    
}
