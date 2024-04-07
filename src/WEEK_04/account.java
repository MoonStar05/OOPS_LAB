package WEEK_04;
import java.util.*;
class transaction{
    private int accountno;
    private int balance;
    public transaction(int accountno,int balance){
        this.accountno=accountno;
        this.balance=balance;
    }
    public void withdraw(int amount){
        if(amount<0){
            throw new IllegalArgumentException("Invalid amount");
        }
        if(amount>balance){
            throw new RuntimeException("Insufficient balance");
        }
        balance=balance-amount;
        System.out.println("Transaction successfull!\nRemaining blance: $" + balance);
    }
}
class account{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter amount ");
        try{
            transaction t=new transaction(12345,6000);
            try{
                int am=scanner.nextInt();
                t.withdraw(am);
            }
            catch(RuntimeException e){
                System.out.println(e.getMessage());
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        catch(Throwable th){
            System.out.println("unknown error occured");
        }
    }
}