public class SecoundThread extends Thread {
    public void run(){
        System.out.println("secound thread is called and is excuting now ");
        try{
        Thread.sleep(5000);
        System.out.println("this threead slept for 5 secs");
    }
    catch(Exception e){
        System.out.println("interuupted");
    }

}
}
