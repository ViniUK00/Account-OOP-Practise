import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account() { // no-arg constructor that creates a default account.
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
    }

    public Account(int id, double balance) { // constructor that creates an account with the specified id and initial balance
        this.id = id;
        this.balance = balance;
        annualInterestRate = 0;
        dateCreated = new Date();
    }
    // accessor and mutator methods for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //  accessor and mutator methods for balance
    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //  accessor and mutator methods for annualInterestRate
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    // accessor method for dateCreated
    public Date getDateCreated() {
        return dateCreated;
    }

    // method named getMonthlyInterestRate() that returns the monthly interest rate
    public double getMonthlyInterestRate(){
        return annualInterestRate / 12;
    }

    // method named withdraw that withdraws a specified amount from the account.
    public double withdraw(double amount){
        return balance -= amount;
    }

    //  method named deposit that deposits a specified amount to the account.
    public double deposit(double amount) {
        return balance += amount;
    }

}

