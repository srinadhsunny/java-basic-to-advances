import java.util.Scanner;
public class string{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String s1="its my fyst string";
        String s2="its my secound string"; 
        //adding two strings result in a concatinated string 
        System.out.println(s1+ " "+s2);
        int n1=45;
        System.out.println(s1+" "+s2+" "+n1);
        //when an int is added with string it treats int as a string and it just concatinates int to a string
        String s1 = "Java";               // In String Constant Pool
        String s2 = new String("Java");   // In Heap Memory

        // Using == (Address Comparison)
        System.out.println(s1 == s2);      // Output: false 
        // (Because one is in the Pool and the other is in the Heap)
        // Using .equals() (Content Comparison)
        System.out.println(s1.equals(s2)); // Output: true 
        // (Because both contain the characters 'J', 'a', 'v', 'a')
    }

    
}
