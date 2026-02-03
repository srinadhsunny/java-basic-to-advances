// The Mission:
// Create a class called Main.

// Inside public static void main, create an array of type Hero with size 3.

// Put a new Warrior("Thor"), new Mage("Strange"), and new Healer("Mercy") into the array slots.

// Use a for loop to make each one use their power.

import java.lang.reflect.Array;

public class main{
    public static void main(String[] args) {
        Hero[] Squad = new Hero[3];
        Squad[0]= new Warrior("warrior vardhan");
        Squad[1]= new Mage("mage mahesh");
        Squad[2]= new Healer("healer harish");
        for( int i=0;i<Squad.length;i++){
            Squad[i].usePower();
            System.out.println();

        }

    }
}
