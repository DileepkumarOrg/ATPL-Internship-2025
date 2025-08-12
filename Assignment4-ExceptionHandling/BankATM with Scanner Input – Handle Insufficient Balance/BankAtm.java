import java.util.Scanner;

public class BankAtm {
    int balance = 0;
    public void deposit(double amount){
        balance += amount;
    }

    public void getBalance(){
        System.out.println("Balance  : "+balance);
    }
    public void withdraw(double amount) throws InsufficientBalanceException{
        if (balance < amount){
            throw new InsufficientBalanceException("Insufficient balance...!");
        }
        System.out.println("Amount withdrawn");
        balance -= amount;
    }
    public static void main(String[] args)  {
        BankAtm bankObj = new BankAtm();
        Scanner scannerObj = new Scanner(System.in);
        boolean loop = true;
        while(loop){
            System.out.println("1. Deposit Amount\n2. Withdraw Amount\n3. Display\n4. Cancel");
            int choice = scannerObj.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter Amount to deposit : ");
                    int amount = scannerObj.nextInt();
                    bankObj.deposit(amount);
                    break;
                case 2:
                    System.out.println("Enter amount to withdraw : ");
                    int withdrawAmount = scannerObj.nextInt();
                    try{
                        bankObj.withdraw(withdrawAmount);
                    } catch(InsufficientBalanceException e){
                        System.out.println(e);
                    }
                    break;
                case 3:
                    bankObj.getBalance();
                    break;
                case 4:
                    loop = false;
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
        scannerObj.close();
    }
}

