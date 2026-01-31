import java.util.Scanner;

public class grocerymart{
    private String customerName;
    private String customeraddres;
    private long phnno;
    private int actbal;
    public  grocerymart(String name,long phn,String add,int actbal){
        this.customerName=name;
        this.phnno=phn;
        this.customeraddres=add;
        this.actbal=actbal;
        System.out.println(this.customerName+"account  created ");
        
    }
    public  grocerymart() {
        this.customerName="defname";
        this.actbal=100;
        this.customeraddres="def address";
        this.phnno=000000000;
        
    }
    public void setname(String name){
        this.customerName=name;
    }
    public void setacountbal(int bal){
        this.actbal=bal;
    }
    public  void setadres(String adress){
        this.customeraddres=adress;
    }
    public void setphnno(long phnno){
        this.phnno=phnno;
    }
    public String getname(){
        return this.customerName;
    }
    public int getbal(){
        return this.actbal;
    }
    public  String getadres(){
        return this.customeraddres;
    }
    public Long getphnno(){
        return this.phnno;
    }
    public void shop(int amount){
        Scanner sc = new Scanner(System.in);
        if(amount<=actbal){
            System.out.println("thanks for shoping and your remaining bal is "+ (this.actbal-amount));
            this.actbal-=amount;
        }else{
            System.out.println("insuffient balances please recharge");
            System.out.println("enter the amount u wwant to recharge");
            int amt=sc.nextInt();
            recharge(amt);
        }
    }
     public void recharge(int amount){
        this.actbal+=amount;
        System.out.println("succesfully recharged ur account balances is "+ this.actbal);
    }
    
}
