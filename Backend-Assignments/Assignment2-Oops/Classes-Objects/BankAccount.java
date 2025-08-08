public class BankAccount {
    int balance;
    BankAccount(int amount){
        this.balance = amount;
    }
    public void deposit(int amount){
        balance+=amount;
        System.out.println("  "+amount+" deposited successfully");
        checkBalance();
    }
    public void withdraw(int amount){
        if (balance > amount){
            balance-=amount;
            System.out.println("  "+amount+" withdraw successfully");
            checkBalance();
        }
        else{
            System.out.println("insufficient balance");
            checkBalance();
        }
    }
    public void checkBalance (){
        System.out.println("Balance is "+balance);
    }
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(5000);
        BankAccount account2 = new BankAccount(6000);
        BankAccount account3 = new BankAccount(8000);
        System.out.println("Dear Dileep : ");
        account1.deposit(2000);
        account1.withdraw(1000);
        System.out.println("Dear Naveen : ");
        account2.deposit(3000);
        account2.withdraw(2000);
        System.out.println("Dear Mahesh : ");
        account3.deposit(4000);
        account3.withdraw(1000);
    }
}

