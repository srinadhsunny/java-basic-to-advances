import java.util.ArrayList;

public class ShoppingCart{
    public ArrayList<String>  shoppingcart= new ArrayList<>();
    public void additem(String item) {
        shoppingcart.add(item);
    }
    public void printList(){
        System.out.println("the list is having "+ shoppingcart.size()+"items");
        for(int i=0;i<shoppingcart.size();i++){
            System.out.println(shoppingcart.get(i));
        }
    }
    public void modify(int position,String item){
        shoppingcart.set(position, item);
    }
    public void delete(int position){
        shoppingcart.remove(position);
    }
    public void searchItem(String item){
         int index=shoppingcart.indexOf(item);
         if(index!=-1){
            System.out.println("the index of the item is "+ index);
         }else{
            System.out.println("item not found");
         }
        }
    
}
