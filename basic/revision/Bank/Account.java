// The Exercise: "The Bank Account"

// Create a class Account with a private double balance.

// Write a constructor to set the initial balance.

// Provide a public method deposit(double amount) and withdraw(double amount).

// Logic Check: In the withdraw method, ensure the user cannot withdraw more than they have. 
// If they try, print "Insufficient Funds."
public class Account{
    private double balance;
    public Account(){
        this.balance=0.00;
    }
    public void deposit(double amount){
        this.balance+=amount;
    }
    public void withdraw(double amount){
        if(amount<this.balance){
            double bal=(this.balance-amount);
            System.out.println("Succesfully withdrawn the balances is "+ bal);
        }else{
            System.out.println("insufficient balances");
        }
    }
    
}
