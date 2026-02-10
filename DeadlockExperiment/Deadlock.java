public class Deadlock {
     public  static Object lock1 = new Object();
    public static Object lock2 = new Object();
    public static void main(String[] args){
       
        Thread t1 = new Thread(){
            public void run(){
        synchronized(lock1){
            System.out.println("lock 1 is with t1");
        
        System.out.println("waiting for the lock 2");
        try{
            Thread.sleep(2000);
        }catch(Exception e){
        }
        synchronized(lock2){
            System.out.println("lock2 is with t1");

        }
    }
    }
        };
        Thread t2 = new Thread(){
            public void run(){
        synchronized(lock2){
            System.out.println("lock 2 is wit t2 ");
        
        System.out.println("t2 is waiin gfor the lock1");
        try{Thread.sleep(2000);}
        catch(Exception e){}
        synchronized(lock1){
            System.out.println("lock 1 is with t2");
        }
    }
    }
    };
    t1.start();
    t2.start();
    }
}
