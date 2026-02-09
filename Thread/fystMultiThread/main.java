public class main{
    public static void main(String[] args) {
        Thread SecThread = new SecoundThread();
        SecThread.start();//its excuted the secund thread in parallel which is a new thread created 
        System.out.println("this  main thread is running with out stop ");//this is excuted from the main thread 
    }
}
