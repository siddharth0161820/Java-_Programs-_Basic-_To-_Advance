package in.Siddharth.Challenge78;

 class BankAccount { //class as default

    //1> INSTANCE VARIABLE
    private String accountNumber;
    private String accountHolder;
    private double  accountBalance;

    /////////defining constructor////without accountbalance

     public BankAccount(String accountNumber, String accountHolder) {
         this.accountNumber = accountNumber;
         this.accountHolder = accountHolder;
     }
////////////////////////constructor//////////////////////////
     //2>  provide public method for deposit and withdraw amount
     public void depositeMoney(double money){
         //putting certain condtions for illegal deposit of money
         if(money<=0){
             System.out.println("Illegal deposit");
         }else{
             accountBalance+=money;
         }

     }

     public double withdrawMoney(double money){
         if (money<=0) {
             System.out.println("Illegal withdraw");

         } else if(accountBalance>=money){
             accountBalance-=money;
         }else{
                money=accountBalance;
             accountBalance=0;

         }
         return money;
     }
 }



