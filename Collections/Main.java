import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;
public class Main {
    public static ShoppingCart c1 = new ShoppingCart();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        
        boolean exit=false;
        while (exit!=true) {
            printlist();
            System.out.println("enter your choice");
            int c = sc.nextInt();
            switch (c) {
                case 1:
                    additems(sc);
                    break;
                case 2:
                    printl();
                    break;
                case 3:
                    modify(sc);
                    break;
                case 4:
                    delete(sc);
                    break;
                case 5:
                    search(sc);
                    break;
                case 6:
                    exit =true;
                    System.out.println("thankk you");
                    break;


                default:
                    break;
            }
        }
    }
    
    

public static  void  printlist(){
        System.out.println("1:additems");
        System.out.println("2:printing list of items");
        System.out.println("3:To modify the list");
        System.out.println("4:to delete an item");
        System.out.println("5:to search an item");
        System.out.println("6:to exit from the list");


    }
    public static void additems(Scanner sc){
        sc.nextLine();;
        System.out.println("enter the object to add");
        String i =sc.nextLine();
        c1.additem(i);
        }
        public static void printl(){
            c1.printList();
        }
        public static void modify(Scanner sc){
            System.out.println("enter the position u wana modify");
            int position = sc.nextInt();
            sc.nextLine();
            System.out.println("enter the item youw wana replace");
            String  itemm = sc.nextLine();
            c1.modify(position,itemm);

        }
    public static void delete(Scanner sc){
        sc.nextLine();
        System.out.println("enter the inex you wana remove");
        int n=sc.nextInt();
        sc.nextLine();
        c1.delete(n);
    }
    public static void search(Scanner sc ){
        sc.nextLine();

        System.out.println("enter an item to search");
        String item = sc.nextLine();
        c1.searchItem(item);
    }

}
