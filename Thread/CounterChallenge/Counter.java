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
