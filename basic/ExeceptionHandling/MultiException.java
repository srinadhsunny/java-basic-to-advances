import java.security.PublicKey;

public class multiException{
    public static void main(String[] args) {
        int x=20;
        int y=0;
        // divideLBYL(x,y);
        divideEAFP(x, y);
       
    }
    //  public static void divideLBYL(int x, int y){
    //         if(y!=0){
    //             System.out.println(x/y);
    //         }else{
    //             System.out.println(0.0);
    //         }
    // }
    public static void divideEAFP(int x, int y){
        try{
            System.out.println(x/y);

        }catch(ArithmeticException e){//subClass exxception should be called fyst 
            System.out.println("Arthematic exception caught");
        }catch(Exception e){//super class exception 
            System.out.println(0 );
        }

    }
}
