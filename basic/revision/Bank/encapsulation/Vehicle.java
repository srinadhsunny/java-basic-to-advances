// 🎭 Phase 3: Inheritance & Polymorphism
// Goal: Handle multiple forms of data.
// The Exercise: "The Vehicle Showroom"
// Create a base class Vehicle with a method startEngine().
// Create two subclasses: Car and Bike (like your Pulsar N150).
// Override startEngine() in both:
// Car should print: "Car starts with a key."
// Bike should print: "Bike starts with a button."
// In your Main class, create an Array Vehicle[] showroom = new Vehicle[2] and put one car and one bike inside.
// Use a for loop to call startEngine() for both.
public class Vehicle{
    public void startEngine(){
        System.out.println("vehicle engine is starting");
    }
}
