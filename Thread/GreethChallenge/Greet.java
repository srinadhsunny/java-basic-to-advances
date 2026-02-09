public class Greet extends Thread{
    private String word;
    private int delay;
    public  Greet(String word,int delay){
        this.word=word;
        this.delay=delay;}

   public void run(){
     try{
        for(int i=0;i<5;i++){
            Thread.sleep(delay);
            System.out.println(word);
        }
    }
    catch(Exception e){
        System.out.println("interupted");
    }
   }
}
