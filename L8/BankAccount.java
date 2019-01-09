package l8q2;

public class BankAccount {
    private final String name;
    private final String icNum;
    private final String passportNum;
    private double amount;
    
    public BankAccount(String name, String icNum, String passportNum, double depositAmt){
        this.name = name;
        this.icNum = icNum;
        this.passportNum = passportNum;
        this.amount = depositAmt;
    }
    
    public void deposit(double depositAmt){
        this.amount+=depositAmt;
    }
    
    public void withdraw(double withdrawAmt){
        this.amount-=withdrawAmt;
    }
    
    public void balance(){
        System.out.printf("Balance: %-6.2f \n", amount);
    }
}
