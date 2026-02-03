// Your Objectives:
// Create Two Different Objects:

// One Smartphone object (e.g., a "Nokia").

// One HighEndPhone object (e.g., a "Samsung" or "iPhone").

// The "Chain" Test:

// Call .basicFunction() on the Smartphone and observe how many lines it prints.

// Call .basicFunction() on the HighEndPhone and observe how many lines it prints.

// The "Data" Test:

// Use your Getter methods to print out a sentence like: "My phone brand is [brand] and it has a [cameraMegapixels] camera." * Hint: Remember that to get the brand from a HighEndPhone,
//  you have to call a method that was actually defined in the Device class!
public class main {
    public static void main(String[] args) {
    Smartphone nokia = new Smartphone("nokia", "plugin", "oxygen");
    HighEndPhone samsung = new HighEndPhone("samsung", "wireless", "android 16", "200mpx");
    // The samsung object is of type HighEndPhone, but getbrand() is defined way up in the Device class.
    //  Because of inheritance, the HighEndPhone is a Device.
    nokia.basicFunction();
    System.out.println("-------------------");
    samsung.basicFunction(); 
    System.out.println("-------------------");
    System.out.println("my phone brand is"+samsung.getbrand()+ " and it has a camera"+samsung.getcamPixels()); 
    }
}
