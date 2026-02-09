// Exercise 1: The "Multi-Greeting" (Basics)
// Create a program where three different threads are running at the same time.
// Thread 1: Prints "Java" every 1 second.
// Thread 2: Prints "Full" every 2 seconds.
// Thread 3: Prints "Stack" every 3 seconds.
// Goal: Observe how the output overlaps in the console. This will help you see how the JVM schedules different threads.
public class main {

    public static void main(String[] args) {
        Thread t1 = new Greet("java", 1000);
        Thread t2 = new Greet("Full", 2000);
        Thread t3 = new Greet("Stack", 3000);
        t1.start();
        t2.start();
        t3.start();
    }
}
