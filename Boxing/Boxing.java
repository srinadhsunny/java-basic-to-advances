import java.lang.reflect.Array;
import java.util.ArrayList;

public class Boxing{
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        //here we are using Integer which is class and i does auto boxing by just using .add it automatically creataes obj for the value we add and reverse when we use.get
       for(int i=0;i<=10;i++){
         myList.add(i);//this is autoboxing for every iteration int value of i is stored with ob =j in array list mylist
       }
       for(int i=1;i<=10;i++){
        System.out.println(myList.get(i));//unboxing this work to get object and gives as an int value 
       }
    }
    
    
}
