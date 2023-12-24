class Account{
    int ac_no,age,bal;
    String name;
    Account(){
        ac_no = 101;
        age = 18;
        bal = 0;
        name = "User";
    }
     public void get_info(){
         System.out.println("Account number is: " + ac_no);
         System.out.println("Name is: " + name);
         System.out.println("Age is: " + age);
         System.out.println("Balance is: " + bal);

     }
}
public class assignment1_1 {
    public static void main(String[] args) {
    Account Ashish = new Account();
    Account Sandeep = new Account();
    Ashish.get_info();
    Sandeep.get_info();
    }
}
