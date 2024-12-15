package in.Siddharth.Challenge78;

public class Customer {
    public static void main(String[] args) {
        //1> Creating object for the class i.e. BankAccount
        //as its in the same package so impot of the package not requird here

        BankAccount myBankAccount = new BankAccount("222qqq","SUBHLAM");

        //CHECKING DIFFERENT DIFFERENT OPERATIONS for accountbalance i.e. not defined into constructor
        myBankAccount.depositeMoney(100.03);
        System.out.println(myBankAccount.withdrawMoney(200));
        myBankAccount.depositeMoney(-22);
        myBankAccount.withdrawMoney(0);

    }
             }

