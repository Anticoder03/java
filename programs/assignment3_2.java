//Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw().
//Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the account balance
//falls below one hundred.
class BankAccount{
    int ac_no,bal;
    String name,type;
    public void deposit(int amount){
        System.out.println("Amount deposited.");
        bal += amount;
        System.out.println("Balance is: " + bal);
    }
    public void withdraw(int amount){
        System.out.println("Amount withdraw.");
        bal -= amount;
        System.out.println("Balance is: " + bal);
    }
}
class Saving extends BankAccount{
    Saving(int ac,int balance,String n){
        ac_no = ac;
        bal = balance;
        name = n;
        type = "Saving";
    }
    public void withdraw(int amount) {
        if((bal - amount) <= 100){
            System.out.println("You cant withdraw amount.");
        }
        else {
            System.out.println("Amount withdraw.");
            bal -= amount;
            System.out.println("Balance is: " + bal);
        }
    }
}
public class assignment3_2 {
    public static void main(String[] args) {
        Saving ashish = new Saving(101,1000,"Ashish");
        ashish.deposit(2500);
        ashish.withdraw(3490);
    }
}
