public class BankAccount {
    String name;
    double balance;
    double transactionFee = 0.00;
    
    public BankAccount(String name) {
        this.balance = 0.0;
        this.name = name;
    }
    
    public void deposit(double amount) {
        balance += amount;
    }
    
    public void withdraw(double amount) {
        if (balance - (amount + transactionFee) > 0) {
            balance -= amount + transactionFee;
        }
    }
    
    public void transfer(BankAccount other, double amount) {
        transactionFee = 5.0;
        if (this.balance > transactionFee){
            if (amount > this.balance - transactionFee) {
                other.balance += this.balance - transactionFee;
                this.balance = 0;
            }
            else {
                other.balance += amount;
                this.balance  -= amount + transactionFee;
            }
            
        }
    }
    
    public String toString() {
        return (this.name + ", $" + this.balance);
    }
}