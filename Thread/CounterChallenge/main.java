// Create a class called Counter.
// Give it a variable int count = 0.
// Create a method increment() that does count++.
// Start two threads that both call increment() 10,000 times on the same Counter object.
public class main{
    public static void main(String[] args) {
        Counter C = new Counter();//having one counter 
        Thread t1 = new Thread(C);//using thread 1 on the same counter c
        Thread t2 = new Thread(C);//using again the thread 2 on the same counter 
        t1.start();//Starting thread 1 to start
        t2.start();//thread 2 wil start 
        try {
            t1.join();
        t2.join();
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println("the final count is"+C.count);


    }
}
