// The Outer Class: SmartBuilding

// Add a private String buildingName and a private boolean powerOn.

// Add a Constructor to set the buildingName and set powerOn = true.

import java.lang.classfile.Superclass;

public class SmartBuilding{
    private String buildingName;
    private boolean powerOn;
    public SmartBuilding(String buildingName,boolean powerOn){
        this.buildingName= buildingName;
        this.powerOn=powerOn;
    }
//     The Inner Class: SecuritySystem

//  Add a method void checkStatus().
// The Logic: Inside checkStatus(), access the outer class variables.
// If powerOn is true, print: "Security System for [buildingName] is ACTIVE."
// If powerOn is false, print: "Warning: Power is OFF in [buildingName]!"
public class SecuritySystem{
    public void checkStatus(){
        if (powerOn) {
            System.out.println("Security System for "+ buildingName+" is ACTIVE.");
        } else {
            System.out.println("Warning power is OFF in "+buildingName);
        }
    }

}
}
