//here dead lock occurs bcz for t1 it got lock 1 and for t it got lock 2 when t1 is sleeping so when t1 awakes and waiting for the lock 2 its dead lock
public class DeadlockExperiment1 {

    public static Object lock1 = new Object();
    public static Object lock2 = new Object();
    public static void main(String[] args){
        Thread t1 = new Thread(){
        public void run(){
            synchronized (lock1){
                System.out.println("t1 is with lock1");
            try{
                Thread.sleep(2000);
            }catch(Exception e){}
            System.out.println("waiting for lock 2");
            synchronized(lock2){
                System.out.println("t1 got lock 2 and lock 1");
            }
        }
        }

        };
    
        Thread t2 = new Thread(){
        public void run(){
            synchronized(lock2){
                System.out.println("t2 is having lock 2 ");
            try{
                Thread.sleep(2000);
            }catch(Exception e){

            }
            System.out.println("waiting for the lock 1");
            synchronized(lock1){
                System.out.println("it got both the lock 1 and lock 2 ");
            }
            }
        }

        };
        t1.start();
        t2.start();
    }
}
