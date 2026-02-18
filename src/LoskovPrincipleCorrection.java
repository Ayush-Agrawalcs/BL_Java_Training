import java.util.ArrayList;
import java.util.List;

interface Deposite{
     void deposite(double amount);
}
interface Withdraw{
    void withdraw(double amount);
}
class SavingAccount1 implements Withdraw,Deposite{
    double balance;
    SavingAccount1(){
        balance=0;
    }
    public void deposite(double amount){
        balance+=amount;
        System.out.println("Deposited "+amount + "int Savings Account. New Balance: "+ balance +" end ");
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("withdraw " + amount + "in saving Account. New Balance :" + balance);
        } else {
            System.out.println("Insufficient funds in saving Account");
        }
    }
}
class currentAccount1 implements Withdraw,Deposite{
    double balance;
    currentAccount1(){
        balance=0;
    }
    public void deposite(double amount){
        balance+=amount;
        System.out.println("Deposited "+amount + " in current Account. New Balance: "+ balance +" end ");
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("withdraw " + amount + "in current Account. New Balance :" + balance);
        } else {
            System.out.println("Insufficient funds in current Account");
        }
    }
}

class FixedAccount1 implements Deposite{
    double balance;
    FixedAccount1(){
        balance=0;
    }
    public void deposite(double amount){
        balance+=amount;
        System.out.println("Deposited "+amount + "in Fixed Account. New Balance: "+ balance +" end ");
    }
}


class BankClient1 {
    private List<Deposite> depositAccounts;
    private List<Withdraw> withdrawAccounts;

    BankClient1(List<Deposite> depositAccounts, List<Withdraw> withdrawAccounts) {
        this.depositAccounts = depositAccounts;
        this.withdrawAccounts = withdrawAccounts;
    }

    void processDeposits() {
        for (Deposite d : depositAccounts) {
            d.deposite(1000);
        }
    }

    void processWithdrawals() {
        for (Withdraw w : withdrawAccounts) {
            w.withdraw(500);
        }
    }
}

public class LoskovPrincipleCorrection {
    public static void main(String[] args) {
        SavingAccount1 sa=new SavingAccount1();
        FixedAccount1 fa=new FixedAccount1();
        currentAccount1  ca=new currentAccount1();

        List<Deposite> deposits = List.of(sa, ca, fa);
        List<Withdraw> withdrawals = List.of(sa, ca);
        BankClient1 ba=new BankClient1(deposits,withdrawals);
        ba.processDeposits();
        ba.processWithdrawals();
    }
}
