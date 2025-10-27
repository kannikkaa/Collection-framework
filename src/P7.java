class BankAccount {
    public int balance;
    public BankAccount(int balance){
        this.balance = balance;
        System.out.println("good morning");
    }
    public int deposit(int cheque) {
        balance += cheque;
        return balance;
    }
    public int withdraw(int cash) {
        System.out.println("not possible");
return balance;
    }
}
class SavingsAccount extends BankAccount{
int interestRate;
SavingsAccount(int balance, int interestRate){
    super(balance);
    this.interestRate= interestRate;
    System.out.println("friends");
}
public int withdraw(int cash){
    balance -= cash;
    return balance;
}
}
    public class P7 {
    public static void main(String[] args) {
        BankAccount hdfc = new SavingsAccount(25000, 5);
int cheque = 10000;
int cash = 5000;
        System.out.println("balance after deposit: "+hdfc.deposit(cheque));
        System.out.println("balance after withdrawal is "+hdfc.withdraw(cash));
    }
}
