public class Counter  extends Thread{
     int count=0;
     public void run(){
        for(int i=0;i<10000;i++){
             increment();
        }
     }
     public void increment(){
        count++;
     }

    
}
/*"I've worked with shared resources where multiple threads incremented a common variable.
I observed a Race Condition where the final count was lower than expected because of Lost Updates.
 I resolved this by using the synchronized keyword to ensure atomicity, and used join() to ensure 
      the main thread waited for the completion of worker threads."*/
